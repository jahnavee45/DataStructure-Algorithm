public class deleteElement {

    static int findElement(int[] arr, int n, int key){
        int i;

        for(i = 0; i < n; i++){
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }

    static int removeElement(int[] arr, int n, int key){
        int pos = findElement(arr, n, key);

        if(pos == -1){
            System.out.print("\nElement not found");
            return n;
        }

        for(int i = pos; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        return n-1;
    }
public static void main(String[] args) {
    int [] arr = {5, 2, 6, 3, 7, 4};
    int key = 2;
    int n = arr.length;

    System.out.print("Before deleting: ");
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");
    }

    n = removeElement(arr, n, key);
    System.out.print("\nAfter deletion: ");
    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");
    }

}    
}
