public class primeNumbers {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 2; j <= n; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(i + " ");
            }
            count = 0;
        }
    }
}
