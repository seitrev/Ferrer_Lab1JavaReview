# Lab 01 – Library Book Management System

## Description
This laboratory activity involves developing a basic Library Book Management System using Java.  
The program allows librarians to manage book borrowing activities by adding new books, updating book availability status, displaying all registered books, and generating a simple summary report.  
The system uses arrays, loops, conditionals, and modular methods for implementation.

---

## Objectives
- Apply fundamental Java programming concepts  
- Use arrays to store and manage book data  
- Implement logic with loops and conditional statements  
- Create a menu-driven program using switch-case  
- Practice modular programming by defining and using methods

---

## Concepts Applied
- Java basics  
- Arrays  
- Methods  
- Loops  
- Conditional statements  
- Switch-case control structure  
- Input validation  
- Console-based menu system

---

## Project Structure
Lab01-Library-Book-Management/
├── src/
│ └── Main.java
└── README.md


### File Description
- **Main.java** – Contains the main menu, handles user input, and implements methods including `addBook()`, `updateBookStatus()`, `showBooks()`, and `generateReport()`.

---

## How to Run the Program
1. Open the project in a Java IDE (IntelliJ IDEA, NetBeans, or Eclipse)  
2. Navigate to the `src` folder  
3. Run the `Main.java` file  
4. Follow the on-screen menu options to interact with the system

---

## System Features
- **Main Menu**
  - Add Book  
  - Update Book Status  
  - Show All Books  
  - Generate Report  
  - Exit

- **Add Book**
  - Registers a new book with a default status of "Available"  
  - Stores books in an array with a maximum capacity of 5  
  - Implemented using `addBook()`

- **Update Book Status**
  - Toggles the book status between "Available" and "Borrowed"  
  - Validates book number input  
  - Implemented using `updateBookStatus()`

- **Display All Books**
  - Shows the title and current status of all registered books  
  - Implemented using `showBooks()`

- **Generate Report**
  - Displays total books, available books, and borrowed books  
  - Implemented using `generateReport()`

- **Exit Program**
  - Exits the program gracefully with a closing message

---

## Notes
- The program follows all laboratory instructions  
- Invalid menu selections are handled using a default case in the switch statement  
- Book status can only switch between "Available" and "Borrowed"  
- Code is organized clearly for readability
