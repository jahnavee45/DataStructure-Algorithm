public class Employee {
    private int id;
    private String name;
    private String email;
    private String salary;

    public Employee(int id, String name, String email, String salary){
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getSalary(){
        return salary;
    }
}
