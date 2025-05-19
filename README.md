
# 🏥 Healthcare Symptom Checker API

A RESTful API built with Spring Boot that allows users to submit symptoms and receive possible medical conditions. 🤖🩺

## ✨ Features

- 🔍 Submit a list of symptoms and get probable conditions
- 🧠 AI-ready structure for future ML integration
- 📦 JSON-based API endpoint

## 🛠️ Tech Stack

- Java
- Spring Boot
- JSON REST API

## 🚀 How to Run

> 💡 Make sure you have Java and Maven installed.

### 📁 Step-by-step:

1. **Navigate to the project root directory**:
   ```bash
   cd healthcare-symptom-checker-api
   ```

2. **Build the project using Maven**:
   ```bash
   mvn clean install
   ```

3. **Run the Spring Boot application**:
   ```bash
   mvn spring-boot:run
   ```

4. **Use a REST client like Postman or Curl to test the API**:
   - **Endpoint**: `POST http://localhost:8080/api/check-symptoms`
   - **Request Body**:
     ```json
     {
       "symptoms": ["fever", "cough"]
     }
     ```

## 📂 Project Structure

```
healthcare-symptom-checker-api/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/symptomchecker/
│       │       ├── controller/SymptomCheckerController.java
│       │       └── SymptomCheckerApplication.java
│       └── resources/
├── README.md
```

## 🔮 Future Enhancements

- TensorFlow-based AI model integration
- Database-backed condition learning
- Swagger API documentation

## 👨‍⚕️ Author

Created with care for smart health solutions ❤️
