### 📦 Wholesale Inventory App

A microservices-based application where **retailers place orders** and a **wholesaler manages inventory**. Built using **Spring Boot**, **Kafka**, **MySQL**, and **Docker**, with a shared DTO module and future plans for a React frontend.

---

### 📁 Project Structure

```
wholesale-inventory-app/
├── inventory-order-shared-dto/     # Common DTOs shared across services
├── order-service/                  # Retailers place orders
├── inventory-service/              # Manages inventory, listens to orders via Kafka
├── docker-compose.yml              # Kafka + Zookeeper + Kafka UI
├── pom.xml                         # Parent Maven project
```

---

### ⚙️ Tech Stack

* Java 17
* Spring Boot 3
* Spring Kafka
* Spring JPA (Hibernate)
* MySQL
* Apache Kafka
* Docker + Docker Compose

---

### 🔁 Flow Overview

1. **Retailers** use the `order-service` to place orders.
2. The order is published to the `order-events` Kafka topic.
3. `inventory-service` listens to this topic and updates inventory.
4. If stock is low, it can raise a flag (future: trigger alerts).
5. Shared DTOs ensure consistent message structure across services.

---

### 🚀 Getting Started

#### 1. Clone the Repo

```bash
git clone https://github.com/YOUR_USERNAME/wholesale-inventory-app.git
cd wholesale-inventory-app
```

#### 2. Start Kafka with Docker Compose

```bash
docker-compose up -d
```

* Kafka UI: [http://localhost:8085](http://localhost:8085)
* Kafka broker: `localhost:9092`

#### 3. Run MySQL locally or in Docker

You can run MySQL using Docker or your own MySQL setup. Update credentials in `application.properties`.

#### 4. Build the Project

```bash
mvn clean install
```

#### 5. Run Each Service

In separate terminals:

```bash
cd order-service
mvn spring-boot:run

cd inventory-service
mvn spring-boot:run
```

---

### 🧪 Testing the Flow

* Use **Postman** to place a POST request to `order-service`.
* Check Kafka UI to see messages.
* `inventory-service` will log inventory updates.

---

### 🛠️ Future Enhancements

* Add React frontend for placing orders and tracking inventory
* Inventory alerts when stock is low
* Authentication (JWT)
* Notification service (email/SMS/webhooks)

---

### 👨‍💻 Author

Dhiraj Pramod Badgujar
[LinkedIn](https://www.linkedin.com/in/dhiraj-badgujar/) • [GitHub](https://github.com/YOUR_USERNAME)

---

Would you like me to push this into your project as a file too?
