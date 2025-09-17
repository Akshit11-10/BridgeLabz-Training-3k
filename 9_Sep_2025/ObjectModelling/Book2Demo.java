import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    String name;
    List<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}

public class Book2Demo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Alice");
        Book b2 = new Book("OOP Concepts", "Bob");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("School Library");

        lib1.addBook(b1);
        lib2.addBook(b1);
        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}
