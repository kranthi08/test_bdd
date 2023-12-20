$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the functionality of Orange HRM Application",
  "description": "      In Order to test the SignOn functionality of Orange HRM application\n      As a Tester \n      I need the required URL and Credentials",
  "id": "verify-the-functionality-of-orange-hrm-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Verify SignIn functionality with credentials",
  "description": "",
  "id": "verify-the-functionality-of-orange-hrm-application;verify-signin-functionality-with-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "The user is in OrangeHRM application",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#\t  When he login into application with valid credentials"
    },
    {
      "line": 13,
      "value": "#\t  \t| User_Name   | Password   |"
    },
    {
      "line": 14,
      "value": "#\t  \t| \u003cUser_Name\u003e | \u003cPassword\u003e |"
    }
  ],
  "line": 15,
  "name": "He input the LoginName into Login Name field",
  "rows": [
    {
      "cells": [
        "User_Name",
        "\u003cUser_Name\u003e"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "He input required password into Password field",
  "rows": [
    {
      "cells": [
        "Password",
        "\u003cPassword\u003e"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Application Navigates to Employee Information Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "verify-the-functionality-of-orange-hrm-application;verify-signin-functionality-with-credentials;",
  "rows": [
    {
      "cells": [
        "User_Name",
        "Password"
      ],
      "line": 23,
      "id": "verify-the-functionality-of-orange-hrm-application;verify-signin-functionality-with-credentials;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 24,
      "id": "verify-the-functionality-of-orange-hrm-application;verify-signin-functionality-with-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7916593700,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User Launch the required OrangeHRM URL",
  "keyword": "When "
});
formatter.match({
  "location": "orangeHRM_LoginPageStepDef.user_Launch_the_required_OrangeHRM_URL()"
});
formatter.result({
  "duration": 147653000,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Verify SignIn functionality with credentials",
  "description": "",
  "id": "verify-the-functionality-of-orange-hrm-application;verify-signin-functionality-with-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "The user is in OrangeHRM application",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#\t  When he login into application with valid credentials"
    },
    {
      "line": 13,
      "value": "#\t  \t| User_Name   | Password   |"
    },
    {
      "line": 14,
      "value": "#\t  \t| \u003cUser_Name\u003e | \u003cPassword\u003e |"
    }
  ],
  "line": 15,
  "name": "He input the LoginName into Login Name field",
  "matchedColumns": [
    0
  ],
  "rows": [
    {
      "cells": [
        "User_Name",
        "Admin"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "He input required password into Password field",
  "matchedColumns": [
    1
  ],
  "rows": [
    {
      "cells": [
        "Password",
        "admin123"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Application Navigates to Employee Information Page",
  "keyword": "Then "
});
formatter.match({
  "location": "orangeHRM_LoginPageStepDef.the_user_is_in_OrangeHRM_application()"
});
formatter.result({
  "duration": 34670300,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRM_LoginPageStepDef.he_input_the_LoginName_into_Login_Name_field(String,String\u003e)"
});
formatter.result({
  "duration": 263915400,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRM_LoginPageStepDef.he_input_required_password_into_Password_field(String,String\u003e)"
});
formatter.result({
  "duration": 117500800,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRM_LoginPageStepDef.click_on_Login_button()"
});
formatter.result({
  "duration": 8157250900,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRM_LoginPageStepDef.application_Navigates_to_Employee_Information_Page()"
});
formatter.result({
  "duration": 58200,
  "status": "passed"
});
formatter.write("Completed Scenario");
formatter.after({
  "duration": 682500,
  "status": "passed"
});
});