public class ArrayInsertion {
    public static void main(String[] args) {
        String [] a = {"two", "four", "six", "nine"};
        int pos = 1; String ele = "one";

        for(int i = a.length - 1; i > pos - 1; i--){
            a[i] = a[i-1];
        }

        a[pos - 1] = ele;

        System.out.println("\nElements after adding new element at given position");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
