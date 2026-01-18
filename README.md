User Management System – Spring Boot CRUD API

A beginner-friendly RESTful User Management System built using Spring Boot, demonstrating core backend concepts such as CRUD operations, Spring Data JPA, DTOs, and global exception handling.

This project serves as a foundation backend project for learning and practicing enterprise-level Spring Boot development.

🚀 Features

User Registration

Fetch All Users

Fetch User by ID

Update User Details

Delete User

Basic Input Validation

Centralized Exception Handling

🧠 Tech Stack
Technology	Purpose
Java 17+	Programming Language
Spring Boot	Backend Framework
Spring Web	REST APIs
Spring Data JPA	Database Interaction
Hibernate	ORM
MySQL / PostgreSQL	Database
Maven	Dependency Management
🏗️ Project Structure
src/main/java/com/example/usermanagement
│
├── controller        # REST Controllers
├── service           # Business Logic
├── repository        # JPA Repositories
├── entity            # JPA Entities
├── dto               # Data Transfer Objects
├── exception         # Custom Exceptions & Handler
├── config            # Configuration (if any)
└── UserManagementApplication.java

📌 API Endpoints
1️⃣ Register User
POST /api/users


Request Body

{
  "name": "Akash Patel",
  "email": "akash@gmail.com",
  "age": 25
}

2️⃣ Get All Users
GET /api/users

3️⃣ Get User by ID
GET /api/users/{id}

4️⃣ Update User
PUT /api/users/{id}

5️⃣ Delete User
DELETE /api/users/{id}

⚠️ Exception Handling

User Not Found Exception

Validation Errors

Global Exception Handling using @ControllerAdvice

🔍 Validation

Name must not be blank

Email must be valid and unique

Age must be greater than 0

Implemented using Jakarta Bean Validation.

🛠️ Setup & Run Locally
1️⃣ Clone Repository
git clone https://github.com/your-username/user-management-system-springboot.git
