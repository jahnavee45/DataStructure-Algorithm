public class numbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number left triangle:");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int k = 1;
        System.out.println("\nIncreasing number pattern triangle:");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
