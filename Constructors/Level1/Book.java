package Constructors.Level1;
class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 199.0);
        defaultBook.display();
        customBook.display();
    }
}
