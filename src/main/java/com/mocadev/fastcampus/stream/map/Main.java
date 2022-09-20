package com.mocadev.fastcampus.stream.map;

import com.mocadev.fastcampus.stream.model.Order;
import com.mocadev.fastcampus.stream.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-08
 **/
public class Main {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(3, 6, -4);
        final List<Integer> integerList = integers.stream()
            .map(m -> m * 2)
            .collect(Collectors.toList());
        System.out.println("integerList = " + integerList);

        final List<String> collect = integers.stream()
            .map(x -> "Number is " + x)
            .collect(Collectors.toList());
        System.out.println("collect = " + collect);

        final User user1 = new User().setId(1).setName("tony1").setVerified(true).setEmail("tony1@test.com");
        final User user2 = new User().setId(1).setName("tony2").setVerified(false).setEmail("tony2@gmail.com");
        final User user3 = new User().setId(1).setName("tony3").setVerified(true).setEmail("tony3@test.com");
        final User user4 = new User().setId(1).setName("tony4").setVerified(false).setEmail("tony4@test.com");
        final User user5 = new User().setId(1).setName("tony5").setVerified(true).setEmail("tony5@test.com");

        final List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
        final List<String> userEmails = users.stream()
            .map(User::getEmail)
            .collect(Collectors.toList());
        System.out.println("userEmails = " + userEmails);

        int createdUserId = 101;
        final Order order1 = new Order()
            .setId(1001)
            .setStatus(Order.OrderStatus.CREATED)
            .setCreatedByUserId(createdUserId++);
        final Order order2 = new Order()
            .setId(1001)
            .setStatus(Order.OrderStatus.ERROR)
            .setCreatedByUserId(createdUserId++);
        final Order order3 = new Order()
            .setId(1001)
            .setStatus(Order.OrderStatus.PROCESSED)
            .setCreatedByUserId(createdUserId++);
        final Order order4 = new Order()
            .setId(1001)
            .setStatus(Order.OrderStatus.ERROR)
            .setCreatedByUserId(createdUserId++);
        final Order order5 = new Order()
            .setId(1001)
            .setStatus(Order.OrderStatus.IN_PROGRESS)
            .setCreatedByUserId(createdUserId);

        final List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
        final List<Long> collect1 = orders.stream()
            .map(Order::getCreatedByUserId)
            .collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
    }
}
