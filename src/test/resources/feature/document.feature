Feature: My Project Document
  i am working on Amazon Project

  @amazon @uid 
  Scenario: Userid Test
    Given i open "chrome" and go to "https://www.amazon.in/"
    And i click signin 
    When I enter valid userid "paragguide@yahoo.co.in"
    And click continue button
    Then I shiould get password textbox
  
  @amazon @pwd
  Scenario: Password Test  
   Given userid is valid
   When i enter valid password "RMinfotech"
   Then i should login
 
  @amazon @search
  Scenario Outline: Search results
   Given i am logged in
   When i search <product>
   Then i get result
  
  Examples:
  |product|
  |sun glasses|
  |lcd|
  |mobile|
