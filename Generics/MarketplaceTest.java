interface Category { }

class BookCategory implements Category { }
class ClothingCategory implements Category { }
class GadgetCategory implements Category { }

class Product<T extends Category> {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void setPrice(double price) { this.price = price; }
    public String toString() {
        return name + " - Rs." + price;
    }
}

class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.price - (product.price * percentage / 100);
        product.setPrice(newPrice);
    }
}

public class MarketplaceTest {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 15);

        System.out.println(book);
        System.out.println(shirt);
    }
}
