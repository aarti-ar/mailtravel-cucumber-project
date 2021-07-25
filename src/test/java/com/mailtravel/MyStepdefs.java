package com.mailtravel;

import com.mailtravel.pages.MailTravelPage;
import cucumber.api.java.en.And;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
//
//    //    @Given("^user is on MailTravel homepage and verify the title {string}$")
////    public void userIsOnMailTravelHomepageAndVerifyTheTitle(String arg0) {
////        String expectedTitle = "Home Page | Mail Travel";
////        String actualTitle = new MailTravelPage().getHomePageTitle();
////        Assert.assertEquals(actualTitle, expectedTitle);
////    }
////
////    @When("^user enters {string} in the search box and click on the search button$")
////    public void userEntersInTheSearchBoxAndClickOnTheSearchButton(String India) {
////        new MailTravelPage().enterCountryName(India);
////        new MailTravelPage().clickOnSearchBtn();
////    }
//    @Given("user is on MailTravel homepage and verify the title {string}")
//    public void userIsOnMailTravelHomepageAndVerifyTheTitle(String arg0) {
//        System.out.println("UserIsOnMailTravelHomepageAndVerifyTheTitle");
//        String expectedTitle = "Home Page | Mail Travel";
//        String actualTitle = new MailTravelPage().getHomePageTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);
//    }
//
//    @When("user enters {string} in the search box and click on the search button")
//    public void userEntersInTheSearchBoxAndClickOnTheSearchButton(String India) {
//        System.out.println("UserEntersInTheSearchBoxAndClickOnTheSearchButton");
//        new MailTravelPage().enterCountryName(India);
//        new MailTravelPage().clickOnSearchBtn();
//    }
//
//    @Then("^user is on the Products page$")
//    public void userIsOnTheProductsPage() {
//        System.out.println("UserIsOnTheProductsPage");
//
//    }
//
//    @When("^user click on the More Info button on the first result of the search result$")
//    public void userClickOnTheMoreInfoButtonOnTheFirstResultOfTheSearchResult() {
//        System.out.println("UserClickOnTheMoreInfoButtonOnTheFirstResultOfTheSearchResult");
//        new MailTravelPage().clickOnMoreInfoBtn();
//    }
//
//    @Then("^user should navigate to the Incredible India$")
//    public void userShouldNavigateToTheIncredibleIndia() {
//        System.out.println("UserShouldNavigateToTheIncredibleIndia");
//        String expectedValue = new MailTravelPage().InCredibleIndia();
//        Assert.assertEquals(expectedValue, "Incredible India");
//    }
//
//    @And("^user should able to see days,price and telephone number displayed$")
//    public void userShouldAbleToSeeDaysPriceAndTelephoneNumberDisplayed() {
//        System.out.println("UserShouldAbleToSeeDaysPriceAndTelephoneNumberDisplayed");
//        new MailTravelPage().userShouldSeeDaysPriceTelephoneNumberDisplayed();
//
//    }
//
//    @When("^user click on the Book Online button from the page$")
//    public void userClickOnTheBookOnlineButtonFromThePage() {
//        System.out.println("UserClickOnTheBookOnlineButtonFromThePage");
//        new MailTravelPage().clickOnBookOnlineButton();
//    }
//
//    @Then("^user should see the selection of the first available date in calender with default values$")
//    public void userShouldSeeTheSelectionOfTheFirstAvailableDateInCalenderWithDefaultValues() {
//        System.out.println("UserShouldSeeTheSelectionOfTheFirstAvailableDateInCalenderWithDefaultValues");
//        new MailTravelPage().firstAvailableDateInCalenderSelectedADefaultValue();
//    }
//
//    @When("^user click on the Continue One button$")
//    public void userClickOnTheContinueOneButton() {
//        System.out.println("UserClickOnTheContinueOneButton");
//        new MailTravelPage().clickOnContinueButton();
//    }
//
//    @Then("^user is on the Accommodation section on the MailTravel Website$")
//    public void userIsOnTheAccommodationSectionOnTheMailTravelWebsite() {
//        System.out.println("UserIsOnTheAccommodationSectionOnTheMailTravelWebsite");
//        String expectedValue = new MailTravelPage().AccommodationSection();
//        Assert.assertEquals(expectedValue, "Accommodation");
//    }
//
//    @And("^user selects a Standard Room one from the selection box$")
//    public void userSelectsAStandardRoomOneFromTheSectionBox() {
//        System.out.println("UserSelectsAStandardRoomOneFromTheSectionBox");
//        new MailTravelPage().selectingStandardRoom();
//
//    }
//
//    @And("^user select a Two Adults option form the drop down$")
//    public void userSelectATwoAdultsOptionFormTheDropDown() {
//        System.out.println("UserSelectATwoAdultsOptionFormTheDropDown");
//        new MailTravelPage().selectingTwoAdultsRoom();
//    }
//
//    @When("^user clicks on the Select Your Rooms And Continue$")
//    public void userClicksOnTheSelectYourRoomsAndContinue() {
//        System.out.println("UserClicksOnTheSelectYourRoomsAndContinue");
//        new MailTravelPage().clickOnSelectYourRoomAndContinueButton();
//    }
//
//    @And("^user should able to clicks on the Continue Without Extras Button$")
//    public void userShouldAbleToClicksOnTheContinueWithoutExtrasButton() {
//        System.out.println("UserShouldAbleToClicksOnTheContinueWithoutExtrasButton");
//        new MailTravelPage().clickOnContinueWithoutExtrasBtn();
//    }
//
//    @Then("^user should navigate to the Passenger Details section box$")
//    public void userShouldNavigateToThePassengerDetailsSectionBox() {
//        System.out.println("UserShouldNavigateToThePassengerDetailsSectionBox");
//        String expectedValue = new MailTravelPage().PassengerDetailsSection();
//        Assert.assertEquals(expectedValue, "Passenger Details");
//    }
//
//    @When("^user selects Title from the dropdown menu AdultOne and AdultTwo section$")
//    public void userSelectsTitleFromTheDropdownMenuAdultOneSection() {
//        System.out.println("UserSelectsTitleFromTheDropdownMenuAdultOneSection");
//        new MailTravelPage().selectTitleFromTheDropDown();
//        new MailTravelPage().selectTitleFromTheDropDownTwo();
//    }
//
//    @And("^user enters the details of Adult One$")
//    public void userEntersTheDetailsOfAdultOne() {
//        System.out.println("UserEntersTheDetailsOfAdultOne");
//        new MailTravelPage().enterAdultOneFNameAndLNameAndDOB("Oliver", "Brand", "20", "January", "1980");
//    }
//
//    @And("^user enters the details of the Adult Two$")
//    public void userEntersTheDetailsOfTheAdultTwo() {
//        System.out.println("UserEntersTheDetailsOfTheAdultTwo");
//        new MailTravelPage().enterAdultTwoFNameAndLNameAndDOB("Oliviya", "Brand", "21", "February", "1985");
//    }
//
//    @And("^user enters Lead Contact Details$")
//    public void userEntersLeadContactDetails() {
//        System.out.println("UserEntersLeadContactDetails");
//        new MailTravelPage().enterNameInTheLeadContactDetailsField();
//    }
//
//    @When("^user clicks on the Continue Two button$")
//    public void userClicksOnTheContinueTwoButton() {
//        System.out.println("UserClicksOnTheContinueTwoButton");
//        new MailTravelPage().clickOnContinueTwoBtn();
//
//    }
//
//    @Then("^user verify the payment amount as per the accommodation selected$")
//    public void userVerifyThePaymentAmountAsPerTheAccommodationSelected() {
//        System.out.println("UserVerifyThePaymentAmountAsPerTheAccommodationSelected");
//
//    }
//

}
