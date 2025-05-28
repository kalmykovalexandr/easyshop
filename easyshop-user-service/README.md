# easyshop-user-service
Easyshop user microservice

user-service/
├── src/
│   ├── main/
│   │   ├── java/com/example/user/
│   │   │   ├── config/           # Spring configs
│   │   │   │   └── SecurityConfig.java
│   │   │   ├── controller/       # REST endpoints
│   │   │   │   ├── AuthController.java
│   │   │   │   └── UserController.java
│   │   │   ├── dto/              # (Optional) Service-specific DTOs
│   │   │   ├── exception/        # Custom exceptions
│   │   │   ├── model/            # JPA entities
│   │   │   │   ├── User.java
│   │   │   │   └── Role.java
│   │   │   ├── repository/       # Spring Data JPA
│   │   │   │   └── UserRepository.java
│   │   │   ├── service/          # Business logic
│   │   │   │   ├── UserService.java
│   │   │   │   └── AuthService.java
│   │   │   ├── util/             # Helpers (e.g., JwtUtils.java)
│   │   │   └── UserServiceApplication.java
│   │   └── resources/
│   │       ├── application.yml    # Configs
│   │       └── application-dev.yml
│   └── test/                     # Unit/Integration tests
├── .gitignore
├── Dockerfile                    # Containerization
├── docker-compose.yml            # Local PostgreSQL
└── pom.xml                       # Maven config