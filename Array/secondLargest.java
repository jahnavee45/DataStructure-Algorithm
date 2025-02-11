public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {27, 10, 34, 66, 3};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Arrays after sorting: ");
        for(int i:arr){
            System.out.print(i + " ");
        }

        System.out.println("\nThe second largest element is: " + arr[1]);
    }
}
