public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int r = 2;

        printArray(arr);
    }

    public static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
