# 🎬 CineBook — Movie Ticket Booking Platform

CineBook is a movie ticket booking platform being developed using Java and Spring Boot. The project is built incrementally to explore backend development, REST APIs, dependency injection, database management, authentication, and software engineering best practices.

## 🚀 Project Status

**Status:** In Development

This project is being developed step by step while learning Spring Boot and applying the concepts to a practical application.

## 🛠️ Tech Stack

### Currently Used
- **Language:** Java
- **Backend Framework:** Spring Boot
- **Build Tool:** Apache Maven
- **API Style:** REST
- **Version Control:** Git and GitHub

### Planned
- Spring Data JPA and Hibernate
- MySQL
- Spring Security and JWT authentication
- JUnit and Mockito for testing
- React for the frontend

## ✅ Implemented Features

- Spring Boot project setup
- REST endpoint: `GET /hello`
- Platform information endpoint: `GET /api/info`
- Initial service layer
- Maven build and executable JAR packaging
- Git version control and GitHub repository setup

## 🔮 Planned Features

- Movie listing, search, and filtering
- Theatre and showtime management
- Seat selection and availability
- Booking creation and booking history
- Booking validation and duplicate-booking prevention
- User authentication and role-based access
- Smart seat recommendations based on preferences and budget
- Customer-facing interface and administration dashboard

*Planned features will be added and documented as development progresses.*

## 📁 Project Structure

```text
cinebook/
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/cinebook/cinebook/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       └── CinebookApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## ⚙️ Getting Started

### Prerequisites
- A compatible JDK
- Git
- Maven, or use the included Maven Wrapper

### Clone the Repository

```bash
git clone https://github.com/TanishaJagdale/CineBook.git
cd CineBook
```

### Build the Project

```bash
mvn clean package
```

Alternatively, on Windows, use the Maven Wrapper:

```powershell
.\mvnw.cmd clean package
```

### Run the Application

```bash
mvn spring-boot:run
```

Or on Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

The application will normally start on port `8080`, provided that the port is available and no configuration overrides it.

## 🧪 Test the API

Once the application is running, open these URLs in your browser:

- `http://localhost:8080/hello`
- `http://localhost:8080/api/info`

## 🎯 Project Goal

The goal is to build a maintainable backend application while learning practical Spring Boot concepts, clean code organization, API development, testing, and database integration.

## 👩‍💻 Author

**Tanisha Jagdale**

GitHub: [TanishaJagdale](https://github.com/TanishaJagdale)

---

*Built incrementally as a hands-on Spring Boot learning and portfolio project.*
