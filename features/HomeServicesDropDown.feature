Feature: AP Home Services Module Drop-down Links

Scenario Outline: Navigations successful
Given user is on home page
When user clicks on links in services menu
Then user is redirected to "<titles>"

Examples:
  | titles |
  | Services Designed for your Home Paint Solutions - Asian Paints |
  | Asian Paints Interior Design - Home Interior Design Beautiful Homes Service by Design Experts |
  | Safe Home Painting Services, Sanitization & Disinfection - Asian Paints |
  | San Assure: Sanitization & Disinfection Services by Asian Paints |
  | Wood Solutions & Service with Full Home Sanitization - Asian Paints |
  | Waterproofing Solutions & Service for Damp Walls & Patches - Asian Paints |