package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 14, 5, 36, 78, 54);
        Optional<Integer> maxNum = list.stream().max(Integer::compareTo);

        System.out.println("Maximum number is: " + maxNum.get());
    }
    
}
