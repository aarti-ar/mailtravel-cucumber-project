Feature: MailTravel Booking journey



  Scenario: To check that user should able to Booking successfully

    Given	user is on MailTravel homepage and verify the title "Tour Search | Mail Travel"
    When	user enters "India" in the search box and click on the search button
    Then    user is on the Products page
    When	user click on the More Info button on the first result of the search result
    Then	user should navigate to the Incredible India
    And	    user should able to see days,price and telephone number displayed
    When	user click on the Book Online button from the page
    Then	user should see the selection of the first available date in calender with default values
    When    user click on the Continue One button
    Then	user is on the Accommodation section on the MailTravel Website
    And 	user selects a Standard Room one from the selection box
    And     user select a Two Adults option form the drop down
    When	user clicks on the Select Your Rooms And Continue
    And 	user should able to clicks on the Continue Without Extras Button
    Then	user should navigate to the Passenger Details section box
    When	user selects Title from the dropdown menu AdultOne and AdultTwo section
    And     user enters the details of Adult One
    And     user enters the details of the Adult Two
    And     user enters Lead Contact Details
    When	user clicks on the Continue Two button

#    Then 	user verify the payment amount as per the accommodation selected

#    And 	user enters LastName "Brand" in the Last Name box AdultOne section
#    And 	user selects Date of Birth from the drop down AdultOne section
#    And	    user selects Title from the dropdown menu AdultTwo section
#    And	    user enters FirstName "Oliviya" in the First Name box from the AdultTwo section
#    And	    user enters LastName "Brand" in the Last Name box AdultTwo section
#    And 	user selects Date of Birth from the drop down AdultTwo section
#    And	    user enters name "Oliver" in the Lead Contact Name field box
#    And     user enters Mobile Phone Number "077123456789" in the mobile field box
#    And 	user enters Email Address "oliver123@gmail.com"in the email field box
#    And	    user enters Address Line 1 "21 Portland "in the address filed box
#    And  	user enters Address Line 2 "Milton Street"in the address filed box
#    And  	user enters City "Watford"in the city field box
#    And 	user enters postcode "HA5 3YD "in the city field box
#    And	    user enters Country "United Kingdom"in the country field box
#    When	user clicks on the Continue button
#    Then 	user verify the payment amount as per the accommodation selected
