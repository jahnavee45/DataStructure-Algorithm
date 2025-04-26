public class convertIntegerToBinary {
    public static void main(String[] args) {
        int num = 8;

        StringBuilder res= new StringBuilder();
        while(num != 0){
            int rem = num % 2;
            res.append(rem);
            num /= 2;
        }

        System.out.println(res.reverse().toString());
    }
}
