import java.util.HashMap;
public class countTargetSumSubarray {

    public static int stockPairs(int[] a, int target){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            if(!map.containsKey(target - a[i])){
                map.put(a[i], i);
            }else{
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] stocksProfit = {5, 7, 9, 13, 11, 6, 6, 3, 3};
        int target = 12;
        int result = stockPairs(stocksProfit, target);
        System.out.println("Number of distinct pairs: " + result); // Output: 4
        }
        
    
}
