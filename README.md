# 👥 User Management System – Spring Boot CRUD API

A beginner-friendly RESTful User Management System built using Spring Boot, demonstrating core backend concepts such as CRUD operations, Spring Data JPA, DTOs, and global exception handling.

This project serves as a foundation backend project for learning and practicing enterprise-level Spring Boot development.

---

## 🚀 Features

- ✅ User Registration
- ✅ Fetch All Users
- ✅ Fetch User by ID
- ✅ Update User Details
- ✅ Delete User
- ✅ Basic Input Validation
- ✅ Centralized Exception Handling

---

## 🧠 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 17+ | Programming Language |
| Spring Boot | Backend Framework |
| Spring Web | REST APIs |
| Spring Data JPA | Database Interaction |
| Hibernate | ORM |
| MySQL / PostgreSQL | Database |
| Maven | Dependency Management |

---

## 🏗️ Project Structure

```
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
```

---

## 📌 API Endpoints

### 1️⃣ Register User
```http
POST /api/users
```

**Request Body:**
```json
{
  "name": "Akash Patel",
  "email": "akash@gmail.com",
  "age": 25
}
```

**Response:**
```json
{
  "id": 1,
  "name": "Akash Patel",
  "email": "akash@gmail.com",
  "age": 25
}
```

---

### 2️⃣ Get All Users
```http
GET /api/users
```

**Response:**
```json
[
  {
    "id": 1,
    "name": "Akash Patel",
    "email": "akash@gmail.com",
    "age": 25
  }
]
```

---

### 3️⃣ Get User by ID
```http
GET /api/users/{id}
```

**Response:**
```json
{
  "id": 1,
  "name": "Akash Patel",
  "email": "akash@gmail.com",
  "age": 25
}
```

---

### 4️⃣ Update User
```http
PUT /api/users/{id}
```

**Request Body:**
```json
{
  "name": "Akash Kumar",
  "email": "akash.kumar@gmail.com",
  "age": 26
}
```

---

### 5️⃣ Delete User
```http
DELETE /api/users/{id}
```

**Response:**
```json
{
  "message": "User deleted successfully"
}
```

---

## ⚠️ Exception Handling

- ❌ User Not Found Exception
- ❌ Validation Errors
- ❌ Duplicate Email Exception
- ✅ Global Exception Handling using `@ControllerAdvice`

---

## 🔍 Validation

- Name must not be blank
- Email must be valid and unique
- Age must be greater than 0

Implemented using **Jakarta Bean Validation**.

---

## 🛠️ Setup & Run Locally

### 1️⃣ Clone Repository
```bash
git clone https://github.com/your-username/user-management-system-springboot.git
cd user-management-system-springboot
```

### 2️⃣ Configure Database

Update `src/main/resources/application.properties`:

**For MySQL:**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/user_management_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

**For PostgreSQL:**
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/user_management_db
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️⃣ Create Database
```sql
CREATE DATABASE user_management_db;
```

### 4️⃣ Build & Run
```bash
mvn clean install
mvn spring-boot:run
```

### 5️⃣ Test the API

The application will run on: `http://localhost:8080`

Use **Postman** or **curl** to test the endpoints.

---

## 📦 Dependencies (pom.xml)

```xml
<dependencies>
    <!-- Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    
    <!-- Spring Boot Starter Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
    <!-- MySQL Driver -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    
    <!-- Validation -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    
    <!-- Lombok (Optional) -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
</dependencies>
```

---

## 🧪 Testing

Use **Postman** or **curl** to test all endpoints.

Example:
```bash
curl -X POST http://localhost:8080/api/users \
-H "Content-Type: application/json" \
-d '{"name":"Akash Patel","email":"akash@gmail.com","age":25}'
```

---

## 📚 Learning Outcomes

By completing this project, you will understand:
- RESTful API design principles
- Spring Boot project structure
- CRUD operations with Spring Data JPA
- DTO pattern for data transfer
- Exception handling best practices
- Bean validation in Spring Boot

---

## 🤝 Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Your Name**
- GitHub: [@akashpatelknit](https://github.com/akashpatelknit)
- Email: devakash0606@gmail.com

---

## ⭐ Show Your Support

If you found this project helpful, please give it a ⭐ on GitHub!

---

**Happy Coding! 🚀**