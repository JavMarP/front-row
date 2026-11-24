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

Copy `.env.example` to `.env` and set the database values, then start MySQL with
`docker compose up -d`. Activate the `dev` Spring profile when running the
application, for example by setting `SPRING_PROFILES_ACTIVE=dev` in your IDE
or shell.

The application also needs `DB_NAME`, `DB_USER`, and `DB_PASSWORD` in its
environment; set them to the same values used in `.env`. Optionally set
`DB_PORT` if you changed the host port (it defaults to `3306`). Docker Compose
reads `.env`, but Spring Boot does not load that file automatically.

## Running tests

```bash
./mvnw verify
```

Integration tests start a MySQL container automatically via Testcontainers, so Docker must be running.
The existing integration test activates the `test` profile; use `@ActiveProfiles("test")`
on other tests that need its settings.

## Roadmap

- [ ] **Stage 0** – Foundations: project setup, Docker, Liquibase, CI, OpenAPI
- [ ] **Stage 1** – Domain model, REST API, pricing
- [ ] **Stage 2** – Reservations and concurrency (race conditions, optimistic and pessimistic locking)
- [ ] **Stage 3** – SQL, JPA internals, performance (N+1, indexes)
- [ ] **Stage 4** – Security (JWT, roles)
- [ ] **Stage 5** – Caching (Redis)
- [ ] **Stage 6** – Async processing and resilience (RabbitMQ, circuit breaker)
- [ ] **Stage 7** – Scaling, deployment, final documentation