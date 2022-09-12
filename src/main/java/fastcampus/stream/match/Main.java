package fastcampus.stream.match;

import fastcampus.stream.model.Order;
import fastcampus.stream.model.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-13
 **/
public class Main {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(3, -4, 2, 7, 9);
        final boolean allPositive = integers.stream().allMatch(x -> x > 0);
        System.out.println("allPositive = " + allPositive);
        final boolean anyMatch = integers.stream().anyMatch(x -> x < 0);
        System.out.println("anyMatch = " + anyMatch);

        final User user1 = new User().setId(1001).setName("tony").setVerified(true).setEmail("tony1@test.com");
        final User user2 = new User().setId(1002).setName("micheal").setVerified(false).setEmail("tony2@gmail.com");
        final User user3 = new User().setId(1003).setName("bob").setVerified(true).setEmail("tony3@test.com");
        final User user4 = new User().setId(1004).setName("alice").setVerified(false).setEmail("tony4@test.com");
        final User user5 = new User().setId(1005).setName("chcjswo").setVerified(true).setEmail("tony5@test.com");
        List<User> users = Arrays.asList(user1, user2, user3, user4, user5);

        final boolean allVerified = users.stream().allMatch(User::isVerified);
        System.out.println("allVerified = " + allVerified);

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

        final boolean anyErrorStatus = orders.stream().anyMatch(x -> x.getStatus() == Order.OrderStatus.ERROR);
        System.out.println("anyErrorStatus = " + anyErrorStatus);
    }
}
