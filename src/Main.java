
import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Java Basics", "John Smith", "12345");
        Book book2 = new Book("Python Basics", "David Lee", "67890");

        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        System.out.println("Library Management System");
        System.out.println();

        library.addBook(book1);
        library.addBook(book2);

        System.out.println();

        library.addMember(member1);
        library.addMember(member2);

        System.out.println();

        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);

        System.out.println();

        library.returnBook(member1, book1);
        library.returnBook(member2, book2);

        System.out.println();

        System.out.println("Book Reservation System");
        System.out.println();

        library.reserveBook(member1, book1);
        library.reserveBook(member2, book2);

        System.out.println();

        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);

        System.out.println();

        library.cancelReservation(member1, book1);

        System.out.println();

        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);
    }
}
