class Employee {
    static String companyName = "Infosys";
    static int totalEmployees = 0;
    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println(name + " (" + designation + "), ID: " + id);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Shivani", 101, "Developer");
        e1.displayDetails();
        displayTotalEmployees();
    }
}
