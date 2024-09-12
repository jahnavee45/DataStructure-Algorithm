public class removeDuplicates {

    static void printElements(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 2, 2, 2};
        int n = arr.length;

        System.out.print("Before removng duplicate: ");
        printElements(arr);
    }
}
