package Phase3_Java8_Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    String department;
    Double salary;

    public Employee(int id, String name, String department, Double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return name + " (" + department + ") - Rs." + salary;
    }
}
public class Employee_Data_Processor {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Mahesh Khadka", "IT", 45000.0));
        employees.add(new Employee(2, "Sandesh Chalise", "IT", 35000.0));
        employees.add(new Employee(3,"Anup Dhungel", "Sales", 18000.0 ));
        employees.add(new Employee(4, "Virat Kohli", "HR", 28000.0));
        employees.add(new Employee(5, "Ram Chaudhary", "Sales", 18000.0));

        System.out.println(employees);

        System.out.println("***** Employees earning above 20000 ***** ");
        employees.stream()
                .filter(e -> e.salary > 20000)
                .forEach(e -> System.out.println(e.name));

        System.out.println("***** Average Salary per Department *****");
        System.out.println("\nAverage salary per department:");
        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.averagingDouble(e -> e.salary)
                ));
        avgSalary.forEach((dept, avg) ->
                System.out.println(dept + " → " + avg)
        );

        System.out.println("***** Highest Salary *****");
        Double maxSalary = employees.stream()
                .map(e -> e.salary)
                .reduce(0.0, Double::max);
        System.out.println("Rs " + maxSalary);


        System.out.println("***** Search for an employee named Mahesh Khadka *****");
        Optional<Employee> employee = employees.stream()
                .filter(e -> e.name.equalsIgnoreCase("kirs Khadka"))
                .findFirst();
        System.out.println(employee.orElse(new Employee(0, "Not Found", "-", 0.0)));
    }

}
