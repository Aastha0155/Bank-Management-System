# 🏦 Bank Management System

A desktop-based Bank Management System developed using **Java Swing**, **JDBC**, and **MySQL**.

## 🛠️ Technologies Used

* Java
* Java Swing
* JDBC
* MySQL
* NetBeans
* JCalendar

## ✨ Features

* ATM-style Login Page
* User Sign Up
* Personal Details Registration
* Additional Details Registration
* MySQL Database Connectivity
* JDBC-based database operations
* Multi-page account registration

## 🔄 Application Flow

Login Page
↓
Sign In / Sign Up
↓
Signup Page 1 – Personal Details
↓
MySQL Database
↓
Signup Page 2 – Additional Details
↓
MySQL Database

## 📸 Screenshots

### Login Page

![Login Page](screenshots/login-page.png)

### Signup Page 1

![Signup Page 1](screenshots/signup-page-1.png)

### Signup Page 2

![Signup Page 2](screenshots/signup-page-2.png)

## ⚙️ How to Run

1. Clone or download this repository.
2. Open the project in Apache NetBeans.
3. Configure MySQL.
4. Create the required database and tables.
5. Update the database credentials in `Conn.java`.
6. Add the required JCalendar and MySQL Connector/J libraries.
7. Run `Login.java`.

## 👩‍💻 Author

**Aastha Kashyap**

                    
                    ┌─────────────────┐
                    │   Login Page    │
                    └────────┬────────┘
                             │
                 ┌───────────┴───────────┐
                 │                       │
             SIGN IN                 SIGN UP
                 │                       │
                 │                       ▼
                 │              ┌─────────────────┐
                 │              │ Signup Page 1   │
                 │              │ Personal Details│
                 │              └────────┬────────┘
                 │                       │
                 │                      Next
                 │                       │
                 │                       ▼
                 │              ┌─────────────────┐
                 │              │ Signup Page 2   │
                 │              │ Additional Info │
                 │              └────────┬────────┘
                 │                       │
                 │                       ▼
                 │                 MySQL Database
                 │
                 ▼
             ATM / Banking
             Operations

             
