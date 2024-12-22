package GeneralUseCase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuntionFuntionalInterface {
    public static void main(String[] args) {
        List<Integer> val = Arrays.asList(10, 20, 35);
        List<Double> res = val.stream()
                .map(v -> (double)v/2).collect(Collectors.toList());
        System.out.println(res);

        val.stream().map(x -> x*x).forEach(System.out::println);

        // traditional method using function functional interface
        Function<Integer, Integer> v = x -> x*x;
        Integer r = v.apply(10);
        System.out.println(r);
    }
}
