$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "To verify login functionality",
  "description": "",
  "id": "to-verify-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 2610016053,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User move to signIn page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is at home page \"https://www.carsguide.com.au/\" of cars guide website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on signUp signIn button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on signIn link",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_is_at_home_page_of_cars_guide_website(String)"
});
formatter.result({
  "duration": 30396499582,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_signUp_signIn_button()"
});
formatter.result({
  "duration": 4248462884,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_signIn_link()"
});
formatter.result({
  "duration": 342816739,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify user is able to login with correct credentials",
  "description": "",
  "id": "to-verify-login-functionality;verify-user-is-able-to-login-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@login-positive"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter email \"admin@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enter password \"1 Series\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click submit",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should be able to successfully login",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin@gmail.com",
      "offset": 18
    }
  ],
  "location": "StepDefinition.user_enter_email(String)"
});
formatter.result({
  "duration": 281055093,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 21
    }
  ],
  "location": "StepDefinition.user_enter_password(String)"
});
formatter.result({
  "duration": 213490554,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_submit()"
});
formatter.result({
  "duration": 156252109,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_successfully_login()"
});
formatter.result({
  "duration": 2122849427,
  "error_message": "java.lang.AssertionError: Login failed\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat Steps.StepDefinition.user_should_be_able_to_successfully_login(StepDefinition.java:133)\r\n\tat ✽.Then user should be able to successfully login(Login.feature:14)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3459961005,
  "status": "passed"
});
formatter.before({
  "duration": 1674934274,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User move to signIn page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is at home page \"https://www.carsguide.com.au/\" of cars guide website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on signUp signIn button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on signIn link",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_is_at_home_page_of_cars_guide_website(String)"
});
formatter.result({
  "duration": 13136380694,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_signUp_signIn_button()"
});
formatter.result({
  "duration": 3905576491,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_signIn_link()"
});
formatter.result({
  "duration": 178742845,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify user can not login with invalid credentials",
  "description": "",
  "id": "to-verify-login-functionality;verify-user-can-not-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@login-negative"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user enter email \"xyz@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user enter password \"cars24\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click submit",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "message should be displayed \"Wrong email or password\" and user can not login",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "xyz@gmail.com",
      "offset": 18
    }
  ],
  "location": "StepDefinition.user_enter_email(String)"
});
formatter.result({
  "duration": 333037078,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cars24",
      "offset": 21
    }
  ],
  "location": "StepDefinition.user_enter_password(String)"
});
formatter.result({
  "duration": 165934038,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_submit()"
});
formatter.result({
  "duration": 113243093,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wrong email or password",
      "offset": 29
    }
  ],
  "location": "StepDefinition.message_should_be_displayed_and_user_can_not_login(String)"
});
formatter.result({
  "duration": 2111963939,
  "status": "passed"
});
formatter.after({
  "duration": 4100690765,
  "status": "passed"
});
formatter.uri("searchCars.feature");
formatter.feature({
  "line": 2,
  "name": "To verify working of search cars page",
  "description": "I want to use this template for my feature file",
  "id": "to-verify-working-of-search-cars-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 1487707120,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify search cars page",
  "description": "",
  "id": "to-verify-working-of-search-cars-page;verify-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@search-cars-positive"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is at home page \"https://www.carsguide.com.au/\" of cars guide website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user move to menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 9
    },
    {
      "cells": [
        "buy + sell"
      ],
      "line": 10
    },
    {
      "cells": [
        "Search Cars"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select \"BMW\" from anyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "select \"1 Series\" from Any Model dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select \"NSW - Sydney\" from Location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select \"$10,000\" from Price(Max) dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on Find_my_next_car button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "search results should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "page title should be \"Bmw 1 Series Under 10000 for Sale Sydney NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 22
    }
  ],
  "location": "StepDefinition.user_is_at_home_page_of_cars_guide_website(String)"
});
formatter.result({
  "duration": 9869785590,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_move_to_menu(String\u003e)"
});
formatter.result({
  "duration": 1193396677,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "StepDefinition.click_on_link(String)"
});
formatter.result({
  "duration": 7363884694,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 8
    }
  ],
  "location": "StepDefinition.select_from_anyMake_dropdown(String)"
});
formatter.result({
  "duration": 1074814512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 8
    }
  ],
  "location": "StepDefinition.select_from_Any_Model_dropdown(String)"
});
formatter.result({
  "duration": 783362590,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NSW - Sydney",
      "offset": 8
    }
  ],
  "location": "StepDefinition.select_from_Location_dropdown(String)"
});
formatter.result({
  "duration": 188794103,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$10,000",
      "offset": 8
    }
  ],
  "location": "StepDefinition.select_from_Price_Max_dropdown(String)"
});
formatter.result({
  "duration": 189451767,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_Find_my_next_car_button()"
});
formatter.result({
  "duration": 9229712415,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.search_results_should_be_displayed()"
});
formatter.result({
  "duration": 332449067,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 10000 for Sale Sydney NSW | carsguide",
      "offset": 22
    }
  ],
  "location": "StepDefinition.page_title_should_be(String)"
});
formatter.result({
  "duration": 15700265,
  "status": "passed"
});
formatter.after({
  "duration": 2019087940,
  "status": "passed"
});
});