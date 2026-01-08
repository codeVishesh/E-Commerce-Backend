# E-Commerce-Backend

# 🛒 Enterprise Spring Boot E-commerce Backend

A production-ready **e-commerce backend system** built using **Spring Boot** that demonstrates real-world backend engineering practices including secure authentication, RESTful APIs, database design, testing, and professional documentation.

This project is designed to be **portfolio-ready**, **interview-ready**, and **scalable for real-world use cases**.

---

## 🚀 Project Overview

The goal of this project is to design and implement a **secure, scalable, and maintainable backend architecture** for an e-commerce platform.  
It covers essential backend functionalities such as:

- User authentication & authorization
- Product management
- Order processing
- Role-based access control
- Global exception handling
- Testing and documentation

---

## 🧱 Architecture Overview

The application follows a layered architecture:



This separation ensures **clean code, scalability, and easy maintenance**.

---

## ⚙️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **Spring Security + JWT**
- **PostgreSQL**
- **Maven**
- **JUnit & Mockito**
- **Swagger / OpenAPI**

---

## 🔐 Security Features

- JWT-based authentication
- Role-based authorization (**USER / ADMIN**)
- Admin-only protected endpoints
- Secure password handling
- Centralized security configuration

---

## 📡 REST API Endpoints

| Method | Endpoint | Description | Access |
|------|--------|------------|--------|
| POST | `/api/auth/login` | User login | Public |
| GET | `/api/products` | Fetch products | USER |
| POST | `/api/orders` | Place order | USER |
| GET | `/api/orders/{id}` | Order details | USER |
| POST | `/api/admin/products` | Add product | ADMIN |

---
- Java 17
- Maven
- PostgreSQL

