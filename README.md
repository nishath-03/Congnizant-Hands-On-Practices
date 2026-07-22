# 🚀 Cognizant Java Full Stack (JFS) — Hands-On Practices

> A structured collection of all hands-on exercises, projects, and implementations completed during the **Cognizant Java Full Stack (JFS) Training Program**.  
> Organised **week-by-week** and **module-by-module**, covering everything from core Java design patterns and PL/SQL to microservices, JWT security, and Spring Cloud.

---

## 🛠️ Tech Stack

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=flat-square&logo=springboot)
![Spring Security](https://img.shields.io/badge/Spring%20Security-JWT-6DB33F?style=flat-square&logo=springsecurity)
![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-Eureka%20%7C%20Gateway-6DB33F?style=flat-square)
![Hibernate](https://img.shields.io/badge/Hibernate-JPA-59666C?style=flat-square&logo=hibernate)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=flat-square&logo=apachemaven)
![JUnit5](https://img.shields.io/badge/JUnit-5-25A162?style=flat-square&logo=junit5)
![Mockito](https://img.shields.io/badge/Mockito-Testing-brightgreen?style=flat-square)
![Oracle SQL](https://img.shields.io/badge/Oracle-PL%2FSQL-F80000?style=flat-square&logo=oracle)
![SLF4J](https://img.shields.io/badge/SLF4J-Logging-blue?style=flat-square)

---

## 📁 Repository Structure

```
Cognizant-Hands-On-Practices/
│
├── week 1/
│   ├── Module 1 — Design Patterns
│   ├── Module 2 — Data Structures & Algorithms
│   ├── Module 3 — PL/SQL
│   └── Module 4 — Testing (JUnit · Mockito · SLF4J)
│
├── week 2/
│   ├── Module 5 — Spring Core & Maven
│   └── Module 6 — Spring Data JPA · Hibernate
│
├── week 3/
│   └── Module 7 — Spring MVC · REST APIs · JWT Security
│
├── week 4/
│   ├── Creating Microservices
│   └── Eureka Discovery Server
│
└── week 5/
    └── (in progress)
```

---

## 📅 Week 1 — Java Foundations & Testing

### 📦 Module 1 · Design Patterns

> **Location:** `week 1/Module 1/Design_patterns/`

| Exercise | Description |
|----------|-------------|
| **Exercise 1 — Singleton Pattern** | Implements a thread-safe `Logger` class using the Singleton creational design pattern. Ensures only one instance is ever created across the application. |
| **Exercise 2 — Factory Method Pattern** | Implements a document creation system (Word, PDF, Excel) using the Factory Method pattern. Demonstrates how object creation logic is decoupled from the consumer. |
| **Factory Pattern (Own Example)** | A self-driven extension exercise applying the Factory Pattern to a custom real-world scenario — demonstrates understanding beyond the given problem statement. |

---

### 📦 Module 2 · Data Structures & Algorithms

> **Location:** `week 1/Module 2/Data structures and Algorithms/`

| Exercise | Description |
|----------|-------------|
| **Exercise 2 — E-commerce Search** | Implements both **linear search** and **binary search** algorithms to search for products by ID on a simulated e-commerce platform. Includes time complexity analysis (O(n) vs O(log n)). |
| **Exercise 7 — Financial Forecasting** | Implements a **recursive** financial forecasting algorithm to predict future values based on a given growth rate. Demonstrates recursion with real-world applicability. |

---

### 📦 Module 3 · PL/SQL Practices

> **Location:** `week 1/Module 3/PLSQL _practices/`

| Exercise | Description |
|----------|-------------|
| **Exercise 1 — Control Structures** | PL/SQL scripts demonstrating `FOR` loops, cursors, and `IF-THEN-ELSE` blocks. Applied to customer and loan management scenarios (e.g., applying discount logic, updating loan status). |
| **Exercise 3 — Stored Procedures** | PL/SQL stored procedures and functions for account-to-account fund transfers and applying interest rate updates based on business rules. |

> **Prerequisite:** Oracle DB instance with `Customers`, `Loans`, and `loanDetails` tables set up.

---

### 📦 Module 4 · Testing Frameworks

> **Location:** `week 1/Module 4/`

#### 🔹 JUnit 5 — Basic Testing Exercises
> `Module 4/1. JUnit_Basic Testing Exercises/`

| Exercise | Description |
|----------|-------------|
| **Exercise 1 — Setting Up JUnit** | Maven project with a basic JUnit 5 test suite for a `Calculator` class. Covers `@Test`, `mvn test`, and project structure setup. |
| **Exercise 2** | Additional JUnit test coverage exercises. |
| **Exercise 3 — Assertions** | Explores JUnit 5's rich assertion library: `assertEquals`, `assertTrue`, `assertThrows`, `assertNotNull`, and more. |
| **Exercise 4 — AAA Pattern & Fixtures** | Demonstrates the **Arrange-Act-Assert** pattern. Covers lifecycle hooks: `@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll`. |

#### 🔹 Mockito — Mocking & Verification
> `Module 4/Mockito_Exercises/`

| Exercise | Description |
|----------|-------------|
| **Exercise 1 — Mocking & Stubbing** | Uses `Mockito.mock()` and `when().thenReturn()` to isolate and stub service dependencies in unit tests. |
| **Exercise 2 — Verifying Interactions** | Verifies method invocations using `verify()`, `times()`, and argument matchers to assert interaction behaviour. |

#### 🔹 SLF4J — Logging
> `Module 4/SLF4J_Exercises/`

| Exercise | Description |
|----------|-------------|
| **Exercise 1 — Logging Levels** | Integrates **SLF4J** with Logback. Demonstrates different log levels (`DEBUG`, `INFO`, `WARN`, `ERROR`) and structured logging in a Spring-compatible setup. |

---

## 📅 Week 2 — Spring Framework & Persistence

### 📦 Module 5 · Spring Core & Maven

> **Location:** `week 2/Module 5/SpringCore and Maven/`

| Exercise | Description |
|----------|-------------|
| **Exercise 1 — Basic Spring Application** | Configures a Spring `ApplicationContext` using XML bean definitions. Demonstrates `ClassPathXmlApplicationContext` and bean wiring. |
| **Exercise 2 — Dependency Injection** | Implements **setter injection** — a `UserService` bean receives a `UserRepository` dependency via Spring's IoC container. |
| **Exercise 4 — Maven Project Setup** | Properly structures a Maven project with `pom.xml`, correct dependencies, and Spring container bootstrapping. |
| **Exercise 6 — Bean Annotations** | Replaces XML configuration with annotation-based bean definitions using `@Component`, `@Autowired`, `@Service`, and `@Repository`. |

---

### 📦 Module 6 · Spring Data JPA & Hibernate

> **Location:** `week 2/Module 6/`

| Exercise | Description |
|----------|-------------|
| **Exercise 1 — Spring Data JPA Quick Example** | Bootstraps a Spring Boot project with `spring-data-jpa`. Demonstrates `JpaRepository` CRUD operations with a simple entity. |
| **Exercise 2 — Query Methods & OR Mapping** | Uses Spring Data's **derived query methods** (`findByName`, `findByAgeGreaterThan`) and maps Java entities to DB tables using JPA annotations (`@Entity`, `@OneToMany`, etc.). |
| **Exercise 3 — HQL & Native Queries** | Writes **JPQL (HQL)** queries using `@Query` and raw **native SQL queries** with `nativeQuery = true` for complex data retrieval. |

---

## 📅 Week 3 — Spring MVC, REST APIs & Security

### 📦 Module 7 · Spring Web, REST & JWT

> **Location:** `week 3/Module 7/`

#### 🔹 Exercise 1 — Spring MVC Web Project
> `Exercise1-SpringWebProject/`

- Foundation Spring MVC application built with Spring Boot.
- Demonstrates controller-view mapping, `@RequestMapping`, and application startup configuration.
- Includes a working `pom.xml` with MVC dependencies.

#### 🔹 Exercise 2 — REST Web Service
> `Exercise2-RESTService/`

- Full RESTful web service implementing multiple endpoints:
  - `GET /hello` → returns a greeting response
  - `GET /countries/{code}` → returns country details; responds with `404` for unknown codes
- Demonstrates `@RestController`, `@GetMapping`, `@PathVariable`, `ResponseEntity`.
- Country data loaded from an XML configuration file (`country.xml`).
- Pre-loaded countries: **US, IN, DE, JP**.

#### 🔹 Exercise 3 — JWT Authentication Service
> `Exercise3-JWT/`

- Implements **token-based authentication** using **JSON Web Tokens (JWT)** with **Spring Security**:
  - `POST /authenticate` → accepts HTTP Basic credentials, returns a signed JWT token
  - JWT token generation via a `JwtTokenUtil` utility class
  - `SecurityConfig` with in-memory user store and BCrypt password encoding
- Demonstrates the full Spring Security filter chain customisation for stateless REST APIs.

---

## 📅 Week 4 — Microservices & Service Discovery

### 📦 Creating Microservices

> **Location:** `week 4/Creating Microservices/`

| Exercise | Description |
|----------|-------------|
| **Exercise 1 — Account Microservice** | Standalone Spring Boot service. `GET /accounts/{number}` returns account number, type, and balance. Package: `com.cognizant.account`. |
| **Exercise 2 — Loan Microservice** | Standalone Spring Boot service. `GET /loans/{number}` returns loan number, type, amount, EMI, and tenure. Package: `com.cognizant.loan`. |

---

### 📦 Eureka Discovery Server & API Gateway

> **Location:** `week 4/Eureka Discovery Server/`

| Exercise | Description |
|----------|-------------|
| **Exercise 1 — API Gateway** | Spring Cloud Gateway as the **single entry point** for all microservice traffic. Features a `LoggingGlobalFilter` that logs every request method, URI, and response status. Routes configured via `application.properties`. Package: `com.cognizant.api_gateway`. |
| **Exercise 2 — Eureka Discovery Server** | Netflix Eureka **service registry** activated with `@EnableEurekaServer`. Microservices register themselves and discover peers dynamically. Package: `com.cognizant.eureka_discovery_server`. |

> Together, Exercises 1 & 2 form a complete **service mesh** — the API Gateway routes external traffic to dynamically registered services via Eureka.

---

## 📅 Week 5 — (In Progress)

> Work in progress — exercises will be added upon completion.

---

## 🚀 Getting Started

### Prerequisites

| Tool | Purpose |
|------|---------|
| JDK 17+ | Compile and run all Java projects |
| Apache Maven 3.6+ | Build and dependency management |
| IntelliJ IDEA / Eclipse | Recommended IDE |
| Oracle SQL Developer | Run PL/SQL scripts (Week 1 / Module 3) |
| Postman / cURL | Test REST endpoints (Week 3 & 4) |

---

### ▶️ Running Java / Spring Boot Projects

Every exercise that has a `pom.xml` can be built with:

```bash
# Compile and run tests
mvn clean test

# Run a Spring Boot application
mvn spring-boot:run
```

---

### ▶️ Running PL/SQL Scripts

Open the scripts inside `week 1/Module 3/PLSQL _practices/` in **Oracle SQL Developer** connected to an Oracle DB instance.  
Required tables: `Customers`, `Loans`, `loanDetails`.

---

### ▶️ Testing REST Endpoints

```bash
# Hello endpoint (Week 3)
curl -X GET http://localhost:8080/hello

# Country lookup with 404 handling (Week 3)
curl -X GET http://localhost:8080/countries/IN

# JWT Authentication (Week 3) — credentials: user / pwd
curl -X POST http://localhost:8080/authenticate \
  -H "Authorization: Basic dXNlcjpwd2Q=" \
  -H "Content-Type: application/json"

# Account Microservice (Week 4)
curl -X GET http://localhost:8081/accounts/1001

# Loan Microservice (Week 4)
curl -X GET http://localhost:8082/loans/5001
```

---

## 🎯 Learning Outcomes

| Area | Skills Demonstrated |
|------|-------------------|
| **Design Patterns** | Singleton, Factory Method — with custom real-world extensions |
| **Algorithms & DSA** | Linear Search, Binary Search, Recursion, Time Complexity Analysis |
| **PL/SQL** | Cursors, Loops, Stored Procedures, Functions, Control Structures |
| **Testing** | JUnit 5 lifecycle, rich assertions, AAA pattern; Mockito mocking & verification |
| **Logging** | SLF4J + Logback — structured logging across severity levels |
| **Spring Core** | IoC container, XML & annotation-based DI, Maven project configuration |
| **Spring Data JPA** | Entity mapping, derived queries, JPQL, native queries, Hibernate ORM |
| **Spring MVC & REST** | `@RestController`, `@PathVariable`, `ResponseEntity`, XML data config |
| **Spring Security & JWT** | Stateless auth, JWT token generation, BCrypt encoding, filter chain |
| **Microservices** | Domain-driven independent Spring Boot services, REST communication |
| **Spring Cloud** | Eureka service registry, API Gateway routing, global filters |

---

## 📝 Notes

- All Java exercises are **self-contained Maven projects** with their own `pom.xml`.
- PL/SQL exercises are provided as **PDF / SQL script files** and require an Oracle DB.
- Week 3 REST exercises use **XML-based data configuration** — see `country.xml` per project.
- Week 4 microservices are designed to run **concurrently on different ports** for a full service-mesh demo.
- Each module follows **separation of concerns**: `Controller → Service → Repository → Model`.

---

<div align="center">

*Built as part of the Cognizant Java Full Stack (JFS) Training Program*

</div>
