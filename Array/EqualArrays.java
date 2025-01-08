import java.util.HashMap;

public class EqualArrays {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 3};
        int[] a2 = {3, 1, 2, 1};
        boolean res = checkEquality(a1, a2);
        System.out.println(res?"Equal Arrays":"Not Equal Arrays");
    }

    public static boolean checkEquality(int[] a1, int[] a2){

        if(a1.length != a2.length){
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < a1.length; i++){
            if(map.containsKey(a1[i])){
                map.put(a1[i], map.get(a1[i]) + 1);
            }else{
                map.put(a1[i], 1);
            }
        }

        for(int i = 0; i < a2.length; i++){
            if(map.containsKey(a2[i])){
                map.put(a2[i], map.get(a2[i]) - 1);
            }else{
                return false;
            }
        }

        for(int count : map.values()){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
}
