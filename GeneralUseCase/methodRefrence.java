package GeneralUseCase;

interface Welcome {
    void print();
}

class Rectangle{
    int a; int b;
    void area(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Area of rectangle: " + a*b);
    }
}
class methodRefrence {
     public static void main(String args[])
    {
        Rectangle rec = new Rectangle();
        rec.area(23, 12);
        int a = 5;
        Welcome w = rec::area;
        w.print();
    }
}
