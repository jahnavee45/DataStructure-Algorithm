public class unionIntersection {

    static int findIntersection(int[] a1, int m, int[] a2, int n){
        int k = 0;
        for(int i = 0; i < m; i++){
            for(int  j = 0; j < n; j++){
                if(a1[i] == a2[j]){
                    a1[k++] = a1[i]; 
                }
            }
        }
        
        return k;
    }
    static void findUnion(int[] a1, int m, int[] a2, int n, int[] a3){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j >= 0){
            if(i >= 0 && a1[i] > a2[j]){
                a3[k--] = a1[i--];
            }else{
                a3[k--] = a2[j--];
            }
        }

        if(i >= 0){
            a3[k--] = a1[i--];
        }
    }
    public static void main(String[] args) {
        int[] a1 = {2, 3, 4};
        int[] a2 = {1, 2, 3, 5};
        int m = a1.length;
        int n = a2.length;
        int[] a3 = new int[m+n];

        System.out.println("Before Union & Intersection");
        for(int i = 0; i < m; i++){
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(a2[i] + " ");
        }

        findUnion(a1, m, a2, n, a3);

        System.out.print("\nAfter Union: ");
        for(int i = 0; i < a3.length; i++){
            System.out.print(a3[i] + " ");
        }

        int j = findIntersection(a1, m , a2, n);

        System.out.print("\nAfter Intersection: ");
        for(int i = 0; i < j; i++){
            System.out.print(a1[i] + " ");
        }
    }
}
