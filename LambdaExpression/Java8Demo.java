import java.util.*;
import java.util.function.*;
import java.util.stream.*;

// Functional Interface for Lighting
interface LightAction {
    void execute();
}

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "% off";
    }
}

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

class Invoice {
    String transactionId;
    Invoice(String transactionId) { this.transactionId = transactionId; }
    public String toString() { return "Invoice created for Transaction: " + transactionId; }
}

public class Java8Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Java 8 Demo Menu =====");
        System.out.println("1. Smart Home Lighting Automation (Lambda)");
        System.out.println("2. Custom Sorting in E-Commerce (Lambda)");
        System.out.println("3. Notification Filtering (Lambda)");
        System.out.println("4. Hospital Patient ID Printing (Method Reference)");
        System.out.println("5. Name Uppercasing (Method Reference)");
        System.out.println("6. Invoice Object Creation (Constructor Reference)");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        System.out.println();

        switch(choice) {
            case 1: smartHomeLighting(); break;
            case 2: ecommerceSorting(); break;
            case 3: notificationFiltering(); break;
            case 4: patientIDPrinting(); break;
            case 5: nameUppercasing(); break;
            case 6: invoiceCreation(); break;
            default: System.out.println("Invalid choice!");
        }

        sc.close();
    }

    // 1. Smart Home Lighting Automation
    private static void smartHomeLighting() {
        LightAction motionSensor = () -> System.out.println("Motion detected -> Lights ON (Warm White).");
        LightAction eveningTime = () -> System.out.println("Evening -> Dim yellow mood lighting.");
        LightAction voiceCommand = () -> System.out.println("Voice: 'Party Mode' -> Disco Lights!");

        motionSensor.execute();
        eveningTime.execute();
        voiceCommand.execute();
    }

    // 2. Custom Sorting in E-Commerce
    private static void ecommerceSorting() {
        List<Product> products = Arrays.asList(
            new Product("Shoes", 2000, 4.5, 20),
            new Product("Watch", 5000, 4.8, 10),
            new Product("Bag", 1500, 4.2, 30)
        );

        System.out.println("Sort by Price:");
        products.stream().sorted((p1, p2) -> Double.compare(p1.price, p2.price))
                .forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.stream().sorted((p1, p2) -> Double.compare(p2.rating, p1.rating))
                .forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.stream().sorted((p1, p2) -> Double.compare(p2.discount, p1.discount))
                .forEach(System.out::println);
    }

    // 3. Notification Filtering
    private static void notificationFiltering() {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal!"),
            new Alert("General", "New appointment scheduled."),
            new Alert("Lab", "Blood report ready.")
        );

        Predicate<Alert> criticalOnly = a -> a.type.equals("Critical");

        System.out.println("Critical Alerts Only:");
        alerts.stream().filter(criticalOnly).forEach(System.out::println);
    }

    // 4. Hospital Patient ID Printing
    private static void patientIDPrinting() {
        List<String> patientIds = Arrays.asList("P101", "P102", "P103");
        patientIds.forEach(System.out::println);
    }

    // 5. Name Uppercasing
    private static void nameUppercasing() {
        List<String> employees = Arrays.asList("Shivangi", "Amit", "Priya");
        employees.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    // 6. Invoice Object Creation
    private static void invoiceCreation() {
        List<String> txnIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");
        List<Invoice> invoices = txnIds.stream().map(Invoice::new).collect(Collectors.toList());
        invoices.forEach(System.out::println);
    }
}
