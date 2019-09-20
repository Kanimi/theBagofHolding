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
### Entity Relationship Diagrams
#### Initial plan
![Initial ERD](/Documentation/ERD_Initial_Plan.jpg)

The initial plan for the ERD consisted of a lot more tables and entities than were produced in the final application. The tables are coloured based on how I had hoped to prioritise the features of the application, and therefore the order in which I would tackle them. Given the time constraints, I only managed to deliver two tables plus a join, as depicted below

#### Delivered solution
![Final ERD](/Documentation/ERD_Final.jpg)

As shown in this ERD, I ended up changing the focus of the initial tables. After building the first entity (poses), I concluded it made more sense to continue making a routine table first, encompassing a many-to-many relationship between the two. My reasoning was that it would make for a more interesting user experience to create routines from the poses, rather than arbitrarily add health benefits to each pose.

<a name="mla"></a>
### Multi Tier Architecture Diagram
Please click on the diagram for a high resolution version:
![MTA](/Documentation/MTA.jpg)

This is a very high-level architecture diagram to demonstrate the architecture of the application. It does not include getters and setters, test classes, or constants classes. 

<a name="FE"></a>
## Front End Design
### Wireframes & Screenshot comparisons

![Initial_Wireframe class=thumbnail](/Documentation/Initial_Wireframe.png "Initial Wireframe")

![Initial_Wireframe](/Documentation/Initial_Wireframe.png "Initial Wireframe")

![Login Wireframe](/Documentation/Login_Wireframe.png)
![Login Screenshot](/Documentation/Login_Screenshot.png)

![Registration Wireframe](/Documentation/Registration_Wireframe.png)
![Registration Screenshot](/Documentation/Registration_Screenshot.png)

![Home Wireframe](/Documentation/Home_Wireframe.png)
![Home Screenshot](/Documentation/Home_Screenshot.png)


<a name="testing"></a>
## Testing

JUnit, Mockito and Selenium
Codacy for refactoring

<a name="reports"></a>
### Report Screenshots

<a name="improve"></a>
## Improvements for the Future



<a name="depl"></a>
## Deployment

The build, test and deployment process was automated using Jenkins, with a webhook to GitHub which was triggered with every push event

This application can be deployed both locally and externally through a virtual machine. The constants.js file has commented out options to switch from an external to local IP address.

![Deployment Pipeline](/Documentation/CI_pipeline.jpg)

img[alt=thumbnail] {
   width:150px;
   height:100px;
}