class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movie, int seat, double p) {
        movieName = movie;
        seatNumber = seat;
        price = p;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String args[]) {
        MovieTicket t = new MovieTicket();
        t.bookTicket("Pathaan", 12, 250.0);
        t.displayTicket();
    }
}
