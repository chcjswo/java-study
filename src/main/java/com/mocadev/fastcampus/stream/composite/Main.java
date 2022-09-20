package com.mocadev.fastcampus.stream.composite;

import com.mocadev.fastcampus.stream.model.Order;
import com.mocadev.fastcampus.stream.model.User;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
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
        final User user1 = new User().setId(1).setName("tony1").setVerified(true).setEmail("tony1@test.com");
        final User user2 = new User().setId(1).setName("tony2").setVerified(false).setEmail("tony2@gmail.com");
        final User user3 = new User().setId(1).setName("tony3").setVerified(true).setEmail("tony3@test.com");
        final User user4 = new User().setId(1).setName("tony4").setVerified(false).setEmail("tony4@test.com");
        final User user5 = new User().setId(1).setName("tony5").setVerified(true).setEmail("tony5@test.com");

        final List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
        final List<String> collect = users.stream()
            .filter(User::isVerified)
            .map(User::getEmail)
            .collect(Collectors.toList());
        System.out.println("collect = " + collect);

        int createdUserId = 201;
        int orderId = 1001;
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
        final Order order1 = new Order()
            .setId(orderId++)
            .setStatus(Order.OrderStatus.CREATED)
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
        final List<Long> collect1 = orders.stream()
            .filter(m -> m.getStatus() == Order.OrderStatus.ERROR)
            .map(Order::getCreatedByUserId)
            .collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
        final List<Order> collect2 = orders.stream()
            .filter(m -> m.getStatus() == Order.OrderStatus.ERROR)
            .filter(m -> m.getCreatedAt().isAfter(now.minusHours(24)))
            .collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);
    }
}
