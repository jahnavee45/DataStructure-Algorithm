public class VPattern {
    public static void main(String[] args) {
        int i, j, n = 5;

        for(i = n-1; i > 0; i--){
            for(j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(i = 0; i < n; i++){
            for(j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
