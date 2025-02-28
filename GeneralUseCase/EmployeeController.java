import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeController {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "mike", "mike@gmail.com", "18000"));
        list.add(new Employee(2, "smith", "smith@gmail.com", "20000"));
        list.add(new Employee(3, "stallin", "stallin@gmail.com", "18000"));
        list.add(new Employee(4, "jack", "jack@gmail.com", " 22000"));

        System.out.println("Employee details without sorting: ");
        for (Employee e : list) {
            System.out.print(e.getId() + " " + e.getName() + " " + e.getEmail());
            System.out.println();
        }
        System.out.println();

        List<Employee> sortedList = list.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println("Employee details after sorting: ");
        for (Employee e : sortedList) {
            System.out.print(e.getId() + " " + e.getName() + " " + e.getEmail());
            System.out.println();
        }

        System.out.println();
        List<Employee> findName = list.stream()
                .filter(e -> e.getName().startsWith("s"))
                .collect(Collectors.toList());

        System.out.println("Employee details starting with letter s: ");
        for (Employee e : findName) {
            System.out.print(e.getId() + " " + e.getName() + " " + e.getEmail());
            System.out.println();
        }
    }
}
