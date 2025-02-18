import java.util.ArrayList;

public class EmployeeController {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "mike","mike@gmail.com"));
        list.add(new Employee(2, "smith","smith@gmail.com"));
        list.add(new Employee(3, "stallin","stallin@gmail.com"));
        list.add(new Employee(4, "jack","jack@gmail.com"));

        for(Employee e : list){
            System.out.print(e.getId() + " " + e.getName() + " " + e.getEmail());
        }
    }
}
