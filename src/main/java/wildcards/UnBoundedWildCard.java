package wildcards;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCard {

    private static void printList(List<?> list) {

        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4, 5, 6, 7);
        List<Number> doubles = Arrays.asList(4.9, 5.0, 6.0, 7.0);
        
        printList(integers);
        printList(doubles);
    }
}
