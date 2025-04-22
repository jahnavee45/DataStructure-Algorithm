public class largestDistinctElement {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 3, 9, 4, 2};
        findThreeLargest(arr);
    }

    public static void findThreeLargest(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                    if(arr[j] < arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }

        int count = 0;
        for(int i : arr){
            System.out.println(i);
            count++;
            if(count > 2){
                break;
            }
        }
    }
}
