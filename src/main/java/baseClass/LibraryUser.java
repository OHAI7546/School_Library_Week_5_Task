package baseClass;

import enums.UserType;

abstract public class LibraryUser {
    protected String name;
    protected UserType userType;

    public LibraryUser(String name, UserType userType) {
        this.name = name;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public UserType getUserType() {
        return userType;
    }


    public abstract void borrowBook(String bookTitle);
}
