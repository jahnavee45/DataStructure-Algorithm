package GeneralUseCase;

class Square {
    void area(int x){
        System.out.println("Area of square: " + x*x);
    }
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
        Square s = Rectangle::area(23, 12);
        s.area(12);
    }
}
