package EmployeeOperations;
public class Employee {
    private int id;
    private String name;
    private String email;
    private int salary;
    private String gender;
    private int age;

    public Employee(int id, String name, String email, int salary, String gender, int age){
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
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

    public int getAge(){
        return age;
    }
}
