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
* Account details registration
* Transaction interface
 

## 🔄 Application Flow

Login
  ↓
Signin/Signup – Personal Details
  ↓
MySQL Database
  ↓
Signup Page 2
  ↓
MySQL Database
  ↓
Signup Page 3
  ↓
MySQL Database
  ↓
Transaction Page
  ↓
MySQL Database


## 📸 Screenshots

### Login Page

("![Login Page](screenshots/Screenshot_loginpage.png)")

### Signup Page 1

![Signup Page 1](screenshots/Screenshot_signup.png)")

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
                         SIGN UP
                             │
                             ▼
                    ┌─────────────────┐
                    │  Signup Page 1  │
                    │ Personal Details│
                    └────────┬────────┘
                             │
                            Next
                             ▼
                    ┌─────────────────┐
                    │  Signup Page 2  │
                    │ Additional Info │
                    └────────┬────────┘
                             │
                            Next
                             ▼
                    ┌─────────────────┐
                    │  Signup Page 3  │
                    │ Account Details │
                    └────────┬────────┘
                             │
                            Next
                             ▼
                    ┌─────────────────┐
                    │ Transaction Page│
                    │ Banking Services│
                    └────────┬────────┘
                             │
                             ▼
                       MySQL Database
