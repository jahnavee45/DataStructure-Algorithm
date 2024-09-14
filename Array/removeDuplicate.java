public class removeDuplicate {

    static int removeOperation(int[] a){

        // using hashmap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int n = 0;
        // for(int i = 0; i < a.length; i++){
        //     if(!map.containsKey(a[i])){
        //         map.put(a[i], i);
        //         a[n++] = a[i];
        //     }
        // }

        // return n;

        // using for loop
        int n = 0;
		
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] != a[i+1]) {
				a[n++] = a[i];
			}
		}
		a[n++] = a[a.length-1];
		return n;
    }

    static void printElements(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3, 3, 4, 4};
        int n = a.length;

        System.out.print("Before removing duplicates: ");
        printElements(a, n);

        n = removeOperation(a);
        System.out.print("\nAfter removing duplicates: ");
        printElements(a, n);
    }
}
