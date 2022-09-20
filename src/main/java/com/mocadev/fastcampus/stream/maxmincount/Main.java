package com.mocadev.fastcampus.stream.maxmincount;

import com.mocadev.fastcampus.stream.model.Order;
import com.mocadev.fastcampus.stream.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-12
 **/
public class Main {
    public static void main(String[] args) {
        final Optional<Integer> max = Stream.of(5, 3, 10, 1, 9)
            .max(Comparator.comparingInt(x -> x));
        System.out.println("max.get() = " + max.get());

        final User user1 = new User().setId(1001).setName("tony").setVerified(true).setEmail("tony1@test.com");
        final User user2 = new User().setId(1002).setName("micheal").setVerified(false).setEmail("tony2@gmail.com");
        final User user3 = new User().setId(1003).setName("bob").setVerified(true).setEmail("tony3@test.com");
        final User user4 = new User().setId(1004).setName("alice").setVerified(false).setEmail("tony4@test.com");
        final User user5 = new User().setId(1005).setName("chcjswo").setVerified(true).setEmail("tony5@test.com");
        List<User> users = Arrays.asList(user1, user2, user3, user4, user5);

        final User user = users.stream()
            .min(Comparator.comparing(User::getName))
            .get();
        System.out.println("user = " + user);

        final long count = Stream.of(1, -4, 3, -2, 0)
            .filter(x -> x > 0)
            .count();
        System.out.println("count = " + count);

        final LocalDateTime now = LocalDateTime.now();
        user1.setCreatedAt(now.minusDays(2));
        user2.setCreatedAt(now.minusDays(10));
        user3.setCreatedAt(now.minusHours(2));
        user4.setCreatedAt(now.minusHours(10));
        user5.setCreatedAt(now.minusHours(4));
        users = Arrays.asList(user1, user2, user3, user4, user5);

        final long count1 = users.stream()
            .filter(x -> x.getCreatedAt().isAfter(now.minusDays(1)))
            .filter(x -> !x.isVerified())
            .count();

        System.out.println("count1 = " + count1);

        final Order order1 = new Order()
            .setId(1001)
            .setStatus(Order.OrderStatus.CREATED)
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

        final Order order = orders.stream()
            .filter(x -> x.getStatus() == Order.OrderStatus.ERROR)
            .max(Comparator.comparing(Order::getAmount))
            .get();

        System.out.println("order = " + order);

        final BigDecimal bigDecimal = orders.stream()
            .filter(x -> x.getStatus() == Order.OrderStatus.ERROR)
            .map(Order::getAmount)
            .max(BigDecimal::compareTo)
            .orElse(BigDecimal.ZERO);

        System.out.println("bigDecimal = " + bigDecimal);
    }
}
