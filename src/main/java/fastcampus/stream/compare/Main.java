package fastcampus.stream.compare;

import fastcampus.stream.model.Order;
import fastcampus.stream.model.User;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-09
 **/
public class Main {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(3, -5, 7, 4);
        final List<Integer> sorted = integers.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted = " + sorted);

        final User user1 = new User().setId(1).setName("tony").setVerified(true).setEmail("tony1@test.com");
        final User user2 = new User().setId(1).setName("micheal").setVerified(false).setEmail("tony2@gmail.com");
        final User user3 = new User().setId(1).setName("bob").setVerified(true).setEmail("tony3@test.com");
        final User user4 = new User().setId(1).setName("alice").setVerified(false).setEmail("tony4@test.com");
        final User user5 = new User().setId(1).setName("chcjswo").setVerified(true).setEmail("tony5@test.com");

        final List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
        final List<String> collect = users.stream()
            .sorted(Comparator.comparing(User::getName))
            .map(User::getName)
            .collect(Collectors.toList());
        System.out.println("collect = " + collect);

        int createdUserId = 201;
        int orderId = 1001;
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
        final Order order1 = new Order()
            .setId(orderId++)
            .setStatus(Order.OrderStatus.CRATED)
            .setCreatedAt(now.minusHours(4))
            .setCreatedByUserId(createdUserId++);
        final Order order2 = new Order()
            .setId(orderId++)
            .setStatus(Order.OrderStatus.ERROR)
            .setCreatedAt(now.minusHours(14))
            .setCreatedByUserId(createdUserId++);
        final Order order3 = new Order()
            .setId(orderId++)
            .setStatus(Order.OrderStatus.PROCESSED)
            .setCreatedAt(now.minusHours(24))
            .setCreatedByUserId(createdUserId++);
        final Order order4 = new Order()
            .setId(orderId++)
            .setStatus(Order.OrderStatus.ERROR)
            .setCreatedAt(now.minusHours(32))
            .setCreatedByUserId(createdUserId++);
        final Order order5 = new Order()
            .setId(orderId)
            .setStatus(Order.OrderStatus.IN_PROGRESS)
            .setCreatedAt(now.minusHours(1))
            .setCreatedByUserId(createdUserId);

        final List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
        final List<LocalDateTime> collect1 = orders.stream()
            .sorted(Comparator.comparing(Order::getCreatedAt))
            .map(Order::getCreatedAt)
            .collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
    }
}
