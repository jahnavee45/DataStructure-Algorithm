public class alphabets {
    public static void main(String[] args) {
        int i, j, n = 5;
        char ch = 'a';
        System.out.println(" Increasing alphabets in every row and column:");
        for(i = 0; i < n; i++){
            for(j = 0; j <= i; j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }

        System.out.println("Increasing alphabets in every row:");
        for(i = 0; i < n; i++){
            ch = 'a';
            for(j = 0; j <= i; j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
