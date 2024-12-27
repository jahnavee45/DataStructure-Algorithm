package StreamApi;

@FunctionalInterface
interface Square {
    int calculate(int x);
    static void printHello(){
        System.out.println("Hello world!");
    }
}
class funtionalInterface {
     public static void main(String args[])
    {
        int a = 5;
        Square s = (int x) -> x * x;
        int ans = s.calculate(a);
        System.out.println(ans);
        Square.printHello();
    }
}
