public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book(1, "1984", "George Orwell"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));

        // Adding patrons
        library.addPatron(new Patron(1, "John Doe"));
        library.addPatron(new Patron(2, "Jane Smith"));

        // Listing books and patrons
        System.out.println("Books in the library:");
        library.listBooks();

        System.out.println("\nPatrons in the library:");
        library.listPatrons();

        // Borrowing and returning books
        library.borrowBook(1, 1);
        library.returnBook(1);

        // Listing books after operations
        System.out.println("\nBooks in the library after operations:");
        library.listBooks();
    }

}