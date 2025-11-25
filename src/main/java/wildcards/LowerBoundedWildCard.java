package wildcards;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCard {

    private static void printOnlyIntegerClassSuperClass(List<? super Integer> list) {

        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4, 5, 6, 7);
        List<Number> numbers = Arrays.asList(4.9, 5.0, 6, 7);
        
        printOnlyIntegerClassSuperClass(integers);
        printOnlyIntegerClassSuperClass(numbers);
    }
}
