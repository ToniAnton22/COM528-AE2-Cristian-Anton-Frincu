# shopping Application program template

This is based upon the Shopping Cart Using Spring with Bootstrap in session 6



### To run using stand alone spring boot maven plugin

at base of project do a build
```
mvn clean install
```
move to web module and run project
```
cd web
mvn spring-boot:run
```
the project will be served at http://localhost:8080/index.html

### To run using stand alone cargo maven plugin

Alternatively you can use the cargo plugin
```
mvn cargo:run
```
then navigate to http://localhost:8080/shoppingCartApplication/


### To run the project using  in Netbeans embedded Tomcat server

If you right click on the webfacade-example1 project in netbeans and select 'run' netbeans will spin up a tomcat instance and launch your application.

If you are asked for username and password just use the default admin admin.
 
(You must make sure you have stopped any maven started tomcat before you do this.)

You will be able to see the application at http://localhost:8080/shoppingCartApplication/

Note that sometimes the browser caches the old index.html so you may need to enter the correct url to access the app

http://localhost:8080/shoppingCartApplication/home

not

http://localhost:8080/shoppingCartApplication/home.jsp

# System Requirements
The system requirements for this project is listed below 

- Java version 11 or newer.
- Apache Maven 3.8 or newer
- Tomcat 9
- Firefox
# Objective for this project 
The purpose of this project is to create a basic web-based catalogue and shopping cart system that allows users to search for items, add them to a shopping cart, and then purchase them.

## Admin point of view

This part shows the admin and user point of view

| Admin | Action | Response|
|------|--------|---------|
| 1 | Admin logs in using username = globaladmin password = globaladmin | Redirects to the admin side of the website | 
| 2 | Admin can view and modify users in the system| leads to a page that only administrators may access|
| 3 | Admin can modify orders | by adding items to the catalogue for the admin and user|
| 4 | Admin can remove users | Deletes the user from the system |
| 5 | Admin can see all the users orders| In the my orders page, the admin may see all of the orders.|

## User point of view

|User | Action | Response|
|------|--------|---------|
| 1 | User enters application Web address in web browser | Links back user to home page |
| 2 | The user must create an account or log in to the programme using username = user1234 password = user1234| the user is then taken to the home page
| 3 | The user can add products to their shopping cart using the add button| the item is then added to the shopping cart |
| 4 | Items in the basket or shopping cart can be removed by the user | Removes the item and removes the amount immediately|
| 5 | By tapping the pucharse button, the user can purchase the things | takes the user to the checkout |
| 6 | The right card information is entered by the user | The program verifies the credit card information and validates it
| 7 |If the user forgets to submit his or her credit card information | An error notice appears, informing the user that further information is required|
| 8 | If the user provides incorrect information| To correct the information, an error notice appears |
| 9 | If the user inputs the correct information | A verification notice will appear on the screen |
| 10 | The my orders page allows users to view their orders | its takes them to the order page where their orders have been choosen|
| 11 | about page tells you about the website | its takes them to the about page|
| 2 | contact page lets you contact the website | its takes them to the contact page, shows a form where you can fill in and send a message|

## User Tests

| Test | Action| Expected Reaction| Status |
| --------- | --------------------------- | -------------------------------- | ------ |
| 1 | User enters application Web address in web browser | Links back user to home page |pass  |
| 2 | The user can either log in or register for an account | either the user can successfully login or can't due to incorrect information  | pass  |
| 3 | the user can add any items to the shopping cart | the items gets added to shopping cart, which includes the price and total number | pass |
| 4 | the user can buy the items by going to the checkout page, see on the nav bar | taken to the checkout page | pass   |
| 5 | if the user submits with wrong card details | an error message will show up and the transaction is failed | fail |
| 6 | if the card details are correct | the payments gets accepted|  fail  |
| 7 | the user can see the items in the order page | shows the items and status whens its ordered | pass   |
| 8 | User can log out | takes them to home page | pass   |

## Admin Tests


| Test | Action| Expected Reaction| Status |
| --------- | --------------------------- | -------------------------------- | ------ |
| T1 | The application's host url is entered by the administrator. | admin will be taken to the home page | pass |
| T2 | Admin can log in | either the admin can successfully login or can't due to incorrect information| pass  |
| T3 | Admin has the power to modify the users| administrator will be able to add/remove users | pass   |
| T4 | Admin has the power to modify orders| administrator to remove/add items | fail  |
| T5 | Admin can see all the items the user has ordered | this is by pressing the orders link | pass | 
| T6 | Admin can log out |  takes them to the home page|  pass   |


robustness diagram

The following Robusteness diagram shows a use case's behaviour, including participant classes and software behaviour. This graphic shows a user buying a item from the catalog, then entering card details to buy the items. Also showing the admin side of things such as modifying the items and the user details. 

![image](https://user-images.githubusercontent.com/72074715/148404521-3a175ec0-a915-4078-ba44-94d0755a79b1.png)



sequence diagram


Sequence diagrams depict the interactions that must occur in order for a process to be completed. the diagram below shows the roles of each user which includes the user/customer, admin and also shows the importance of the cart.

![image](https://user-images.githubusercontent.com/72074715/148391788-b8d830e8-d0d2-475f-8953-211d2fbde74e.png)


use case diagram

A use case diagram shows us the interaction between the users/admins and the system by telling us what it's meant to do. The diagram below shows the use case for the user and admin, what there roles are within the application and how it connects together, for example the user can place the order and the admin can then modify.

![image](https://user-images.githubusercontent.com/72074715/148695846-58c79a6b-bcca-458a-8ec4-a1f779c1a454.png)


model diagram

The model diagram shows us the classes and relationships, how its connected to eachother within the system. which is simple version of the code, if you dont understand coding.

![image](https://user-images.githubusercontent.com/72074715/148697473-23f4ea7c-5c49-4a65-a64c-46856bdbaab9.png)
