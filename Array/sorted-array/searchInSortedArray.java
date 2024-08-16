public class searchInSortedArray {
    static int searchOperation(int[] arr, int n, int key){
        int start = 0, end = n-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end--;
            }
            else if(arr[mid] < key){
                start++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int n = arr.length;
        int key = 5;
        int pos = searchOperation(arr, n, key);

        if(pos == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element " + key + " is found at position " + (pos+1));
        }
    }
}
