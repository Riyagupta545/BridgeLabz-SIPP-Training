package ObjectModeling;
import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("OOP Concepts", "Grady Booch");

        Library lib1 = new Library("City Library");
        lib1.addBook(b1);
        lib1.addBook(b2);

        Library lib2 = new Library("College Library");
        lib2.addBook(b2); // Same book added to another library

        lib1.showBooks();
        lib2.showBooks();
    }
}
