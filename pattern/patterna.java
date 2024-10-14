package pattern;

public class patterna {
    public static void main(String[] args) {
        
        int n = 5;
        int i, j;

        for(i = 1; i <= n; i++){
            for(j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(i = n-1; i >= 0; i--){
            for(j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
