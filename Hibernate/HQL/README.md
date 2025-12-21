# Hibernate HQL (Hibernate Query Language)

This folder contains examples and practice code related to **HQL (Hibernate Query Language)**, which is used to perform database operations in Hibernate using **object-oriented syntax** instead of raw SQL.

---

## 📌 What is HQL?

HQL stands for **Hibernate Query Language**.  
It is similar to SQL but works with **Java classes and objects**, not database tables.

✔ Uses **entity class names**  
✔ Database-independent  
✔ Supports CRUD operations  
✔ Easier to maintain than native SQL

---

## 📂 Folder Contents

This folder includes:
- HQL queries for **SELECT**, **INSERT**, **UPDATE**, and **DELETE**
- Examples of:
  - `from` clause
  - `where` clause
  - named parameters
  - aggregate functions
  - pagination
- Practical Java programs using:
  - `Session`
  - `Query`
  - `Transaction`

---

## 🛠 Technologies Used

- Java  
- Hibernate  
- MySQL  
- HQL  


---

## 🧪 Sample HQL Queries

```java
// Fetch all records
Query q = session.createQuery("from Employee");

// Fetch with condition
Query q = session.createQuery("from Employee where salary > :sal");
q.setParameter("sal", 30000);

// Update query
Query q = session.createQuery("update Employee set salary = :sal where id = :id");

// Delete query
Query q = session.createQuery("delete from Employee where id = :id");

