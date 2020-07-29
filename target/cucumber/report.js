$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:resources/YahooSignUp.feature");
formatter.feature({
  "name": "To test yahoo sign up page functionalties",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test yahoo sign up fields with positivse scenarios",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter firstname and lastname",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.YahooSignUp.user_enter_firstname_and_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter emailid and password",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.YahooSignUp.user_enter_emailid_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter phone number",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.YahooSignUp.user_enter_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select month of birth and enter day and year",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.YahooSignUp.user_select_month_of_birth_and_enter_day_and_year()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter gender",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.YahooSignUp.user_enter_gender()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To check validation messages on various fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter emailid that is already created",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdef.YahooSignUp.user_enter_emailid_that_is_already_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter weak password",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdef.YahooSignUp.user_enter_weak_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter alphabets in phone number field",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdef.YahooSignUp.user_enter_alphabets_in_phone_number_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate all the error messages",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.YahooSignUp.validate_all_the_error_messages()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});