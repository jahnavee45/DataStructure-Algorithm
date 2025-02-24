package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFuntionalInterface {

    public static void main(String[] args) {
        List<Employee> data = Arrays.asList(
                new Employee(1, "John", 10000),
                new Employee(2, "Alice", 9000),
                new Employee(3, "Bob", 8000));

        List<Employee> newData = data.stream()
                .filter(d -> d.getSalary() > 8000).collect(Collectors.toList());
        for (Employee employee : newData) {
            System.out.print(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            System.out.println();
        }

        // traditional way of using predicate functional interface
        Predicate<Employee> predicate = (e) -> e.getName().startsWith("J");
        List<Employee> newDataTraditional = data.stream()
                .filter(predicate).collect(Collectors.toList());
        for (Employee employee : newDataTraditional) {
            System.out.print(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            System.out.println();
        }

        // second largest salary

        // sorting list in descending order
        List<Employee> sortSalary = data.stream()
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()))
                .collect(Collectors.toList());

        if (sortSalary.size() > 1) {
            Employee res = sortSalary.get(1);
            System.out.print(res.getId() + " " + res.getName() + " " + res.getSalary());
        } else {
            System.out.println("No second largest salary present!");
        }
    }
}
