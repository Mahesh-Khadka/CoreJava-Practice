package Phase3_Java8_Features;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_API_Example {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Mahesh", "Sita", "Hari", "Mina", "Mohan");

        names.stream()
                .filter(n -> n.startsWith("M"))
                .forEach(System.out::println);


        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println("SUM = "+ sum);

        List<Integer>squares = nums.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squares);


        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);

        number.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);

        List<String> cricketers = Arrays.asList("Virat Kholi", "MsDhoni", "Rohit", "Sandy");
        cricketers.stream()
                .filter(n -> n.endsWith("i"))
                .forEach(System.out::println);


    }

}
