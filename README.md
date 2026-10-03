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

![Login Page](screenshots/Screenshot_loginpage.png)

### Signup Page 1

![Signup Page 1](screenshots/Screenshot_signupone.png)
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

##1. Main ATM System Flowchart

                    ┌───────────────┐
                    │     START     │
                    └───────┬───────┘
                            │
                            ▼
                 ┌─────────────────────┐
                 │   Login Page        │
                 │ Card Number + PIN   │
                 └──────────┬──────────┘
                            │
                            ▼
                    ┌──────────────┐
                    │ Credentials  │
                    │    Valid?    │
                    └──────┬───────┘
                       No  │  Yes
                    ┌──────┘    └────────┐
                    ▼                     ▼
             ┌─────────────┐      ┌──────────────┐
             │ Show Error   │      │ Transactions │
             │ & Try Again  │      │    Menu      │
             └──────┬──────┘      └──────┬───────┘
                    │                    │
                    └───────┐     ┌──────┘
                            │     │
                            ▼     ▼
                    ┌────────────────────┐
                    │ Select Operation   │
                    └─────────┬──────────┘
                              │
          ┌───────────────────┼────────────────────┐
          │                   │                    │
          ▼                   ▼                    ▼
   ┌────────────┐      ┌────────────┐      ┌──────────────┐
   │  Deposit   │      │ Withdrawal │      │ Fast Cash    │
   └─────┬──────┘      └─────┬──────┘      └──────┬───────┘
         │                   │                    │
         └───────────────────┼────────────────────┘
                             │
          ┌──────────────────┼───────────────────┐
          │                  │                   │
          ▼                  ▼                   ▼
 ┌────────────────┐  ┌────────────────┐  ┌────────────────┐
 │Balance Enquiry │  │Mini Statement  │  │  Pin Change    │
 └───────┬────────┘  └───────┬────────┘  └───────┬────────┘
         │                   │                   │
         └───────────────────┼───────────────────┘
                             │
                             ▼
                    ┌──────────────────┐
                    │ Transaction      │
                    │ Completed        │
                    └────────┬─────────┘
                             │
                             ▼
                    ┌──────────────────┐
                    │ Return to Menu?  │
                    └───────┬──────────┘
                       Yes  │  No
                       ┌────┘  └───────┐
                       ▼               ▼
                 Transactions      ┌─────────┐
                    Menu           │  EXIT   │
                                   └────┬────┘
                                        │
                                        ▼
                                  ┌───────────┐
                                  │    END    │
                                  └───────────┘


##2. New Account / Signup Flow

Your signup part can be shown separately:
                 ┌───────────────┐
                 │     START     │
                 └───────┬───────┘
                         │
                         ▼
                ┌─────────────────┐
                │  Signup One     │
                │ Personal Details│
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │  Signup Two     │
                │ Additional Info │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │ Signup Three    │
                │ Account Details │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │ Save Details in │
                │ MySQL Database  │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │ Account Created │
                └────────┬────────┘
                         │
                         ▼
                ┌─────────────────┐
                │ Return to Login │
                └────────┬────────┘
                         │
                         ▼
                    ┌─────────┐
                    │   END   │
                    └─────────┘

##3. Database Connection
Java Application
       │
       ▼
    Conn.java
       │
       ▼
      JDBC
       │
       ▼
   MySQL Database
       │
       ▼
  ┌───────────────┐
  │ Store / Read  │
  │ Account Data  │
  │ Transactions  │
  └───────────────┘

                
