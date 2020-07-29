Feature: To test yahoo sign up page functionalties

	@test
  Scenario: To test yahoo sign up fields with positivse scenarios
    And user enter firstname and lastname
    Then user enter emailid and password
    Then user enter phone number
    Then user select month of birth and enter day and year
    And user enter gender

  @test
  Scenario: To check validation messages on various fields
    When user enter emailid that is already created 
    When user enter weak password 
    When user enter alphabets in phone number field 
    Then validate all the error messages
