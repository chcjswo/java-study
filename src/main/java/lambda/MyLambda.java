package lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by chcjswo on 2020-02-29
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class MyLambda {
    public static void main(String[] args) {
        String[] arr = {"abc", "bbb", "aaa", "ddd", "ccc"};
        List<String> list = Arrays.asList(arr);
        list.forEach(System.out::println);

        Stream<String> st = list.stream();

        List<String> list2 = st.sorted().collect(Collectors.toList());
        System.out.println(list2);

        IntStream a = new Random().ints(1, 10);
        a.boxed().limit(6).distinct().sorted().forEach(System.out::println);

        System.out.println("===============================================");

        List<Integer> range = IntStream.range(1, 46).boxed().collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(range);
        range.subList(0, 6).forEach(System.out::println);

        System.out.println("===============================================");

        Random r = new Random();
        int[] rang = IntStream
            .generate( () -> r.nextInt(46) + 1)
            .distinct().limit(6).sorted().toArray();
        System.out.println(Arrays.toString(rang));
    }
}
