public class ChangeZerotoOne {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1};

        System.out.println("Before converting: ");
        printArray(arr);

        convert(arr);
        System.out.println("After converting: ");
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void convert(int[] arr){
        for(int i : arr){
            if(i == 0){
                i = 1;
            }
        }
    }
}
