package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class primeNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(21, 2, 47, 36, 59);

        List<Integer> prime = list.stream().filter(PrimeFilter::isPrime).collect(Collectors.toList());
        System.out.println(prime);
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
