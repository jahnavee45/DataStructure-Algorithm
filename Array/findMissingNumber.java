public class findMissingNumber {

    static int findNumber(int[] arr){
        int tsum = 10 * (10 + 1) / 2;
        int asum = 0;

        for(int i = 0; i < arr.length; i++){
            asum += arr[i];
        }

        return tsum - asum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        System.out.println("Missing number: " + findNumber(arr));

    }   
}
