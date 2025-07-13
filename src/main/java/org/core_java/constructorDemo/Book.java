package org.core_java.constructorDemo;

public class Book {
    String title;
    String author;
    String isbn;
    public static int totalBooks;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
        System.out.println("Book created: " + title + " by " + author + ", ISBN: " + isbn);
        printTotalBooks();
    }

    public Book() {
        System.out.println("Default constructor called");
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);

    }

    public void borrowBook() {
        System.out.println("Borrowing book: " + title);
    }

    public void returnBook() {
        System.out.println("Returning book: " + title);
    }

    public static void printTotalBooks() {
        System.out.println("Total books: " + totalBooks);
    }

    public static void main(String[] args) {
        Book b = new Book("The Alchemist", "Paulo Coelho", "978-0061122415");
        b.borrowBook();
        b.returnBook();
        Book b2 = new Book("1984", "George Orwell", "978-0451524935");
        b2.printDetails();
        Book b3 = new Book();
        b3.printDetails();
        Book.printTotalBooks();
    }
}