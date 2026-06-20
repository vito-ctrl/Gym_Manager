# 🏋️ Java OOP - Member BMI Calculator

A simple Java Object-Oriented Programming (OOP) project that models a gym member and calculates their **Body Mass Index (BMI)** and **weight category**.

This project was built as part of my Java OOP learning journey.

---

## 📚 Concepts Practiced

This project helped me practice the following Java concepts:

- Classes and Objects
- Constructors
- Private fields (Encapsulation)
- Getters
- Methods
- Method calling
- `this` keyword
- Method overriding with `@Override`
- `toString()`
- Conditional statements (`if`, `else if`, `else`)
- Creating multiple objects
- Printing formatted output using `System.out.printf()`

---

## 📂 Project Structure

```
Member.java
```

The project contains one class:

- **Member**
  - Stores member information
  - Calculates BMI
  - Determines BMI category
  - Overrides `toString()` for clean object printing

---

## ⚙️ Member Properties

Each member has:

- ID
- Name
- Age
- Weight (kg)
- Height (meters)

---

## 🚀 Features

- Create multiple members
- Display member information
- Calculate BMI
- Determine weight category
- Automatically print object information using `toString()`

---

## 🧮 BMI Formula

BMI is calculated using:

```
BMI = Weight / (Height × Height)
```

Example:

```
Weight = 80.4 kg
Height = 1.92 m

BMI = 80.4 / (1.92 × 1.92)
```

---

## 📋 BMI Categories

| BMI | Category |
|------|----------|
| Less than 18.5 | Underweight |
| 18.5 – 24.9 | Normal |
| 25.0 – 29.9 | Overweight |
| 30 or higher | Obese |

---

## 💻 Example Output

```text
id : 1
name : aymane
age : 21
weight : 80.4
height : 1.92

21.81
normal

id : 2
name : l9irch
age : 19
weight : 70.5
height : 1.7

24.39
normal

id : 3
name : achraf
age : 24
weight : 50.0
height : 1.82

15.09
under weight
```

---

## ▶️ How to Run

Compile:

```bash
javac Member.java
```

Run:

```bash
java Member
```

---

## 🎯 Learning Goals

The goal of this project was to understand:

- How objects are created
- How constructors initialize object data
- How encapsulation works using private fields
- How methods interact with object data
- Why getters are useful
- How `toString()` works internally
- How method overriding works
- How to organize code using Object-Oriented Programming principles

---

## 📈 Future Improvements

Some features I plan to add as I continue learning Java:

- Setter methods
- Input from the keyboard (`Scanner`)
- Store members in an `ArrayList`
- Search members by ID
- Update member information
- Delete members
- Save members to a file
- Split the project into multiple classes

---

## 👨‍💻 Author

**Aymane / vito**

Learning Java Object-Oriented Programming one project at a time :|