
public interface PaymentProcessor {
    void processPayment(double amount);

    // Default method
    default boolean validate() {
        return true;
    }

    // Static method
    static void logTransaction(String message) {
        System.out.println("[LOG] " + message);
    }
}

// File: CreditCardProcessor.java
public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        if (validate()) {
            System.out.println("Processing credit card payment of ₹" + amount);
            PaymentProcessor.logTransaction("Credit Card payment processed");
        }
    }

    public static void main(String[] args) {
        PaymentProcessor p = new CreditCardProcessor();
        p.processPayment(5000);
    }
}
