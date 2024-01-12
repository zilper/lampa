Feature: Blog

  Background:
    Given User opens home page

  Scenario: Verify functionality of tabs
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

  Scenario: Verify 'Contact Us' input error messages on 'Contact Us' page
    When User clicks 'Contact Us' button on header component
    Then User sees 'Contact Us' page
    When User fills 'Your Name' input field with "Lampa"
    And User fills 'Message' input field with "Lampa"
    And User clicks 'Send' button on 'Contact Us' page
    Then User sees email input field error message
    And User sees phone number input field error message

  Scenario: Verify Contact Us flow
    When User clicks 'Contact Us' button on header component
    Then User sees 'Contact Us' page
    When User fills 'Your Name' input field with "Ivan"
    And User fills 'Your Email' input field with "zilper1903@gmail.com"
    And User fills 'Your Phone Number' input field with "380680000000"
    And User fills 'Message' input field with "Lampa"
    And User clicks 'Send' button on 'Contact Us' page
    And User sees the confirmation message "Thank you for contacting us!"

  Scenario: Verify Blog functionality
    When User clicks 'Blog' navigation button
    Then User sees 'Blog' page
    When User fills search input field with text "Ceatec 2023"
    And User opens Solutions dropdown menu on Blog Page
    And User selects Solutions dropdown menu option
    And User opens Services dropdown menu on Blog Page
    And User selects Services dropdown menu option
    Then User sees 'Tools' Blog filter button
    And User sees 'Web Development' Blog filter button

