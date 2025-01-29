class Student{

private String name;
private int age;

public String getName(){
    return name;
}

public void setName(String name){
    this.name = name;
}

public int getAge(){
    return age;
}

public void setAge(int age){
    this.age = age;
}
}

public class refernceDatatype {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("mike");
        s1.setAge(12);
        System.out.println("The student is " + s1.getName() + " of age " + s1.getAge());
    }
}
