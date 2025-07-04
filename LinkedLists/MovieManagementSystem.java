package LinkedLists;
import java.util.Scanner;

class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev;
    Movie next;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

public class MovieManagementSystem {
    private Movie head, tail;

    // Add at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add at end
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newMovie.next = temp.next;
        newMovie.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newMovie;
        } else {
            tail = newMovie;
        }
        temp.next = newMovie;
    }

    // Remove by title
    public void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                    else tail = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Movie \"" + title + "\" removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    // Search by Director or Rating
    public void search(String keyword) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(keyword) || String.valueOf(temp.rating).equals(keyword)) {
                System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No matching records found.");
        }
    }

    // Update rating by title
    public void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies to display.");
            return;
        }

        Movie temp = head;
        System.out.println("Movies (Forward):");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies to display.");
            return;
        }

        Movie temp = tail;
        System.out.println("Movies (Reverse):");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add at Beginning\n2. Add at End\n3. Add at Position\n4. Remove by Title\n5. Search by Director/Rating");
            System.out.println("6. Update Rating\n7. Display Forward\n8. Display Reverse\n9. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Director: ");
                    String director = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();
                    if (choice == 1) mms.addAtBeginning(title, director, year, rating);
                    else if (choice == 2) mms.addAtEnd(title, director, year, rating);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        mms.addAtPosition(pos, title, director, year, rating);
                    }
                    break;
                case 4:
                    System.out.print("Enter Title to Remove: ");
                    String rTitle = sc.nextLine();
                    mms.removeByTitle(rTitle);
                    break;
                case 5:
                    System.out.print("Enter Director Name or Rating to Search: ");
                    String keyword = sc.nextLine();
                    mms.search(keyword);
                    break;
                case 6:
                    System.out.print("Enter Movie Title: ");
                    String uTitle = sc.nextLine();
                    System.out.print("Enter New Rating: ");
                    double newRating = sc.nextDouble();
                    mms.updateRating(uTitle, newRating);
                    break;
                case 7:
                    mms.displayForward();
                    break;
                case 8:
                    mms.displayReverse();
                    break;
                case 9:
                    System.out.println("Exiting.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
