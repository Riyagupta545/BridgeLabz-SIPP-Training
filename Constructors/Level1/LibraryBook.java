package Constructors.Level1;
class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable = true;

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        book.title = "Java Programming";
        book.author = "Herbert Schildt";
        book.price = 499.0;
        book.borrowBook(); // borrow once
        book.borrowBook(); // try again
    }
}
