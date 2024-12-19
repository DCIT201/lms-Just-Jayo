import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    private final List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void borrowBook(int bookId, int patronId) {
        Book book = findBookById(bookId);
        if (book != null && !book.isBorrowed()) {
            book.setBorrowed(true);
            System.out.println("Book borrowed successfully by Patron ID: " + patronId);
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(int bookId) {
        Book book = findBookById(bookId);
        if (book != null && book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    private Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listPatrons() {
        for (Patron patron : patrons) {
            System.out.println(patron);
        }
    }
}
