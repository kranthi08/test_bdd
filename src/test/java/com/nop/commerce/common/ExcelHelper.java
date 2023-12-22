package com.nop.commerce.common;

import java.util.Map;
import java.util.TreeMap;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelHelper {

    private ExcelHelper() {}
    
    public synchronized static Map<String, String> getTestDataInMap(String testDataFile, String sheetName, String testCaseID) throws Exception
    {
	Connection conn = null;
	Recordset recordset = null;
	String query = null;
	
	Map<String, String> TestDataInMap = new TreeMap<String, String>();
	query = String.format("SELECT * FROM %s WHERE TestCaseId='%s'", sheetName, testCaseID);
	
	Fillo fillo = new Fillo();
	try {
	    conn = fillo.getConnection(testDataFile);
	    recordset = conn.executeQuery(query);
	    
	    while(recordset.next()) {
		for(String field: recordset.getFieldNames()) {
		    TestDataInMap.put(field, recordset.getField(field));
		}
	    }
	}catch(FilloException e) {
	    e.printStackTrace();
	    throw new Exception("Test Data cannot be found....");
	}
	
	conn.close();
	
	return TestDataInMap;
    }
    
    
    public synchronized static void updateIntoDataSheet(String testDataFile, String sheetName,
	    String testCaseID,  String fieldId, String feildValue) throws Exception
    {
	
	String query = null;
	
	query = String.format("UPDATE %s SET %s='%s' WHERE TESTCASEID='%s'", sheetName, fieldId, feildValue,
		testCaseID);
	
	System.out.println(" SQL to be used "  + query );
	
	Fillo fillo = new Fillo();
	Connection conn = null;
	
	try {
	    conn = fillo.getConnection(testDataFile);
	    conn.executeUpdate(query);
	}catch(FilloException e) {
	    e.printStackTrace();
	    throw new Exception("Test Data cannot be found....");
	}
	
	conn.close();	
    }

}
