# Java-Day4-Proj1-Phase2

This is a simple Java console-based application demonstrating basic **object-oriented programming (OOP)** principles, **custom exception handling**, and a **user registration system**. The application ensures users meet an age requirement before they can be registered.

---

## 📁 Project Structure

Directory structure:
└── adrin-bershik-c-j-java-day4-proj1-phase2/
├── day4proj1phase2.txt
├── pom.xml
└── src/
├── main/
│ └── java/
│ ├── com/
│ │ └── day4proj1phase2/
│ │ └── App.java
│ ├── exceptions/
│ │ └── InvalidAgeException.java
│ ├── main/
│ │ └── Main.java
│ ├── models/
│ │ └── User.java
│ └── services/
│ └── UserService.java
└── test/
└── java/
└── com/
└── day4proj1phase2/
└── AppTest.java

---

## 🚀 Features

- Register users with name and age.
- Validates if the user's age is **18 or above**.
- Throws a **custom exception** (`InvalidAgeException`) for users below 18.
- Loops user input until `"exit"` is typed as the name.

---

## 📦 Technologies Used

- Java 17+
- Maven (for project and dependency management)
- JUnit (basic test structure included)

---

## 🧪 Running the Application

### Prerequisites

- Java installed (JDK 17 or above)
- Maven installed

### Steps

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Adrin-Bershik-C-J/Java-Day4-Proj1-Phase2.git
   cd Java-Day4-Proj1-Phase2
   ```
