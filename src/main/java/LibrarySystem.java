import enums.UserType;
import model.User;
import service.Impl.LibraryServiceImpl;
import service.LibraryService;

public class LibrarySystem {

    public static void main(String[] args) {
        LibraryService libraryService = new LibraryServiceImpl();

        // Example usage
        User student = new User("Chukwuemeka", UserType.STUDENT);
        User teacher = new User("Mr. Segun", UserType.TEACHER);

        libraryService.borrowBook(student, "Java Programming");
        libraryService.borrowBook(teacher, "Java Programming");
    }
}
