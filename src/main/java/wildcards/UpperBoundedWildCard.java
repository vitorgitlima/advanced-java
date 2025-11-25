package wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCard {

    private static double sum(List<? extends Number> list){

        double sum = 0.0;

        for(Number i : list){
            sum += i.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4, 5, 6 ,7);
        List<Double> doubles = Arrays.asList(4.1, 5.1, 6.1 ,7.1);

        System.out.println("Total da soma de Inteiros é : " + sum(integers));
        System.out.println("total da soma de Doubles é : " +  sum(doubles));
    }
}
