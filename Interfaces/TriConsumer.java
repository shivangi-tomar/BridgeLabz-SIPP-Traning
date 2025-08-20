
@FunctionalInterface
public interface TriConsumer<A,B,C> {
    void accept(A a, B b, C c);

    // default method allowed
    default TriConsumer<A,B,C> andThen(TriConsumer<A,B,C> after) {
        return (a,b,c) -> {
            accept(a,b,c);
            after.accept(a,b,c);
        };
    }
}

// File: TestLambda.java
public class TestLambda {
    public static void main(String[] args) {
        TriConsumer<String,Integer,Double> printer = (name, age, salary) -> {
            System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
        };

        TriConsumer<String,Integer,Double> logger = (n,a,s) -> {
            System.out.println("[LOG] Record processed");
        };

        // chaining with andThen()
        TriConsumer<String,Integer,Double> combined = printer.andThen(logger);

        combined.accept("Shivangi", 22, 55000.0);
    }
}
