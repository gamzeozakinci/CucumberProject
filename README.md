# Parabank Cucumber Test Automation Project

This repository contains a robust, Behaviour-Driven Development (BDD) test automation framework built for the Parabank web application. It utilizes Java, Cucumber, Selenium WebDriver, and TestNG to automate end-to-end user scenarios and verify system functionality under various conditions.

## 🛠 Tech Stack & Core Dependencies

*   **Language:** Java (JDK 21)
*   **BDD Framework:** Cucumber JVM (v7.15.0)
*   **Web Automation:** Selenium WebDriver (v4.32.0)
*   **Test Runner:** TestNG (v7.8.0)
*   **Driver Management:** WebDriverManager (v6.3.4)
*   **Logging:** SLF4J & Log4j2
*   **Build Tool:** Maven

---

## 📂 Project Structure

```text
CucumberProject/
│
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   └── Parabank/
│   │   │       ├── pages/             # Page Object Model (POM) Classes
│   │   │       │   ├── OpenNewAccountPage.java
│   │   │       │   ├── RequestLoanPage.java
│   │   │       │   └── ...
│   │   │       ├── stepDefinitions/   # Step Definition Classes
│   │   │       │   ├── newAccountSteps.java
│   │   │       │   ├── requestLoanSteps.java
│   │   │       │   └── ...
│   │   │       └── utils/             # Utility Classes (e.g., General Web Driver)
│   │   │           └── GWD.java
│   │   │
│   │   └── resources/
│   │       └── features/
│   │           └── Tests/             # Cucumber Feature Files (.feature)
│   │               ├── newAccount.feature
│   │               ├── requestLoan.feature
│   │               └── ...
│   │
│   └── main/                          # Application source (if applicable)
│
├── target/                            # Build artifacts and reports
├── pom.xml                            # Maven Dependency Management Configuration
└── README.md                          # Project documentation
