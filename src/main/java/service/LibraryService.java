package service;

import model.User;

public interface LibraryService {

    void borrowBook(User user, String bookTitle);
}
