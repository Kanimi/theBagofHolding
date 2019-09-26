# QA Solo Project - the Bag of Holding


## Index

* [Project Brief](#brief)
   
* [Entity Relationship Diagrams](#ERD)
     
* [Front End Design](#FE)

* [Testing](#testing)

* [Improvements for the Future](#improve)

<a name="brief"></a>
## The Brief

To create an OOP-based application with utilisation of supporting tools, methodologies and technologies that encapsulate all core modules covered during training.

### Requirements & Constraints
CRUD functionality, at least 80% consistent backend test coverage reports and use of the following technologies:
* Kanban Board: Trello or an equivalent Kanban Board
* Database: h2
* Programming language: Java (unless stated otherwise)
* Front-end: HTML, CSS and JavaScript, possibly using a front-end library such as React
* Unit Tests: JUnit and Mockito
* Integration Tests: Selenium
* Version Control: Git
* CI Server: Jenkins
* Cloud server: AWS, GCP or Azure virtual machine

### Solution

I decided to create a dice inventory system for personal or commercial use. It allows users to view a table of contents, add more entries, delete and update them.

Due to the nature of the application I have tried to make clear, simple but professional interface that would be fit for all environments. 

<a name="architecture"></a>
## Architecture
<a name="ERD"></a>
### Entity Relationship Diagrams (ERD)

![Final ERD](/Documentation/ERD_Final.png "Final Entity Relationship Diagram")

As shown in this ERD, I ended up changing the focus of the initial tables. After building the first entity (poses), I concluded it made more sense to continue making a routine table first, encompassing a many-to-many relationship between the two. My reasoning was that it would make for a more interesting user experience to create routines from the poses, rather than arbitrarily add health benefits to each pose.

<a name="FE"></a>
## Front End Design
### Wireframes & Screenshot comparisons

Due to the amount of space it would have taken (dropdowns are not compatible with image display) please click the following link to see the [FrontEnd Github Repository.](https://github.com/Kanimi/theBagofHoldingFrontEnd)

<a name="testing"></a>
## Testing

JUnit, Mockito and Selenium tests have been used for automated testing, and Codacy for code analysis and refactoring.

![JUnit Report](/Documentation/JUnit_Report.png "JUnit Report")

Click here for screenshots on [Selenium Tests](https://github.com/Kanimi/theBagofHoldingSelenium)

<a name="improve"></a>
## Improvements for the Future

* Sortable tables 
    * Ability to filter dice by colour, material or type
    * Sort by amount of dice (highest to lower or vice versa)
* Implementation of Docker
* mySQL database rather than h2
* Labels on HTML for screen readers

<a name="depl"></a>
## Deployment

![Deployment Pipeline](/Documentation/CI_pipeline.png "Continuous Integration Pipeline")