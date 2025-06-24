public class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }

    // MAIN method here!
    public static void main(String[] args) {
        Employee emp = new Employee("Shivangi", 101, 50000);
        emp.displayDetails();
    }
}
