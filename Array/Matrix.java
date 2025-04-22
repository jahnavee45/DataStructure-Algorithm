public class matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}};
        int n = 2, m = 3;
        System.out.println("Print Matrix: ");
        printMatrix(arr, n, m);
    }

    public static void printMatrix(int[][] arr, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
