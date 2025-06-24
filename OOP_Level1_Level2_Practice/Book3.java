class Book3 {
    public String ISBN;
    protected String title;
    private String author;

    public Book3(String isbn, String t, String a) {
        ISBN = isbn;
        title = t;
        author = a;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book3 {
    String format;

    EBook(String isbn, String t, String a, String f) {
        super(isbn, t, a);
        format = f;
    }

    void displayEBook() {
        System.out.println("ISBN: " + ISBN);       // public access
        System.out.println("Title: " + title);     // protected access
        System.out.println("Format: " + format);
    }

    public static void main(String[] args) {
        EBook e = new EBook("987-XYZ", "Bhagavad Gita", "Krishna", "PDF");
        e.displayEBook();
        System.out.println("Author: " + e.getAuthor()); // private via public method
    }
}
