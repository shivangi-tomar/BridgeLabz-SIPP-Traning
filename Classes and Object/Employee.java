class Employee {
    String name;
    int id;
    double salary;

    void setDetails(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.setDetails("Shivangi", 101, 55000);
        emp.display();
    }
}
