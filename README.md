🚀 Java Frameworks – Backend Practice Repository

This repository contains hands-on practice projects for popular Java backend technologies.
It is designed for learning, practical implementation, and interview preparation.

🧰 Technologies & Tools

Java (Core & Advanced)

Spring Framework

Spring JDBC

NamedParameterJdbcTemplate

Hibernate (ORM)

MySQL

Maven

📁 Project Structure
Java-Frameworks/
│
├── Spring/
│   ├── Spring-JDBC-Examples/
│   │   ├── NamedParameterJdbcTemplate-CRUD/
│   │   ├── Java-Based-Configuration/
│   │   └── pom.xml
│
├── Hibernate/
│   ├── Hibernate-Configuration/
│   ├── Entity-Mapping/
│   ├── CRUD-Operations/
│   └── pom.xml
│
└── README.md

🎯 Purpose of This Repository

Learn Spring and Hibernate step by step

Understand Java + Database integration

Practice CRUD operations

Prepare for Java backend interviews

Build a strong foundation for Spring Boot

⚙️ Prerequisites

Make sure you have the following installed:

Java JDK 8 or higher

MySQL Server

Maven

IDE: Eclipse or IntelliJ IDEA

🗄️ Database Setup
CREATE DATABASE springdb;

CREATE TABLE student (
    std_roll INT PRIMARY KEY,
    std_name VARCHAR(50),
    std_marks DECIMAL(5,2)
);

▶️ How to Run the Project

Clone the repository:

git clone https://github.com/ganesh-badar/Java-Frameworks.git


Open the project in your IDE

Update database credentials in:

SpringConfigFile.java


Run:

App.java

🧠 Concepts Practiced

Dependency Injection (DI)

Java-based Spring Configuration

JDBC vs NamedParameterJdbcTemplate

SQL with named parameters

Hibernate Entity Mapping

Exception Handling in Spring JDBC

🚀 Future Improvements

Convert projects to Spring Boot

Add REST APIs

Introduce DTOs & Service Layer

Add Unit Testing

Integrate Swagger documentation

👨‍💻 Author

Ganesh Badar
Java Backend Developer (Learner)
🔗 GitHub: https://github.com/ganesh-badar
