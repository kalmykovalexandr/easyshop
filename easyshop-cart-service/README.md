# order-service
Easy-shop order service diagram

order-microservice/
├── order-api/
│   ├── src/main/java/com/easy/shop/order/
│   │   ├── dto/               # Request/Response DTOs
│   │   ├── exception/         # Custom exceptions
│   │   └── feign/            # Feign client interfaces
│   └── pom.xml
│
├── order-service/
│   ├── src/main/java/com/easy/shop/order/
│   │   ├── controller/        # REST endpoints
│   │   ├── service/           # Business logic
│   │   ├── repository/        # R2DBC repositories
│   │   ├── model/             # JPA entities
│   │   └── OrderServiceApplication.java
│   └── pom.xml
│
└── pom.xml                    # Parent POM
