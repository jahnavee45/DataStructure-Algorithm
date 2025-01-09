public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int r = 2;
        System.out.println("Before rotating: ");
        printArray(arr);
        rotateArray(arr, r);
        System.out.println("After rotating: ");
        printArray(arr);
    }

    public static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void rotateArray(int[] arr, int r){
        int i = 0;
        int [] arr1 = new int[arr.length];
        for(int j = r-1; j < arr.length; j++){
            arr1[i++] = arr[j];
        }
        for(int j = 0; j < r-1; j++){
            arr1[i++] = arr[j];
        }
        for(int j = 0; j < arr1.length; j++){
            arr[j] = arr1[j];
        }
    }
}
