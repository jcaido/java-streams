package streamcollectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorJoining {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "bb", "ccc", "d");

        String result = list.stream().collect(Collectors.joining());
        System.out.println(result);

        String result1 = list.stream().collect(Collectors.joining(" "));
        System.out.println(result1);

        String result2 = list.stream().collect(Collectors.joining(" ", "PRE-", "-POST"));
        System.out.println(result2);
    }
}
