Feature: Search and Place order for Products

Scenario: Search for a product in both Product and Offers page
Given User is on Greencart landing page
When User searched with short name "Tom" and extracted actual name of product
Then User goes and search for same shortname "Tom" in offers page to check if product exist

