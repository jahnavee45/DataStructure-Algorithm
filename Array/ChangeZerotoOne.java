public class ChangeZerotoOne {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1};

        System.out.println("Before converting: ");
        printArray(arr);
        convert(arr);
        System.out.println("\nAfter converting: ");
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void convert(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            }
            else if(arr[i] == 1){
                arr[i] = 0;
            }
        }
    }
}
