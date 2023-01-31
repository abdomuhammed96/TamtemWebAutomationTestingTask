Feature: Tamatem Test Cases
  
  Scenario: Verify Registration flow on Tamatem website
	When Click on element on Home Page ["Open Registration Page"]
    Then Register


  Scenario: Verify playing a game on Tamatem website
    When Click on element on Home Page ["Open Games Page"]
    Then Click on element on Home Page ["Open VIPTarneeb"]