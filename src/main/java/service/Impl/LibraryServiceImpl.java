package service.Impl;

import enums.UserType;
import model.Book;
import model.User;
import service.LibraryService;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LibraryServiceImpl implements LibraryService {

    private Map<String, Book> bookInventory = new HashMap<>();
    private PriorityQueue<User> userQueue = new PriorityQueue<>((u1, u2) -> {
        if (u1.getUserType() == u2.getUserType()) {
            return 0;
        }
        return u1.getUserType() == UserType.TEACHER ? -1 : 1;
    });

    public LibraryServiceImpl() {
        // Initialize some books
        bookInventory.put("Java Programming", new Book("Java Programming", 2));
        bookInventory.put("Data Structures", new Book("Data Structures", 3));
    }
    @Override
    public void borrowBook(User user, String bookTitle) {

        Book book = bookInventory.get(bookTitle);
        if (book != null && book.getAvailableCopies() > 0) {
            userQueue.offer(user);
            book.borrowCopy();
            System.out.println(user.getName() + " borrowed " + bookTitle);
        } else {
            System.out.println("Book taken or not available.");
        }

    }
}
