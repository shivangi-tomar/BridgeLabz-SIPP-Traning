
public interface Vehicle {
    void start();
    void stop();
}

// File: Car.java
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}
