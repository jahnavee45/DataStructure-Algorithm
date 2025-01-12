public class Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}};
        int n = 2, m = 3;

        System.out.println("Matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
