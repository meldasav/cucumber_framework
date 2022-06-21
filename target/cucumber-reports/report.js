$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/google.feature");
formatter.feature({
  "name": "Google Search Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Google"
    }
  ]
});
formatter.scenario({
  "name": "Validate Google Search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Google"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.userNavigatesTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for \"Tesla\" on google",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should see \"Tesla\" in the url",
  "keyword": "Then "
});
formatter.match({
  "location": "BaseSteps.user_should_see_in_the_url(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see \"Tesla\" in the title",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.user_should_see_in_the_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Google Search results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Google"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.userNavigatesTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for \"Apple\" on google",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should see results are more than 500000",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSteps.userShouldSeeResultsAreMoreThan(long)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});