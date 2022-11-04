Feature: AP Enquiry Form Field Validations

Scenario: Blank Form Submission Unsuccessful
Given user is on sanitization service page
When user clicks on enquire
Then user enquiry fails

Scenario: Invalid Name Input
Given user is on sanitization service page
When user inputs details with wrong name
| euwrh@$$%3424 | a@b.org | 7777777777 | 123456 |
And user clicks on enquire
Then user enquiry fails

Scenario: Invalid Email Input
Given user is on sanitization service page
When user inputs details with wrong email
| qwerty | aassddff | 7777777777 | 123456 |
And user clicks on enquire
Then user enquiry fails

Scenario: Invalid Mobile Input
Given user is on sanitization service page
When user inputs details with wrong mobile
| qwerty | a@b.org | 777$%asd | 123456 |
And user clicks on enquire
Then user enquiry fails

Scenario: Invalid Pin Input
Given user is on sanitization service page
When user inputs details with wrong pin
| qwerty | a@b.org | 7777777777 | 22 |
And user clicks on enquire
Then user enquiry fails