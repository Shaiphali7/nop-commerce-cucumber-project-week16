Feature: Computer Page Test
  As a user I want to navigate to the Computer and product page and also able to add item in the cart successfully
  @smoke
  Scenario: User should able to navigate successfully to Computer page
    Given I am in home page
    When I clicked on Computer in top menu
    Then verify that I am in computer page
@sanity
  Scenario: User should able to navigate successfully to Desktop page
    Given I am in home page
    When I clicked on Computer in top menu
    And I clicked on Desktop
    Then verify that I am in Desktop page
@regression
  Scenario Outline: User should able to build own computer and add it to the cart successfully
    Given I am in home page
    When I clicked on Computer in top menu
    And I clicked on Desktop
    And I clicked on product build your own computer
    And I select ProcessRam "<processor>" "<ram>"
    And I select hdd "<hdd>"
    And I select os"<os>"
    And I select software"<software>"
    And I clicked on Add to cart button
    Then verify that item is added successfully to the cart
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |
