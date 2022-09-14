package fastcampus.stream.tomap;

import fastcampus.stream.model.Order;
import fastcampus.stream.model.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-15
 **/
public class Main {
    public static void main(String[] args) {
        final Map<Integer, String> collect = Stream.of(3, 5, -4, 2, 6)
            .collect(Collectors.toMap(Function.identity(), x -> "Number is " + x));
        System.out.println("collect = " + collect);

        final User user1 = new User().setId(1001).setName("tony").setVerified(true).setEmail("tony1@test.com");
        final User user2 = new User().setId(1002).setName("micheal").setVerified(false).setEmail("tony2@gmail.com");
        final User user3 = new User().setId(1003).setName("bob").setVerified(true).setEmail("tony3@test.com");
        final User user4 = new User().setId(1004).setName("alice").setVerified(false).setEmail("tony4@test.com");
        final User user5 = new User().setId(1005).setName("chcjswo").setVerified(true).setEmail("tony5@test.com");
        List<User> users = Arrays.asList(user1, user2, user3, user4, user5);

        final Map<Integer, User> collect1 = users.stream()
            .collect(Collectors.toMap(User::getId, Function.identity()));
        System.out.println("collect1 = " + collect1);
        System.out.println(collect1.get(1005));
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

        final Map<Long, Order.OrderStatus> collect2 = orders.stream()
            .collect(Collectors.toMap(Order::getId, Order::getStatus));
        System.out.println("collect2 = " + collect2);
    }
}
