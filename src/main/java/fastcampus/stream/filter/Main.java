package fastcampus.stream.filter;


import fastcampus.stream.model.Order;
import fastcampus.stream.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-06
 **/
public class Main {

    public static void main(String[] args) {
        final Stream<Integer> numberStream = Stream.of(3, -5, 7, 9, 0, -1);
        final Stream<Integer> filterNumbers = numberStream.filter(x -> x > 0);
        final List<Integer> numberList = filterNumbers.collect(Collectors.toList());
        System.out.println("numberList = " + numberList);

        final List<Integer> collect = Stream.of(3, -5, 7, 9, 0, -1)
            .filter(x -> x > 0)
            .collect(Collectors.toList());
        System.out.println("collect = " + collect);

        final User user1 = new User().setId(1).setName("tony1").setVerified(true).setEmail("tony1@test.com");
        final User user2 = new User().setId(1).setName("tony2").setVerified(false).setEmail("tony2@gmail.com");
        final User user3 = new User().setId(1).setName("tony3").setVerified(true).setEmail("tony3@test.com");
        final User user4 = new User().setId(1).setName("tony4").setVerified(false).setEmail("tony4@test.com");
        final User user5 = new User().setId(1).setName("tony5").setVerified(true).setEmail("tony5@test.com");

        final List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
        final List<User> verifiedUsers = users.stream()
            .filter(User::isVerified)
            .collect(Collectors.toList());
        System.out.println("verifiedUsers = " + verifiedUsers);
        System.out.println(verifiedUsers.size());

        final List<User> unverifiedUsers = users.stream()
            .filter(user -> !user.isVerified())
            .collect(Collectors.toList());
        System.out.println("unverifiedUsers = " + unverifiedUsers);
        System.out.println(unverifiedUsers.size());

        final Order order1 = new Order().setId(1001).setStatus(Order.OrderStatus.CRATED);
        final Order order2 = new Order().setId(1001).setStatus(Order.OrderStatus.ERROR);
        final Order order3 = new Order().setId(1001).setStatus(Order.OrderStatus.PROCESSED);
        final Order order4 = new Order().setId(1001).setStatus(Order.OrderStatus.ERROR);
        final Order order5 = new Order().setId(1001).setStatus(Order.OrderStatus.IN_PROGRESS);

        final List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
        final List<Order> errorOrders = orders.stream()
            .filter(order -> order.getStatus() == Order.OrderStatus.ERROR)
            .collect(Collectors.toList());
        System.out.println("errorOrders = " + errorOrders);
    }
}
