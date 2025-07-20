# 🧱 SOLID Principles in Java — Explained with Real-World Examples

Welcome to this educational repository where we explore the **SOLID principles** of object-oriented design using **clean, practical Java code examples**. These principles help developers write **scalable, maintainable, and testable** software — and they apply not just to code, but to system design thinking as well.

---

## ✅ What is SOLID?

**SOLID** is an acronym for five object-oriented design principles:

| Letter | Principle                         | Purpose                                           |
|--------|----------------------------------|--------------------------------------------------|
| **S**  | Single Responsibility Principle  | A class should have one reason to change.        |
| **O**  | Open/Closed Principle            | Software should be open for extension, closed for modification. |
| **L**  | Liskov Substitution Principle    | Subtypes should be replaceable with base types.  |
| **I**  | Interface Segregation Principle  | No client should be forced to depend on unused interfaces. |
| **D**  | Dependency Inversion Principle   | Depend on abstractions, not concretions.         |

---

## 📂 Project Structure

Each principle has its own `.java` file with clean, commented code examples.

```
solid-principles-java/
│
├── SRPExample.java     --> Single Responsibility Principle
├── OCPExample.java     --> Open/Closed Principle
├── LSPExample.java     --> Liskov Substitution Principle
├── ISPExample.java     --> Interface Segregation Principle
└── DIPExample.java     --> Dependency Inversion Principle
```

---

## 🔍 Code Walkthrough

### 1. [SRPExample.java](./SRPExample.java)  
- Demonstrates how splitting responsibilities (UserRepository, EmailService) leads to better separation of concerns.
- Use case: User registration system.

### 2. [OCPExample.java](./OCPExample.java)  
- Shows how to extend functionality via interfaces instead of modifying existing logic.
- Use case: Applying different discount strategies without changing core logic.

### 3. [LSPExample.java](./LSPExample.java)  
- Uses Bird/Ostrich/Sparrow to show how to avoid violating substitution expectations.
- Use case: Safe inheritance in polymorphic systems.

### 4. [ISPExample.java](./ISPExample.java)  
- Splits interfaces so robots aren’t forced to implement eating behavior.
- Use case: Clean abstractions for different actors.

### 5. [DIPExample.java](./DIPExample.java)  
- Injects messaging implementations instead of hardcoding dependencies.
- Use case: Swapping Email/SMS/Messaging backends with zero impact.

---

## 🧠 Why This Matters

Understanding and applying SOLID:
- Leads to **cleaner architecture**
- Makes systems **easier to scale, test, and maintain**
- Builds a **strong foundation for advanced system design topics**

---

## 🚀 Get Started

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/solid-principles-java.git
   cd solid-principles-java
   ```

2. Open in your IDE (IntelliJ, VS Code, Eclipse) or run with `javac`:
   ```bash
   javac SRPExample.java
   ```

---

## ✨ What's Next?

We'll extend this repo with:
- Real-world system patterns (e.g., Strategy, Factory, Adapter)
- Advanced design patterns beyond SOLID
- System design topics like API design, caching, and scalability

---

## 🙌 Contributing

Feel free to fork and extend with your own examples or improvements!

---

## 📫 Stay Connected

This project is part of my **System Design Newsletter**.  
Subscribe here to get in-depth breakdowns of how real systems are built: [Insert your newsletter link]

---

Made with ❤️ by [Your Name]
