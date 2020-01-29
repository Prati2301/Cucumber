Feature: Register
@Data-Driven
Scenario: Register on TestMeApp
Given user open TestMeApp
When user click signup
And enter username as "Pratiksha"
And enter firstname as "Pratiksha"
And enter lastname as "Patil"
And enter password as "Pratiksha1"
And enter confirm password as "Pratiksha1"
And select gender as "female"
And enter email as "pratiksha@gmail.com"
And enter mobile number as "9999999998"
And enter DOB as "23/01/1996"
And enter address as "xyzabcwedjkgjhhhh"
And select security quetions as "What is your Birth Place?"
And enter the answer as "Dhanora"
Then user click on Register

@Login
Scenario: Register on TestMeApp
When user open TestMe
And user click SignIn
And user enters credentials as
|lalitha|Password123|
And user searches a product
And add product to cart
Then purchase succesfull




