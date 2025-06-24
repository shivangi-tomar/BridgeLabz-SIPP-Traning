class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, book already borrowed.");
        }
    }

    void display() {
        System.out.println(title + " by " + author + " | Price: " + price + " | Available: " + available);
    }

    public static void main(String[] args) {
        Book b = new Book("Mahabharata", "Vyasa", 299.0);
        b.display();
        b.borrowBook();
        b.display();
        b.borrowBook();
    }
}
