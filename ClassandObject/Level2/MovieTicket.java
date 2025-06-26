package ClassandObject.Level2;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double price) {
        this.movieName = name;
        this.seatNumber = seat;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Interstellar", 21, 250.0);
        ticket.displayDetails();
    }
}
