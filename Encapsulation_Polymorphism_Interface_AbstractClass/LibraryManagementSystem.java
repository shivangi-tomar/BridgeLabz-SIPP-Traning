// Interface for reserving library items
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

// Book class - implements Reservable
class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan period
    }

    @Override
    public void reserveItem() {
        System.out.println("Book reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return true;
    }
}

// Magazine class - implements Reservable
class Magazine extends LibraryItem implements Reservable {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days loan period
    }

    @Override
    public void reserveItem() {
        System.out.println("Magazine reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return false;
    }
}

// DVD class - implements Reservable
class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days loan period
    }

    @Override
    public void reserveItem() {
        System.out.println("DVD reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return true;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "Java Programming", "James Gosling"),
            new Magazine(2, "Tech World", "Editor Team"),
            new DVD(3, "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            
            Reservable reservable = (Reservable) item;
            reservable.reserveItem();
            System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
            System.out.println();
        }
    }
}
