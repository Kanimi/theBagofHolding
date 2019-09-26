# QA Solo Project - the Bag of Holding
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/8bd1cb7d793f4b0181804f256cb2fa47)](https://www.codacy.com/manual/Kanimi/theBagofHoldingBackEnd?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Kanimi/theBagofHoldingBackEnd&amp;utm_campaign=Badge_Grade)

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
#### Initial ERD
![Proposed ERD](/Documentation/ERD_Proposed.png "Proposed Entity Relationship Diagram")

This was my initial plan for the ERD, due to my inexperience I have overestimated what I could achieve within the allocated time. Basic CRUD functionality was achieved but the extra features such as pdf print out of the table was not. The tables are colour coded based on my perceived functional importance, such as instantiating the use of my website per user basis. 

#### Final ERD
![Final ERD](/Documentation/ERD_Final.png "Final Entity Relationship Diagram")

Due to the scope of my project I decided to focus on the core functionality first which resulted in the above. 

<a name="FE"></a>
## Front End Design
### Wireframes & Screenshot comparisons

Due to the amount of space it would have taken (dropdowns are not compatible with image display) please click the following link to see the [FrontEnd Github Repository.](https://github.com/Kanimi/theBagofHoldingFrontEnd)

<a name="testing"></a>
## Testing

JUnit, Mockito and Selenium tests have been used for automated testing, and Codacy for code analysis and refactoring.

![JUnit/Mockito Report](/Documentation/Junit_Mockito_Report.png "JUnit/Mockito Report")

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

I wanted to use mySQL database instead of h2 as my database data would persist without having to host a machine with my Intellij project, it would be done online instead on the Google SQL service. However I ran into hibernation errors which due to the time constraint I wasn't able to solve in time for the deadline. Additionally I have looked into getting my entire back end on my virtual machine with Docker, unfortunately there were issues with my jar file due to the manifest file and I decided to not pursue this futher in favour of finishing the project on time. 