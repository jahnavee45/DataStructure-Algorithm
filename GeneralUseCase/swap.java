public class swap {
    public static void main(String[] args) {
        int a = 78;
        int b = 67;

        System.out.println("Before swapping a = " + a + " and b = " + b);
        a = a + b - a;
        b = a - b;
        System.out.println("After swapping a = " + a + " and b = " + b);

    }
}
