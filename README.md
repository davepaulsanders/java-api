# Java API

This project is a Springboot Web Application that performs CRUD operations on an in-memory database created with MySQL.
It uses Springboot Data JPA to map Topics and Courses classes to SQL tables.

## Installation

1. Clone the repository and open it in an IDE of your choice.  You must have MYSQL installed to run this application.
2. Next, make sure all dependencies are installed, then run the application. You can perform CRUD operations in Postman
   or Insomnia at http://localhost:8080/. Endpoints can be found in the TopicsController and CoursesController.
3. If you'd like to create a Jar, in the terminal, type `mvn clean install` and it will be generated. You must have
   Maven installed locally to run this command.

## Technologies

- Springboot Web
- Springboot Data JPA
- MYSQL