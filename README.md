# bdddemotest

Feature: Search feature
Scenario Outline: Test search with valid data

Given I navigate to Service NSW homepage
When I click Find locations menu 
And I enter name location <locations>
And I click search button
Then I should be able to view filtered results <serviceNSWlocation>

 Examples:
 | locations | serviceNSWlocation |
 | Sydney 2000 | Wynyard Service Centre |
 | Sydney Domestic Airport 2020   | Rockdale Service Centre |
