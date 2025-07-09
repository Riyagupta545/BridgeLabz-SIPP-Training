package LinkedLists;
class Book {
    String title, author, genre;
    int id;
    boolean available;
    Book prev, next;

    Book(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}

public class Library {
    Book head, tail;

    // Add at end
    void addBook(int id, String title, String author, String genre, boolean available) {
        Book b = new Book(id, title, author, genre, available);
        if (head == null) head = tail = b;
        else {
            tail.next = b;
            b.prev = tail;
            tail = b;
        }
    }

    // Remove by ID
    void removeBook(int id) {
        Book temp = head;
        while (temp != null && temp.id != id) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;
    }

    // Search by title or author
    void search(String keyword) {
        for (Book temp = head; temp != null; temp = temp.next)
            if (temp.title.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword))
                System.out.println("Found: " + temp.title + " by " + temp.author);
    }

    // Update availability
    void updateStatus(int id, boolean status) {
        for (Book temp = head; temp != null; temp = temp.next)
            if (temp.id == id) temp.available = status;
    }

    // Display forward
    void displayForward() {
        for (Book temp = head; temp != null; temp = temp.next)
            System.out.println(temp.id + ": " + temp.title + " | " + (temp.available ? "Available" : "Not Available"));
    }

    // Display reverse
    void displayReverse() {
        for (Book temp = tail; temp != null; temp = temp.prev)
            System.out.println(temp.id + ": " + temp.title + " | " + (temp.available ? "Available" : "Not Available"));
    }

    // Count books
    int countBooks() {
        int count = 0;
        for (Book temp = head; temp != null; temp = temp.next) count++;
        return count;
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(1, "Java Basics", "James", "Programming", true);
        lib.addBook(2, "DSA", "Mark", "CS", false);
        lib.displayForward();
        lib.search("James");
        lib.updateStatus(2, true);
        System.out.println("Reverse Order:");
        lib.displayReverse();
        System.out.println("Total Books: " + lib.countBooks());
        lib.removeBook(1);
        lib.displayForward();
    }
}
