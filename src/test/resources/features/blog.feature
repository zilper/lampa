Feature: Blog

  Scenario: Verify functionality of tabs
    Given User opens home page
    When User clicks 'About Us' navigation button
    Then User sees 'About Us' page
    When User clicks 'Cases' navigation button
    Then User sees 'Cases' page
    When User clicks 'Career' navigation button
    Then User sees 'Career' page
    When User clicks 'Blog' navigation button
    Then User sees 'Blog' page
    When User clicks 'Contacts' navigation button
    Then User sees 'Contact Us' page

