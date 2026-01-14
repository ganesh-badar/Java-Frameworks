Java Frameworks 🚀

This repository contains practice projects and examples for popular Java backend frameworks.
It is created for learning, hands-on practice, and interview preparation.

📌 Technologies Covered

Java (Core + Advanced)
Spring Framework
Spring JDBC
NamedParameterJdbcTemplate
Hibernate (ORM)
MySQL Database
Maven



📂 Project Structure
Java-Frameworks/
│
├── Spring/
│   ├── Spring JDBC examples
│   ├── NamedParameterJdbcTemplate CRUD
│   └── Java-based configuration
│
├── Hibernate/
│   ├── Hibernate configuration
│   ├── Entity mapping
│   └── CRUD operations
│
├── pom.xml
└── README.md


🎯 Purpose of This Repository
Learn Spring and Hibernate step by step
Understand Java + Database integration
Practice CRUD operations
Prepare for Java backend interviews
Build a strong foundation for Spring Boot



🛠️ Prerequisites
Before running the projects, make sure you have:
Java JDK 8 or higher
MySQL Server
Maven

IDE: Eclipse / IntelliJ IDEA

⚙️ Database Setup
Create a MySQL database:
CREATE DATABASE springdb;

Example table used:
CREATE TABLE student (
    std_roll INT PRIMARY KEY,
    std_name VARCHAR(50),
    std_marks DECIMAL(5,2)
);

▶️ How to Run
Clone the repository:
git clone https://github.com/ganesh-badar/Java-Frameworks.git
Open the project in your IDE
Update database credentials in:
SpringConfigFile.java
Run the App.java class


📌 Concepts Practiced
Dependency Injection (DI)
Java-based Spring Configuration
JDBC vs NamedParameterJdbcTemplate
SQL with named parameters
Hibernate entity mapping
Exception handling in Spring JDBC

📈 Future Improvements
Convert projects to Spring Boot
Add REST APIs
Add DTOs and Services layer
Add Unit Testing
Add Swagger documentation

👨‍💻 Author
Ganesh Badar
Java Backend Developer (Learner)
GitHub: https://github.com/ganesh-badar

⭐ If You Find This Useful

Give this repository a ⭐ to support learning!
