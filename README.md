# Types of Architecture in Java

---

## 1. Hexagonal Architecture

### What Is Hexagonal Architecture?
>Hexagonal Architecture encourages the idea that the application core (business logic) should not depend on anything external. Instead, it defines Ports (interfaces) that represent input/output operations, and Adapters that implement these ports for specific technologies (REST, Kafka, JPA, etc.).

### This leads to:
- Better testability (the core logic can be tested in isolation).
- Enhanced modularity and separation of concerns.
- Flexibility in swapping technology implementations without modifying business logic.

### Key Components
1. Application Core: Contains domain models and use cases (services).
2. Ports: Interfaces that define contracts for inputs (driving ports) and outputs (driven ports).
3. Adapters: Implement these interfaces, e.g., a REST controller or JPA repository.
   
### Sample Use Case: Banking Microservice for Account Transfer
> Let’s build a minimal example using this architecture. But before that lets take few minutes halt at this line and think how would you do that, not a detailed one, just an outline so that you can compare it with the rest of the write-up.

[Example]()