package model;

import baseClass.LibraryUser;
import enums.UserType;

public class User extends LibraryUser {

    public User(String name, UserType userType) {
        super(name, userType);
    }

    @Override
    public void borrowBook(String bookTitle) {
        System.out.println(name + " is borrowing the book: " + bookTitle);
    }
}
