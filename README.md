# Hibernate

## 📌 Overview
 demonstrates the **basic usage of Hibernate ORM** to perform
database operations using Java objects instead of writing SQL queries manually.

Hibernate is an **ORM (Object Relational Mapping)** framework that maps
Java classes to database tables and Java objects to table records.

---

## 🛠 Technologies Used
- Java (Core Java)
- Hibernate ORM
- MySQL Database
- JDBC Driver

---


## 🔍 Key Concepts Covered
- ORM (Object Relational Mapping)
- Hibernate Configuration
- Entity Mapping using Annotations
- Session and SessionFactory
- Transaction Management
- Basic CRUD Operations

---

## 🧩 Hibernate Configuration
Hibernate is configured using the `hibernate.cfg.xml` file, which includes:
- Database connection details
- Hibernate dialect
- Entity class mapping
Hibernate automatically generates SQL queries based on Java entity classes.

---

## 🧑‍💻 Entity Class Example
```java
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String city;
}

🔄 CRUD Operations

Hibernate provides methods such as:
save() → Insert data
get() → Fetch data
update() → Update data
delete() → Delete data
These operations are executed using Session and Transaction.

▶ How the Application Works
Hibernate reads hibernate.cfg.xml
SessionFactory is created
Session is opened
Transaction begins
CRUD operation is performed
Transaction is committed
Session is closed

🎯 Advantages of Hibernate
Reduces boilerplate JDBC code
Database independent
Automatic table mapping
Easy CRUD operations
Improves productivity

⚠ Limitations
Requires proper configuration
More complex for beginners compared to JDBC
Performance tuning needed for large applications


📌 Conclusion
This project helps in understanding Hibernate fundamentals
and how Java objects interact with relational databases using ORM.

Hibernate is commonly used with Spring / Spring Boot in real-world applications.

👤 Author
Ganesh Badar
Java Developer | Hibernate | Backend Development
---



