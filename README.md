bdddemotest

Feature: Search feature<br />
Scenario Outline: Test search with valid data<br />

Given I navigate to Service NSW homepage<br />
When I click Find locations menu <br />
And I enter name location <locations><br />
And I click search button<br />
Then I should be able to view filtered results <serviceNSWlocation><br />

 Examples:<br /><br />
 | locations | serviceNSWlocation |<br />
 | Sydney 2000 | Wynyard Service Centre |<br />
 | Sydney Domestic Airport 2020   | Rockdale Service Centre |<br />
