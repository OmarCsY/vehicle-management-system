# Vehicle Management System 🚗

A robust desktop application developed in **Java** to manage vehicle records (Cars and Trucks). This project was designed to demonstrate a strong understanding of **Object-Oriented Programming (OOP)** principles and **Software Design Patterns**.

##  Key Features 🌟
* **Fleet Management:** Add, store, and categorize different types of vehicles (Cars & Trucks).
* **Detailed Records:** Manage comprehensive data including vehicle specs, owner details, and insurance policies.
* **Input Validation:** Custom validation logic to ensure data integrity (preventing crashes from invalid user inputs).
* **Graphical User Interface (GUI):** User-friendly interface built with **Java Swing/AWT**.

## 🛠️ Technical Highlights (Code Structure)
This project goes beyond basic coding by implementing advanced OOP concepts:

### 1. OOP Principles
* **Inheritance:** Uses a hierarchical structure where `Car` and `Truck` extend the base `Vehicle` class to prevent code duplication.
* **Composition:** Implements "Has-A" relationships. A `Vehicle` object *has* an `Owner` and *has* `Insurance` (separated into their own classes for better maintainability).
* **Polymorphism:** Overrides methods like `display()` to ensure each vehicle type behaves uniquely.

### 2. Advanced Java Concepts
* **Generics:** The main application utilizes Java Generics (`GuiApp<T extends Vehicle>`) to handle list operations flexibly and safely.
* **Encapsulation:** All fields are private with proper Getters/Setters to protect data state.

## 📂 Project Structure
سسf
```text
src/
├── Car.java          # Child class with specific attributes (Electric, Seats)
├── Truck.java        # Child class with specific attributes (Load Weight)
├── Vehicle.java      # Parent class (Base entity)
├── Owner.java        # Independent class linked to Vehicle
├── Insurance.java    # Independent class linked to Vehicle
└── GuiApp.java       # Main entry point & GUI Logic
```
```
---

## 🔗 Author
* **Name:** Omar Ibrahim Al-Ali
* **Date:** 2025-01-19
