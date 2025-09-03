import java.util.*;
import java.util.stream.*;

// Student class
class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}

// Order class
class Order {
    String customer;
    double total;

    Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
}

// Employee class
class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

// Book class
class Book {
    String title;
    String genre;
    int pages;

    Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }
}

public class CollectorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Java 8 Demo: Collectors =====");
        System.out.println("1. Student Result Grouping");
        System.out.println("2. Word Frequency Counter");
        System.out.println("3. Order Revenue Summary");
        System.out.println("4. Employee Salary Categorization");
        System.out.println("5. Library Book Statistics");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println();

        switch(choice) {
            case 1: studentResultGrouping(); break;
            case 2: wordFrequencyCounter(); break;
            case 3: orderRevenueSummary(); break;
            case 4: employeeSalaryCategorization(); break;
            case 5: libraryBookStatistics(); break;
            default: System.out.println("Invalid choice!");
        }

        sc.close();
    }

    // 1. Student Result Grouping
    private static void studentResultGrouping() {
        List<Student> students = Arrays.asList(
            new Student("Riya", "A"),
            new Student("Aman", "B"),
            new Student("Neha", "A"),
            new Student("Karan", "C")
        );

        Map<String, List<String>> grouped = students.stream()
            .collect(Collectors.groupingBy(
                s -> s.grade,
                Collectors.mapping(s -> s.name, Collectors.toList())
            ));

        grouped.forEach((grade, names) -> 
            System.out.println("Grade " + grade + " -> " + names));
    }

    // 2. Word Frequency Counter
    private static void wordFrequencyCounter() {
        String paragraph = "hello world hello java world java java";
        List<String> words = Arrays.asList(paragraph.split(" "));

        Map<String, Long> frequency = words.stream()
            .collect(Collectors.toMap(
                w -> w,
                w -> 1L,
                Long::sum
            ));

        frequency.forEach((word, count) -> 
            System.out.println(word + " -> " + count));
    }

    // 3. Order Revenue Summary
    private static void orderRevenueSummary() {
        List<Order> orders = Arrays.asList(
            new Order("Customer1", 5000),
            new Order("Customer2", 3000),
            new Order("Customer1", 2000)
        );

        Map<String, Double> revenue = orders.stream()
            .collect(Collectors.groupingBy(
                o -> o.customer,
                Collectors.summingDouble(o -> o.total)
            ));

        revenue.forEach((customer, total) -> 
            System.out.println(customer + " -> Revenue: " + total));
    }

    // 4. Employee Salary Categorization
    private static void employeeSalaryCategorization() {
        List<Employee> employees = Arrays.asList(
            new Employee("Ravi", "IT", 60000),
            new Employee("Priya", "HR", 50000),
            new Employee("Aman", "IT", 70000),
            new Employee("Neha", "Finance", 55000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));

        avgSalaryByDept.forEach((dept, avg) -> 
            System.out.println(dept + " -> Avg Salary: " + avg));
    }

    // 5. Library Book Statistics
    private static void libraryBookStatistics() {
        List<Book> books = Arrays.asList(
            new Book("Book1", "Fiction", 300),
            new Book("Book2", "Fiction", 250),
            new Book("Book3", "Science", 400),
            new Book("Book4", "Science", 350),
            new Book("Book5", "History", 500)
        );

        Map<String, IntSummaryStatistics> stats = books.stream()
            .collect(Collectors.groupingBy(
                b -> b.genre,
                Collectors.summarizingInt(b -> b.pages)
            ));

        stats.forEach((genre, stat) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stat.getSum());
            System.out.println("Average Pages: " + stat.getAverage());
            System.out.println("Max Pages: " + stat.getMax());
            System.out.println("----------------------");
        });
    }
}
