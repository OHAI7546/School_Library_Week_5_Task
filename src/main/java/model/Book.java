package model;

public class Book {

    private String title;
    private int availableCopies;

    public Book(String title, int availableCopies) {
        this.title = title;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void borrowCopy() {
        if (availableCopies > 0) {
            availableCopies--;
        }
    }

    public void returnCopy() {
        availableCopies++;
    }
}
