public class removeDuplicate {

    static int removeOperation(int[] a){
        int n = 0;
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] != a[i+1]) {
				a[n++] = a[i];
			}
		}
		a[n++] = a[a.length-1];
		return n;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 4, 5, 5};
        int n = a.length;

        System.out.print("Before removing duplicates: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

        n = removeOperation(a);
        System.out.print("\nAfter removing duplicates: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
