package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class primeNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(21, 2, 47, 36, 59);
        System.out.println("Given list is: " + list);

        List<Integer> prime = list.stream().filter(n -> isPrime(n)).collect(Collectors.toList());
        System.out.println("List of prime numbers: " + prime);
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
