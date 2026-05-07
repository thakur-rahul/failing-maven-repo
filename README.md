# Failing Maven Repo

This repository is a **deliberately broken Java Maven project** designed for testing CI/CD pipelines, error categorization, and AI-assisted debugging.

---

## 📂 Project Structure

failing-maven-repo/
├── pom.xml
    └── src
        └── test
            └── java
                └── com
                    └── example
                        └── FailingTest.java


---

## ⚙️ Maven Configuration

- **Broken Dependency**  
  The `pom.xml` includes a non-existent JUnit version (`99.99.99`), which causes **dependency resolution failure** during `mvn test`.

- **Surefire Plugin**  
  Configured to run unit tests, but will fail due to missing dependencies.

---

## 🧪 Test Cases

- **Assertion Failure**  
  ```java
  assertEquals(1, 2, "This test will always fail");
