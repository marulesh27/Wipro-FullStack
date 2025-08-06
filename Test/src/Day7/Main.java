package Day7;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> li = new ArrayList<Employee>();
        li.add(new Employee(100, "John", 18000));
        li.add(new Employee(200, "Varun", 10000));
        li.add(new Employee(300, "Riya", 22000));

        List<Employee> filtered = li.stream()
            .filter(e -> e.salary > 15000)
            .collect(Collectors.toList());

        System.out.println("All Employees:");
        li.forEach(System.out::println);

        System.out.println("\nFiltered Employees (salary > 15000):");
        filtered.forEach(System.out::println);
    }
}
