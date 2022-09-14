package fastcampus.stream.groupingby;

import fastcampus.stream.model.Order;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-15
 **/
public class Main {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(1, 4, 5, 13, 2, 1001, 21, 24, 55, 66, 2321, 343, 21345, 1001);
        final Map<Integer, List<Integer>> collect = integers.stream()
            .collect(Collectors.groupingBy(x -> x % 10));
        System.out.println("collect = " + collect);

        final Map<Integer, Set<Integer>> collect1 = integers.stream()
            .collect(Collectors.groupingBy(x -> x % 10,
                Collectors.toSet()));
        System.out.println("collect1 = " + collect1);

        final Map<Integer, List<String>> collect2 = integers.stream()
            .collect(Collectors.groupingBy(x -> x % 10,
                Collectors.mapping(x -> "digit is " + x,
                    Collectors.toList())));
        System.out.println("collect2 = " + collect2);
        final Order order1 = new Order()
            .setId(1001)
            .setStatus(Order.OrderStatus.CRATED)
            .setAmount(BigDecimal.valueOf(3000));
        final Order order2 = new Order()
            .setId(1002)
            .setStatus(Order.OrderStatus.ERROR)
            .setAmount(BigDecimal.valueOf(7000));
        final Order order3 = new Order()
            .setId(1003)
            .setStatus(Order.OrderStatus.PROCESSED)
            .setAmount(BigDecimal.valueOf(28000));
        final Order order4 = new Order()
            .setId(1004)
            .setStatus(Order.OrderStatus.ERROR)
            .setAmount(BigDecimal.valueOf(15000));
        final Order order5 = new Order()
            .setId(1005)
            .setStatus(Order.OrderStatus.IN_PROGRESS)
            .setAmount(BigDecimal.valueOf(1000));
        final List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);

        final Map<Order.OrderStatus, List<Order>> collect3 = orders.stream()
            .collect(Collectors.groupingBy(Order::getStatus, Collectors.toList()));
        System.out.println("collect3 = " + collect3);

        final Map<Order.OrderStatus, BigDecimal> collect4 = orders.stream()
            .collect(Collectors.groupingBy(Order::getStatus,
                Collectors.mapping(Order::getAmount,
                    Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))));
        System.out.println("collect4 = " + collect4);
    }
}
