# Spring Boot Wrestling CRUD API

A simple RESTful CRUD API built using **Spring Boot**, **PostgreSQL**, and **Swagger** to manage wrestling data such as wrestlers, finishers, and championship counts.

This project demonstrates basic backend development concepts including REST APIs, database integration, and API documentation.

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Swagger (SpringDoc OpenAPI)

---

## Features

- Create wrestler records
- Retrieve all wrestlers
- Retrieve wrestler by ID
- Update wrestler details
- Delete wrestler
- Interactive API documentation with Swagger

---

## Database Setup (PostgreSQL in Docker)

Run PostgreSQL container:

```bash
docker start postgres_sandesh
```

Connect to database:

```bash
docker exec -it postgres_sandesh psql -U postgres
```

Create database:

```bash
CREATE DATABASE wrestling_db;
```

Create table:

```bash
CREATE TABLE wrestler (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    ring_name VARCHAR(100),
    finisher VARCHAR(100),
    championships INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

Running the Application

Clone the repository:
```bash
git clone https://github.com/SandeshKhatiwada05/springboot-wrestling-crud-api
```



Docker-based database setup

Swagger API documentation
