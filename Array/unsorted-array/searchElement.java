public class searchElement {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8};
        int ele = 4;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == ele){
                System.out.println("Element found at index " + i);
            }
        }
    }
}
