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
```

---

## 📋 Implemented User Stories

The automation test suite covers the following core business requirements from Parabank's specifications:

| US ID | Title (TR) | Description | Sample Scenarios |
| :--- | :--- | :--- | :--- |
| **US601** | Yeni Kullanıcı Kaydı | Registration of a new customer with validation of successful account creation. | Valid details registration |
| **US602** | Kullanıcı Girişi (Login) | Verification of successful and failed authentication processes. | Valid login, Invalid credentials login |
| **US603** | Fatura Ödeme (Bill Pay) | Utility payment processing for Electricity, Water, and Gas with balance verification. | Payment of Electricity, Water, Gas bills |
| **US604** | Yeni Banka Hesabı Açma | Creation of Checking and Savings accounts with dynamic balance transfers. | Open checking account, Open savings account |
| **US605** | Hesaplar Arası Para Transferi | Internal fund transfer between user accounts with Transaction ID validation. | Money transfer validation, Find by transaction ID |
| **US606** | İletişim Bilgilerini Güncelleme | Editing customer profile information including name, address, and phone number. | Update contact details, Negative/empty input validation |
| **US607** | Kredi Başvurusu (Loan) | Submission of loan applications with automated processing and feedback validation. | Loan approval (sufficient downpayment), Loan denial |

---

