public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {27, 10, 34, 66, 3};

        System.out.println("Array before sorting: ");
        for(int i:arr){
            System.out.print(i + " ");
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\nArray after sorting: ");
        for(int i:arr){
            System.out.print(i + " ");
        }

        System.out.println("\nSecond largest element is: " + arr[1]);
    }
}
