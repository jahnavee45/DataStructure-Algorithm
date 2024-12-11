package MapAndSet;

import java.util.HashSet;

public class isHappyNumber {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(isHappy(n) ? "Yes is happy number" : "No is not happy number");
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 0) {
            if (!set.contains(n)) {
                set.add(n);
                n = getNumber(n);
                if (n == 1) {
                    return true;
                }

            }
        }
        return false;
    }

    public static int getNumber(int n) {
        int ans = 0;

        while (n != 0) {
            int r = n % 10;
            ans = r * r;
            n /= 10;
        }
        return ans;
    }
}
