Feature: Google Search Functionality

  @Regression @Google
  Scenario: Validate Google Search
    Given user navigates to "https://www.google.com/"
    When  user searches for "Tesla" on google
    Then  user should see "Tesla" in the url
    And user should see "Tesla" in the title

   @Smoke  @Google @Functional
  Scenario: Validate Google Search results
    Given   user navigates to "https://www.google.com/"
    When    user searches for "Apple" on google
    Then    user should see results are more than 500000
