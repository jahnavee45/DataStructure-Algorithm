package GeneralUseCase;

interface Welcome {
    void print();
}

class Rectangle{
    void area(int a, int b){
        System.out.println("Area of rectangle: " + a*b);
    }
}
class methodRefrence {
     public static void main(String args[])
    {
        int a = 5;
        Welcome w = Rectangle::area(23, 12);
        w.print();
    }
}
