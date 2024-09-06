public class amstrongWithoutLoop {

    static int returnArmstrong(int n, int sum){
        if(n == 0){
            return sum;
        }

        sum = (int) (sum + Math.pow((n%10), 3));
        return returnArmstrong(n/10, sum);
    }
    public static void main(String[] args) {
        int n = 154;
        int sum = 0;
        int res = returnArmstrong(n, sum);

        if(res == n){
            System.out.println("Is Armstrong number");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
