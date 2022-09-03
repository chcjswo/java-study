package fastcampus.functional.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-03
 **/
public class Main {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("test");
        final List<String> inputs = Arrays.asList("test1", "test2", "test3");
        process(inputs, consumer);
        Consumer<String> consumer1 = (String str) -> {
            System.out.println("process start = " + str);
        };
        process(inputs, consumer1);
    }

    public static void process(List<String> inputs, Consumer<String> processor) {
        for (String input : inputs) {
            processor.accept(input);
        }
    }
}
