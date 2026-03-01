# 🏗️ Microfleet Telemetry Service

## 📦 Project Overview
Microfleet is a robust Spring Boot microservice designed to ingest, process, and store real-time telemetry data from Crown lift trucks. This project serves as the backbone for a global fleet management solution, providing stakeholders with critical insights into vehicle health and performance.

## 🎯 Product Vision
To provide a scalable, low-latency data pipeline that transforms raw lift truck signals (speed, battery, location) into actionable intelligence.

## 🛠️ Global Tech Stack
* **Backend**: Java 21, Spring Boot 3.x
* **Database**: PostgreSQL 15 (Dockerized)
* **Infrastructure**: WSL 2 (Ubuntu), Docker Desktop
* **Testing**: JUnit 5, Mockito

## 🗺️ Project Roadmap (Product Backlog)
- [x] **Sprint 1**: Core Infrastructure & Data Persistence
- [X] **Sprint 2**: Real-Time Data Validation (In Progress)
- [X] **Sprint 3**: Fleet Analytics & Reporting API
- [X] **Sprint 4**: Frontend Integration

## 📂 Project Ecosystem
This backend service is the core data engine for the Microfleet platform and works in tandem with:

* 🖥️ **Frontend**: [Telemetry Dashboard](https://github.com/WoW112119/telemetry-frontend)
* 🗄️ **Database**: PostgreSQL 15 (Dockerized)
* 🐋 **Infrastructure**: Docker Compose for localized orchestration

## 📂 Development History
Detailed technical notes and "Definition of Done" for each sprint can be found in the archives:
* [Sprint 1: Core Infrastructure](./docs/sprints/sprint-1.md)
* [Sprint 2: Logic Layer](./docs/sprints/sprint-2.md)
* [Sprint 3: Advanced Data Management](./docs/sprints/sprint-3.md)