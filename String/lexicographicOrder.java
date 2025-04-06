public class lexicographicOrder {
    public static void main(String[] args) {
        String[] str = {"bde","dcf", "ght"};
        int count = countUnsortedOrder(str);
        System.out.println("Number of unsorted orders: " + count);
    }

    public static int countUnsortedOrder(String[] str){
        int m = str.length;
        String st = str[0];
        int n = st.length();
        char[][] ch = new char[m][n]; 
        
        for(String s: str){
            if(s.length() != n){
                return 0;
            }
        }

        for(int i = 0; i < m; i++){
            String word = str[i];
            for(int j = 0; j < n; j++){
                ch[i][j] = word.charAt(j);
            }
        }

        int count = 0;
        for(int j = 0; j < n; j++){
            boolean isSorted = true;
            for(int i = 0; i < m-1; i++){
                if(ch[i][j] > ch[i+1][j]){
                    isSorted = false;
                    break;
                }
            }
            if(!isSorted){
                count++;
            }
        }

        return count;
    }
}
