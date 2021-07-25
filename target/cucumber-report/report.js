$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/features/mailtravel.feature");
formatter.feature({
  "line": 1,
  "name": "Mailtravel Booking journey",
  "description": "\r\nTo check that user should able to Booking successfully",
  "id": "mailtravel-booking-journey",
  "keyword": "Feature"
});
formatter.before({
  "duration": 35502964800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To check Homepage",
  "description": "Given\tuser is on MailTravel homepage and verify the title \"Tour Search | Mail Travel\"\r\nWhen\tuser enters \"India\" in the search box and click on the search button",
  "id": "mailtravel-booking-journey;to-check-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user is on the Products page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheProductsPage()"
});
formatter.result({
  "duration": 1371939500,
  "status": "passed"
});
formatter.after({
  "duration": 2812163700,
  "status": "passed"
});
});