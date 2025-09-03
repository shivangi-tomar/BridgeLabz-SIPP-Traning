import java.util.*;
import java.util.stream.*;
import java.time.*;

// Movie class for demo
class Movie {
    String title;
    double rating;
    int year;

    Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    public String toString() {
        return title + " | Rating: " + rating + " | Year: " + year;
    }
}

// Doctor class
class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    public String toString() {
        return name + " (" + specialty + ")";
    }
}

// Insurance Claim
class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

// Gym Member
class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}

public class StreamAPIAndForEachDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Java 8 Demo: Stream API & forEach =====");
        System.out.println("1. Top 5 Trending Movies (Stream API)");
        System.out.println("2. Hospital Doctor Availability (Stream API)");
        System.out.println("3. Insurance Claim Analysis (Stream API)");
        System.out.println("4. Filtering Expiring Memberships (Stream API)");
        System.out.println("5. Transforming Names for Display (Stream API)");
        System.out.println("6. Stock Price Logger (forEach)");
        System.out.println("7. Event Attendee Welcome Message (forEach)");
        System.out.println("8. IoT Sensor Readings (forEach)");
        System.out.println("9. Email Notifications (forEach)");
        System.out.println("10. Logging Transactions (forEach)");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        System.out.println();

        switch(choice) {
            case 1: trendingMovies(); break;
            case 2: doctorAvailability(); break;
            case 3: insuranceClaimAnalysis(); break;
            case 4: expiringMemberships(); break;
            case 5: transformingNames(); break;
            case 6: stockPriceLogger(); break;
            case 7: attendeeWelcome(); break;
            case 8: sensorReadings(); break;
            case 9: emailNotifications(); break;
            case 10: loggingTransactions(); break;
            default: System.out.println("Invalid choice!");
        }

        sc.close();
    }

    // 1. Top 5 Trending Movies
    private static void trendingMovies() {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2024),
            new Movie("Movie B", 9.1, 2025),
            new Movie("Movie C", 7.8, 2023),
            new Movie("Movie D", 9.3, 2025),
            new Movie("Movie E", 8.7, 2025),
            new Movie("Movie F", 9.0, 2025)
        );

        movies.stream()
              .filter(m -> m.year >= 2024)
              .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating))
              .limit(5)
              .forEach(System.out::println);
    }

    // 2. Hospital Doctor Availability
    private static void doctorAvailability() {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Sharma", "Cardiology", true),
            new Doctor("Dr. Mehta", "Neurology", false),
            new Doctor("Dr. Gupta", "Orthopedic", true)
        );

        doctors.stream()
               .filter(d -> d.availableOnWeekend)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(System.out::println);
    }

    // 3. Insurance Claim Analysis
    private static void insuranceClaimAnalysis() {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 12000),
            new Claim("Car", 8000),
            new Claim("Health", 15000),
            new Claim("Car", 6000),
            new Claim("Home", 20000)
        );

        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(c -> c.type, Collectors.averagingDouble(c -> c.amount)));

        avgClaims.forEach((type, avg) -> System.out.println(type + " -> Avg Claim: " + avg));
    }

    // 4. Filtering Expiring Memberships
    private static void expiringMemberships() {
        List<Member> members = Arrays.asList(
            new Member("Riya", LocalDate.now().plusDays(10)),
            new Member("Aman", LocalDate.now().plusDays(40)),
            new Member("Neha", LocalDate.now().plusDays(25))
        );

        LocalDate today = LocalDate.now();
        members.stream()
               .filter(m -> !m.expiryDate.isBefore(today) && m.expiryDate.isBefore(today.plusDays(30)))
               .forEach(System.out::println);
    }

    // 5. Transforming Names for Display
    private static void transformingNames() {
        List<String> customers = Arrays.asList("Shivangi", "Rahul", "Anita", "Karan");
        customers.stream()
                 .map(String::toUpperCase)
                 .sorted()
                 .forEach(System.out::println);
    }

    // 6. Stock Price Logger
    private static void stockPriceLogger() {
        List<Double> prices = Arrays.asList(101.5, 102.8, 100.9, 105.2);
        prices.forEach(price -> System.out.println("Stock Price: " + price));
    }

    // 7. Event Attendee Welcome Message
    private static void attendeeWelcome() {
        List<String> attendees = Arrays.asList("Ravi", "Priya", "Sohan");
        attendees.forEach(name -> System.out.println("Welcome, " + name + "!"));
    }

    // 8. IoT Sensor Readings
    private static void sensorReadings() {
        List<Integer> readings = Arrays.asList(45, 60, 30, 75, 90);
        int threshold = 50;
        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("High Reading: " + r));
    }

    // 9. Email Notifications
    private static void emailNotifications() {
        List<String> emails = Arrays.asList("a@gmail.com", "b@gmail.com", "c@gmail.com");
        emails.forEach(email -> System.out.println("Sending email to: " + email));
    }

    // 10. Logging Transactions
    private static void loggingTransactions() {
        List<String> transactionIds = Arrays.asList("TX100", "TX200", "TX300");
        transactionIds.forEach(id -> 
            System.out.println(LocalDateTime.now() + " -> Transaction Logged: " + id));
    }
}
