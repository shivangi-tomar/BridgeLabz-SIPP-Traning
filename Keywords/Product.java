class Product {
    static int discount = 10;
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(int newDiscount) {
        discount = newDiscount;
    }

    void display() {
        if (this instanceof Product) {
            System.out.println(productName + " (ID: " + productID + "), Price: " + price + ", Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 55000, 2);
        p1.display();
        updateDiscount(15);
        System.out.println("Discount: " + discount + "%");
    }
}
