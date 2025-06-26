package ThisFinalStaticKeywords;
class LibraryManagement {
    static String libraryName = "City Library";

    String title;
    String author;
    final String isbn;

    LibraryManagement(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof LibraryManagement) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        LibraryManagement book = new LibraryManagement("Java Basics", "James Gosling", "ISBN12345");
        book.displayDetails();
        LibraryManagement.displayLibraryName();
    }
}
