package org.example;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Book[] booksCollection = new Book[5];
    static int bookCount = 0;
    static boolean isActive = true;



    public static void main(String[] args) {
        System.out.println("\nWelcome To Book Management System For CVSU Library!");
        while (isActive) {
            printMenu();
            extractUserInput(sc);
            addSpace();
        }
    }


    private static void extractUserInput(Scanner sc) {
        System.out.print("Enter Action: ");
        String choice = sc.nextLine().trim();
        addSpace();
        switch (choice) {
            case "1":
                addBook();
                break;
            case "2":
                updateBook();
                break;
            case "3":
                showBooks();
                break;
            case "4":
                generateReport();
                break;
            case "5":
                exit();
                break;
            default:
                System.out.println("Invalid choice, try again! \nReturning now to Main Menu...");
                break;

        }
    }

    private static void printMenu() {
        System.out.println("Choose the following Actions, using the corresponding numbers:");
        System.out.println(" 1 - Add a New Book \n 2 - Update a Book Status\n 3 - Show All Books\n 4 - Generate Report\n 5 - Exit");
    }


    private static void addBook() {
        if (bookCount < 5) {
            System.out.println("Adding a new book now!");
            System.out.print("Enter the Book Title: ");
            String bookTitle = sc.nextLine().toUpperCase();
            Book newBook = new Book(bookTitle);
            booksCollection[bookCount] = newBook;
            bookCount++;
            System.out.println(bookTitle+" was added successfully to the library database! \nReturning now to Main Menu...");
        } else {
            System.out.println("The Library Capacity for Books is maxed! \nReturning now to Main Menu...");
        }


    }

    private static void updateBook() {
        System.out.println("Updating now a book!");
        showBooks();
        System.out.print("Enter the book number you want to update: ");
        try {
            int bookNumber = sc.nextInt();
            bookNumber-=1;
            Book foundBook = booksCollection[bookNumber];

            if (bookNumber < 0 || bookNumber >= bookCount || booksCollection[bookNumber] == null) {
                System.out.println("Invalid Book Number! Try Again! \nReturning now to Main Menu...");
            } else {
                foundBook.toggleStatus(); //toggles as per the instruction sa classroom po
                System.out.println("\nSuccess! Book Title: "+ foundBook.getTitle()+ ", Book Number: [" +(bookNumber+1) + "], Status is now: " + foundBook.getStatus() +"\nReturning now to Main Menu...");
            }
        }catch (Exception e) {
            System.out.println("\nInvalid input! \nReturning to Main Menu...");
            sc.nextLine();
            return;
        }

        sc.nextLine();
    }

    private static void showBooks() {
        System.out.println("All books saved in the library database:");
        for (int i = 0; i < booksCollection.length; i++) {
            if (booksCollection[i] != null) {
                System.out.println("Book Number: " + (i+1)+ ", Title: " + booksCollection[i].getTitle() + ", Status: " + booksCollection[i].getStatus()  );
            }
        }


    }

    private static void generateReport() {
        System.out.println("The Full Report of the CVSU Library Database");
        System.out.println("Total number of Books Registered: " + bookCount);
        int availableBooks = 0;

        for (int i = 0; i < bookCount; i++) {
            if (booksCollection[i] != null && booksCollection[i].getStatus() == BookStatus.AVAILABLE) {
                availableBooks++;
            }
        }
        System.out.println("Total number of Available books: " + availableBooks);
        System.out.println("Total number of Borrowed books: " + (bookCount - availableBooks));
        System.out.println("Returning now to Main Menu...");
    }

    private static void exit() {
        System.out.println("Now exiting the program!");
        System.out.println("Thank you for using the system! Have a nice day!");
        isActive = false;
    }

    private static void addSpace() {
        System.out.println("\n\n\n");
    }

}