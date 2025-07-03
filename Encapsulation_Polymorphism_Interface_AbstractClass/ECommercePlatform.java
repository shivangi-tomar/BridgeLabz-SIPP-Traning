// Interface for Taxable products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

// Electronics product - Taxable
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

// Clothing product - Taxable
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}

// Groceries product - No tax implemented
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(101, "Smartphone", 50000),
            new Clothing(102, "T-Shirt", 1000),
            new Groceries(103, "Rice Pack", 500)
        };

        for (Product product : products) {
            System.out.println("Product: " + product.getName());
            double tax = 0;
            if (product instanceof Taxable) {
                Taxable t = (Taxable) product;
                tax = t.calculateTax();
                System.out.println(t.getTaxDetails());
            }
            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Final Price after Tax and Discount: " + finalPrice);
            System.out.println();
        }
    }
}
