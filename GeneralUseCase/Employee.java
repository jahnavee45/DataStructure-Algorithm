public class Employee {
    private int id;
    private String name;
    private String email;
    private int salary;
    private String gender;

    public Employee(int id, String name, String email, int salary, String gender){
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.gender = gender;
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

    public int getSalary(){
        return salary;
    }

    public String getGender(){
        return gender;
    }
}
