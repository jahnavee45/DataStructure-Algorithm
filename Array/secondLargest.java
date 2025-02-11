public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {27, 10, 34, 66, 3};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j ++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Arrays after sorting: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
