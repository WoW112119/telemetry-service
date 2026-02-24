# 🏁 Sprint 1: Core Infrastructure
**Date**: February 2026

### 🎯 Sprint Goals
The primary objective was to establish a functional data pipeline from a REST endpoint to a persistent database.

### ✅ Definition of Done
- [x] REST API endpoint created to receive JSON telemetry.
- [x] PostgreSQL database containerized and reachable via WSL 2.
- [x] JPA entities mapped for Speed, Battery Level, and Timestamp.

### 🚀 Technical Implementation
* **REST API**: Developed using `@RestController` to handle `POST` requests.
* **Database**: Orchestrated via `docker-compose.yml`.
* **Persistence**: Utilized Spring Data JPA for seamless repository management.

### 🛠 Running this Increment
1. Start the DB: `docker compose up -d`
2. Run the App: `./mvnw spring-boot:run`