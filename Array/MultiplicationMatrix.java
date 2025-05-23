public class multiplicationMatrix {
    public static void main(String[] args) {
        int[][] a1 = {{1, 2}, {2, 3}};
        int[][] a2 = {{1, 2}, {2, 3}};
        findMultiplication(a1, a2);
    }

    public static void findMultiplication(int[][] a1, int[][] a2){
        int prod = 0;
        for(int i = 0; i < 2; i++){ // 2 = rows in a1
            for(int j = 0; j < 2; j++){ // 2 = cols in a2
                prod = 0;
                for(int k = 0; k < 2; k++){ // 2 = cols in a1
                    prod = prod + (a1[i][k] * a2[k][j]);
                }
                System.out.print(prod + " ");
            }
            System.out.println();
        }

    }
}
