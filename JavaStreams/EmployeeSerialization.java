import java.io.*;
import java.util.ArrayList;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Department: " + department + ", Salary: " + salary);
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(101, "Amit", "IT", 50000));
        employeeList.add(new Employee(102, "Neha", "HR", 45000));
        employeeList.add(new Employee(103, "Ravi", "Finance", 47000));

        // Serialize the list
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.ser"));
            oos.writeObject(employeeList);
            oos.close();
            System.out.println("Employees serialized to 'employees.ser'");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        // Deserialize the list
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"));
            ArrayList<Employee> savedList = (ArrayList<Employee>) ois.readObject();
            ois.close();

            System.out.println("\nDeserialized Employees:");
            for (Employee emp : savedList) {
                emp.display();
            }
        } catch (IOException e) {
            System.out.println("Deserialization IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
