import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeController {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "mike", "mike@gmail.com"));
        list.add(new Employee(2, "smith", "smith@gmail.com"));
        list.add(new Employee(3, "stallin", "stallin@gmail.com"));
        list.add(new Employee(4, "jack", "jack@gmail.com"));

        System.out.println("Employee details without sorting: ");
        for (Employee e : list) {
            System.out.print(e.getId() + " " + e.getName() + " " + e.getEmail());
            System.out.println();
        }

        List<Employee> sortedList = list.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println("Employee details after sorting: ");
        for (Employee e : sortedList) {
            System.out.print(e.getId() + " " + e.getName() + " " + e.getEmail());
            System.out.println();
        }
    }
}
