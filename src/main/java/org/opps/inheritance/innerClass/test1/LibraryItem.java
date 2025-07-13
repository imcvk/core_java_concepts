package org.opps.inheritance.innerClass.test1;

//start with a base class Libraryltem that includes common
//        attributes like itemlD, title, and author, and methods like
//        checkout() and returnltem(). Create subclasses such as Book,
//Magazine, and DVD, each inheriting from Libraryltem. Add unique
//attributes to each subclass, like ISBN for Book, issueNumber for
//Magazine, and duration for DVD.
public class LibraryItem {
    private String itemlD, title, author;

    public void checkOut() {
        System.out.println("Check out of library item");
    }

    public void checkIn() {
        System.out.println("Check in of library item");
    }
}
