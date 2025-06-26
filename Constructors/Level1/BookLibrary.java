package Constructors.Level1;
class BookLibrary {
    String title;
    String author;
    double price;

    BookLibrary() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    BookLibrary(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }

    public static void main(String[] args) {
        BookLibrary defaultBook = new BookLibrary();
        BookLibrary customBook = new BookLibrary("Wings of Fire", "A.P.J. Abdul Kalam", 199.0);
        defaultBook.display();
        customBook.display();
    }
}

