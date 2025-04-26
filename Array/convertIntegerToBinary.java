public class convertIntegerToBinary {
    public static void main(String[] args) {
        int num = 7;
        StringBuilder res= new StringBuilder();

        System.out.print("Integer: " + num + " after reversing: ");
        while(num != 0){
            int rem = num % 2;
            res.append(rem);
            num /= 2;
        }

        System.out.print(res.reverse().toString());
    }
}
