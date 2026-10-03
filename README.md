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

### 1. Login Page

![Login Page](screenshots/Screenshot_loginpage.png)

### 2. Signup Page 1

![Signup Page 1](screenshots/Screenshot_signupone.png)

### 3. Signup Page 2
![Signup Page 2](screenshots/Screenshot_signup_two.png)

### 4. Signup Page 3
![Signup Page 3](screenshots/Screenshot_signup_three.png)

### 5. Transactions
![Transactions](screenshots/Screenshot_transaction.png)

### 6. Deposit
![Deposit](screenshots/Screenshot_deposit.png)

### 7. Withdrawal
![Withdrawal](screenshots/Screenshot_withdrawl.png)
![Withdrawal](screenshots/Screenshot_u_withdrawl.png)

### 8. Fast Cash
![Fast Cash](screenshots/Screenshot_fastcash.png)

### 9. Balance Enquiry
![Balance Enquiry](screenshots/Screenshot_balance.png)

### 10. Mini Statement
![Mini Statement](screenshots/Screenshot_ministatement.png)

### 11. Pin Change
![Pin Change](screenshots/Screenshot_pinchange.png)
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

##1. Main ATM System Flowchar
![Withdrawal](screenshots/Screenshot/mermaid-diagram.png)

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

                
