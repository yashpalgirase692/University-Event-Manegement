# University-Event-Manegement
University Event Management is a Java application built using Maven and the SpringBoot framework.

## Table of Contents

- [Frameworks and Language Used](#frameworks-and-language-used)
- [Dataflow](#dataflow)
- [Data Structure](#data-structure)
- [Project Summary](#project-summary)

## Frameworks and Language Used

- Java: The primary programming language used for developing the application.
- Maven: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
- SpringBoot: A powerful and widely used framework for building Java-based enterprise applications. It provides features like inversion of control, dependency injection, and seamless integration with various other libraries.

## Dataflow
* Controller : I have to two controllers for student and event respectively and in each I have created endpoint with crud operations.

* Service : Similary I have to two service classes for student and event respectively and from here I have called to the interface crudRepo to used it methods.

* Repository : Basically repository is an interface which is extending CrudRepository of JPA. It is used to to do crud operations on DB and here also I have to repositories.

* DataBase Design : I have used m2 as an detabase which is in memory data base only by having its dependency in pom file.

## Data Structure

I have used m2 as an detabase which is in memory data base only.

## Project Summary

I have created university event management project. I have two entities Student and event for each I have created endpoints for to do crud operations.

