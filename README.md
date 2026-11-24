# Front Row

A booking system for a small cultural venue, such as an art-house cinema or a community centre.
It supports two kinds of events:

- **seated events** with numbered seats (screenings, concerts),
- **capacity-limited events** without seat numbers (e.g. a workshop for 15 people).

This is a learning project: the goal is to build a realistic backend step by step,
with a focus on data consistency, concurrency and testing.

> 🚧 Work in progress. See the roadmap below for the current status.

## Tech stack

- Java 21, Spring Boot 4.2, Maven
- MySQL 8.4 (Docker), Spring Data JPA / Hibernate
- Liquibase (formatted SQL changesets)
- JUnit, AssertJ, Testcontainers
- Lombok

Planned: OpenAPI / Swagger UI, GitHub Actions, Spring Security with JWT, Redis, RabbitMQ,
Resilience4j, Nginx.

## Requirements

- JDK 21 (any distribution; tested with Eclipse Temurin)
- Docker (required for running the app locally and for integration tests)

## How to run

TODO

## Running tests

```bash
./mvnw verify
```

Integration tests start a MySQL container automatically via Testcontainers, so Docker must be running.

## Roadmap

- [ ] **Stage 0** – Foundations: project setup, Docker, Liquibase, CI, OpenAPI
- [ ] **Stage 1** – Domain model, REST API, pricing
- [ ] **Stage 2** – Reservations and concurrency (race conditions, optimistic and pessimistic locking)
- [ ] **Stage 3** – SQL, JPA internals, performance (N+1, indexes)
- [ ] **Stage 4** – Security (JWT, roles)
- [ ] **Stage 5** – Caching (Redis)
- [ ] **Stage 6** – Async processing and resilience (RabbitMQ, circuit breaker)
- [ ] **Stage 7** – Scaling, deployment, final documentation