public class MultiplicationMatrix {
    public static void main(String[] args) {
        int[][] a1 = {{1, 2}, {2, 3}};
        int[][] a2 = {{1, 2}, {2, 3}};
        findMultiplication(a1, a2);
    }

    public static void findMultiplication(int[][] a1, int[][] a2){
        int prod = 0, k = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                prod = prod + (a1[i][j] * a2[i][j]);
            }
            System.out.println(prod);
        }

    }
}
