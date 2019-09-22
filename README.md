Banner

# QA Solo Project - the Bag of Holding

## Index

[Project Brief](#brief)
   
[Architecture](#architecture)
   * [Entity Relationship Diagrams](#erd)
   * [Multi Tier Architechture Diagram](#mla)
     
[Front End Design](#FE)

[Testing](#testing)
   * [Mockito](#mockito)
   * [Selenium](#selenium)

[Improvements for the Future](#improve)

[Authors](#auth)

<a name="brief"></a>
## The Brief

To create an OOP-based application with utilisation of supporting tools, methodologies and technologies that encapsulate all core modules covered during training.

### Requirements & Constraints
CRUD functionality, at least 80% consistent backend test coverage reports and use of the following technologies:
*	Kanban Board: Trello or an equivalent Kanban Board
*	Database: h2
*	Programming language: Java (unless stated otherwise)
*	Front-end: HTML, CSS and JavaScript, possibly using a front-end library such as React
*	Unit Tests: JUnit and Mockito
*	Integration Tests: Selenium
*	Version Control: Git
*	CI Server: Jenkins
*	Cloud server: AWS, GCP or Azure virtual machine

### Solution

I decided to create a dice inventory system for personal or commercial use. It allows users to view a table of contents, add more entries, delete and update them.

Due to the nature of the application I have tried to make clear, simple but professional interface that would be fit for all environments. 

I HAVE TAKEN INTO CONSIDERATION THAT MY USERS MAY BE HARD OF SEEING, AS SUCH I HAVE IMPLEMENTED LABELS WHICH WILL ALLOWS SCREEN READERS TO MAKE THE WEBSITE ACCESSIBLE TO THEM.

<a name="architecture"></a>
## Architecture
<a name="erd"></a>
### Entity Relationship Diagrams (ERD)
#### Initial plan
![Initial ERD](/Documentation/ERD_Initial_Plan.jpg)

The initial plan for the ERD consisted of a lot more tables and entities than were produced in the final application. The tables are coloured based on how I had hoped to prioritise the features of the application, and therefore the order in which I would tackle them. Given the time constraints, I only managed to deliver two tables plus a join, as depicted below

#### Delivered solution
![Final ERD](/Documentation/ERD_Final.jpg)

As shown in this ERD, I ended up changing the focus of the initial tables. After building the first entity (poses), I concluded it made more sense to continue making a routine table first, encompassing a many-to-many relationship between the two. My reasoning was that it would make for a more interesting user experience to create routines from the poses, rather than arbitrarily add health benefits to each pose.

<a name="FE"></a>
## Front End Design
### Wireframes & Screenshot comparisons

Due to the amount of space it would have taken (dropdowns are not compatible with image display) please click the following link to see the [FrontEnd Github Repository.](https://github.com/Kanimi/theBagofHoldingFrontEnd)

<a name="testing"></a>
## Testing

JUnit, Mockito and Selenium tests have been used for automated testing, and Codacy for code analysis and refactoring.

<a name="report"></a>
### Report Screenshot

![Codacy Report](/Documentation/Codacy_Report "Codacy Report")

<a name="improve"></a>
## Improvements for the Future



<a name="depl"></a>
## Deployment

![Deployment Pipeline](/Documentation/CI_pipeline.jpg)

<a name="auth"></a>
## Authors

[Karolina Dudek](https://www.linkedin.com/in/karolina-dudek97/)