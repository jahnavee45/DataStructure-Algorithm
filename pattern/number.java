public class number {
    public static void main(String[] args) {
        int i, j, n = 5;

        int count = 1;
        for(i = 0; i < n; i++){
            for(j = 0; j <= i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
