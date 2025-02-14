package StreamApi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverseString {
    public static void main(String[] args) {
        String str = "hello world";
        String rev = Stream.of(str)
         .map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));

        System.out.println("Reversed string: " + rev);
    }
}
