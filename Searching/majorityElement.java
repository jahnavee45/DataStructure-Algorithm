public class majorityElement {

    static int findMajority(int[] a, int n){
        int max = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[i] == a[j]){
                   count++; 
                }
            }
            if(count > n/2){
                max = a[i];
                return max;
            }
            count = 0;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {3, 3, 4, 2, 4, 4, 2, 4};
        int n = a.length;

        int res = findMajority(a, n);
        if(res == 0){
            System.out.println("No majority element found");
        }
        else{
            System.out.println("The majority element of the given element is " + res);
        }
    }
}
