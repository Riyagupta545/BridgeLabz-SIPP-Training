package LinkedLists;
class Ticket {
    int ticketId;
    String name, movie, seat, time;
    Ticket next;

    Ticket(int id, String name, String movie, String seat, String time) {
        this.ticketId = id;
        this.name = name;
        this.movie = movie;
        this.seat = seat;
        this.time = time;
    }
}

public class TicketSystem {
    Ticket head = null;

    // Add ticket at end
    void addTicket(int id, String name, String movie, String seat, String time) {
        Ticket t = new Ticket(id, name, movie, seat, time);
        if (head == null) {
            head = t;
            head.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = t;
            t.next = head;
        }
    }

    // Remove ticket by ID
    void removeTicket(int id) {
        if (head == null) return;
        Ticket curr = head, prev = null;
        do {
            if (curr.ticketId == id) {
                if (prev != null) prev.next = curr.next;
                else {
                    Ticket last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display all tickets
    void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println("ID: " + temp.ticketId + ", Name: " + temp.name +
                ", Movie: " + temp.movie + ", Seat: " + temp.seat + ", Time: " + temp.time);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer or movie
    void search(String keyword) {
        Ticket temp = head;
        if (head == null) return;
        do {
            if (temp.name.equalsIgnoreCase(keyword) || temp.movie.equalsIgnoreCase(keyword))
                System.out.println("Found Ticket: " + temp.ticketId + " (" + temp.name + ", " + temp.movie + ")");
            temp = temp.next;
        } while (temp != head);
    }

    // Count total tickets
    void countTickets() {
        if (head == null) {
            System.out.println("0 tickets booked.");
            return;
        }
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Total tickets: " + count);
    }

    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();
        ts.addTicket(1, "Alice", "Inception", "A1", "7PM");
        ts.addTicket(2, "Bob", "Matrix", "B2", "9PM");
        ts.displayTickets();
        ts.search("Alice");
        ts.countTickets();
        ts.removeTicket(1);
        ts.displayTickets();
    }
}
