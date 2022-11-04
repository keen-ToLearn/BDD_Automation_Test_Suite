Feature: AP Enquiry Form

Scenario Outline: Enquiry Form Submission Successful
Given user is on wood solutions page
When user enters name
And user enters email
And user enters mobile
And user enters pincode
And user clicks on enquire button
Then user sees submit success page

When user clicks on download brochure button
And user enters "<phone>"
And user clicks on login button
Then user sees brochure window

Examples:
  | phone |
  | 9702508295 |
  | 9702508295 |
  | 9702508295 |
  | 9702508295 |