package com.mailtravel.pages;

import com.mailtravel.utility.Util;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class MailTravelPage extends Util {

    //Page Object

    By title = By.xpath("//div[contains(@title,'Mail Travel Home Page')]");//title of the page
    By searchField = By.xpath("//input[@id='searchtext_freetext_search_form']");//search field locator
    By searchBtn = By.xpath("//button[@disabled='disabled']//div[@class='nbf_button'][contains(text(),'Search for your dream holiday or enter a holiday c')]");////div[@class='nbf_button']
    By moreInfoBtn_1 = By.id("iterator_1_product_custom_more-info-button");//MorinfoBtn
    By incredibleIndiaPage = By.xpath("//h1[normalize-space()='Incredible India']");//To check that page
    By tenDays = By.xpath("//span[@id='price-pin_days-num-01']");
    By price = By.xpath("//span[normalize-space()='£1,045']");
    By telephone = By.xpath("//a[contains(.,'0808 239 1460')]");
    By bookOnLineButton = By.xpath("//button[@name='enterbookingflow']");//click on 'Book Online'button
    By defaultBookDate = By.xpath("//div[contains(text(),'28')]");//default date
    By continueBtn = By.xpath("//div[contains(text(),'Continue')]");//click on continue button
    By accommodationSection = By.xpath("//h2[normalize-space()='3. Accommodation']");//accomodation section
    By standardRoom = By.xpath("//select[@id='room-0-numselect']");//standard room selecting 1
    By adultsTwo = By.xpath("//select[@id='room-0-1-adults']");//selecting Two from the drop down
    By selectYourRoomAndContBtn = By.xpath("//div[contains(text(),'Select your room and continue')]");//click on select your room and continue
    By continueWithoutExtraBtn = By.xpath("//div[contains(text(),'Continue without extras')]");//click on continue without Extra button
    By passengerDetails = By.xpath("//h2[normalize-space()='5. Passenger Details']");//to verify customer landed to passenger details section successfully

    //Adult One
    By titleAdultOne= By.xpath("//select[@id='pax-a-title-1']");//selecting Mr
    By firstNameAdultOne=By.xpath("//input[@id='pax-a-first-1']");//firstname
    By latNameAdultOne=By.xpath("//input[@id='pax-a-last-1']");//lastname
    By dateOfBirthDayOne=By.xpath("//select[@id='pax-a-dobd-1']");//day
    By dateOfBirthMonthOne=By.xpath("//select[@id='pax-a-dobm-1']");//month
    By dateOfBirthYearOne=By.xpath("//select[@id='pax-a-doby-1']");//year
    //Adult Two
    By titleAdultTwo=By.xpath("//select[@id='pax-a-title-2']");//select title
    By firstNameAdultTwo=By.xpath("//input[@id='pax-a-first-2']");//first name
    By latNameAdultTwo=By.xpath("//input[@id='pax-a-last-2']");//last name
    By dateOfBirthDayTwo=By.xpath("//select[@id='pax-a-dobd-2']");//day
    By dateOfBirthMonthTwo=By.xpath("//select[@id='pax-a-dobm-2']");//month
    By dateOfBirthYearTwo=By.xpath("//select[@id='pax-a-doby-2']");//year
    //Lead Contact Details
    By contactName=By.xpath("//input[@id='contact-name']");
    By mobileNum=By.xpath("//input[@id='contact-mobile']");
    By emailAdd=By.xpath("//input[@id='contact-email']");
    By addressLine1=By.xpath("//input[@id='contact-address1']");
    By addressLine2=By.xpath("//input[@id='contact-address2']");
    By city=By.xpath("//input[@id='contact-city']");
    By postCode=By.xpath("//input[@id='contact-postcode']");
    By country=By.xpath("//select[@id='contact-country']");
    By subTotal=By.xpath("//span[normalize-space()='£2,526']");
    By continueTwoBtn=By.xpath("//button[@class='nbf_button nbf_tpl_pms_button']");
    By fullPaymentAmount=By.xpath("//span[contains(text(),'£2,481')]");



    public String getHomePageTitle() {
//        String title="Tour Search | Mail Travel";
        return driver.getTitle();//returns the title of the page
    }

    public void enterCountryName(String India) {
        driver.findElement(searchField).sendKeys(India);
    }

    public void clickOnSearchBtn() {
        driver.findElement(searchBtn).click();
    }
    public String InCredibleIndia() {
        //return driver.findElement(incredibleIndiaPage).getText();
        return getTextFromElement(incredibleIndiaPage);
    }

    public void clickOnMoreInfoBtn() {
        driver.findElement(moreInfoBtn_1).click();
    }

    public void userShouldSeeDaysPriceTelephoneNumberDisplayed() {
        verifyThatTextIsDisplayed(tenDays, "10");
        verifyThatTextIsDisplayed(price, "£1,045");
        verifyThatTextIsDisplayed(telephone, "0808 239 1460");
    }

    public void clickOnBookOnlineButton() {
        driver.findElement(bookOnLineButton).click();
    }

    public void firstAvailableDateInCalenderSelectedADefaultValue() {
        verifyThatTextIsDisplayed(defaultBookDate, "28");
    }

    public void clickOnContinueButton() {
        driver.findElement(continueBtn).click();
    }

    public String AccommodationSection() {
        return getTextFromElement(accommodationSection);

    }

    public void selectingStandardRoom() {
        selectByIndexFromDropDown(standardRoom, 1);
    }

    public void selectingTwoAdultsRoom() {
        selectByValueFromDropDown(adultsTwo, "2 adults");
    }

    public void clickOnSelectYourRoomAndContinueButton() {
        driver.findElement(selectYourRoomAndContBtn).click();
    }

    public void clickOnContinueWithoutExtrasBtn() {
        driver.findElement(continueWithoutExtraBtn).click();
    }

    public String PassengerDetailsSection() {
        return getTextFromElement(passengerDetails);

    }
    //Adult One
    public void selectTitleFromTheDropDown(){
        selectByValueFromDropDown(titleAdultOne,"Mr");
    }
    public void enterAdultOneFNameAndLNameAndDOB(String fName1,String lName1,String day1,String month1,String year1) {
        sendTextToElement(firstNameAdultOne, fName1);
        sendTextToElement(latNameAdultOne, lName1);
        selectByValueFromDropDown(dateOfBirthDayOne,day1);
        selectByValueFromDropDown(dateOfBirthMonthOne,month1);
        selectByValueFromDropDown(dateOfBirthYearOne,year1);
    }
    //Adult Two
    public void selectTitleFromTheDropDownTwo(){
        selectByValueFromDropDown(titleAdultTwo,"Mrs");
    }
    public void enterAdultTwoFNameAndLNameAndDOB(String fNameTwo,String lNameTwo,String dayT,String monthT,String yearT){//Given Parameters here
        sendTextToElement(firstNameAdultTwo,fNameTwo);
        sendTextToElement(latNameAdultTwo,lNameTwo);
        selectByValueFromDropDown(dateOfBirthDayTwo,dayT);
        selectByValueFromDropDown(dateOfBirthMonthTwo,monthT);
        selectByValueFromDropDown(dateOfBirthYearTwo,yearT);
    }

    //Lead Contact details
    public void enterNameInTheLeadContactDetailsField(){//HardCoded here with Values
        sendTextToElement(contactName,"Oliver");
        sendTextToElement(mobileNum,"077123456789");
        sendTextToElement(emailAdd,"oliver123@gmail.com");
        sendTextToElement(addressLine1,"21 Portland");
        sendTextToElement(addressLine2,"Milton Street");
        sendTextToElement(city,"Watford");
        sendTextToElement(postCode,"HA5 3YD");
        selectByValueFromDropDown(country,"United Kingdom");

    }
    public void clickOnContinueTwoBtn(){
        driver.findElement(continueTwoBtn).click();

    }
    public void verifyPaymentAmountAsPerTheAccommodationSelected(){
        driver.findElement(fullPaymentAmount).isSelected();
        //System.out.println(driver.findElement(accommodationSection).isDisplayed());
    }
//    public void enterMobileNumber(String phone){
//        sendTextToElement(mobileNum,phone);
//    }
//    public void enterEmailAddress(String email){
//        sendTextToElement(emailAdd,email);
//    }
//    public void enterAddressLineFirst(String addressFirstLine){
//        sendTextToElement(addressLine1,addressFirstLine);
//    }
//    public void enterAddressLineTwo(String addressSecondLine){
//        sendTextToElement(addressLine2,addressSecondLine);
//    }
//    public void enterCity(String _city){
//        sendTextToElement(city,_city);
//    }
//    public void enterPostCode(String _postCode){
//        sendTextToElement(postCode,_postCode);
//    }
//    public void selectCountryFromTheDropDown(String _country){
//        selectByValueFromDropDown(country,_country);
//    }
//    public void clickOnContinueButton(){
//        clickOnElement(continueButton);
//    }



}
