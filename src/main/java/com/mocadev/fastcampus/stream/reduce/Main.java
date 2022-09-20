package com.mocadev.fastcampus.stream.reduce;

import com.mocadev.fastcampus.stream.model.Order;
import com.mocadev.fastcampus.stream.model.OrderLine;
import com.mocadev.fastcampus.stream.model.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
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
        final List<Integer> integers = Arrays.asList(1, 4, 5, -5);
        final Integer integer = integers.stream().reduce(Integer::sum).get();
        System.out.println("integer = " + integer);
        final Integer integer1 = integers.stream().reduce(11, Integer::sum);
        System.out.println("integer1 = " + integer1);

        final User user1 = new User().setId(1).setName("tony1").setFriendUserId(Arrays.asList(201, 202));
        final User user2 = new User().setId(2).setName("tony2").setFriendUserId(Arrays.asList(201, 203, 204));
        final User user3 = new User().setId(3).setName("tony3").setFriendUserId(Arrays.asList(201, 202, 204));
        final User user4 = new User().setId(4).setName("tony4").setFriendUserId(Arrays.asList(201, 202, 203));
        final User user5 = new User().setId(5).setName("tony5").setFriendUserId(Arrays.asList(201, 202, 203, 204));
        final List<User> users = Arrays.asList(user1, user2, user3, user4, user5);

        int sumOfFriends = users.stream()
            .map(User::getFriendUserId)
            .map(List::size)
            .reduce(0, Integer::sum);

        System.out.println("sumOfFriends = " + sumOfFriends);
        final Order order1 = new Order()
            .setId(1001)
            .setOrderLines(Arrays.asList(
                new OrderLine()
                    .setId(10001)
                    .setType(OrderLine.OrderLineType.PURCHASE)
                    .setAmount(BigDecimal.valueOf(5000)),
                new OrderLine()
                    .setId(10002)
                    .setType(OrderLine.OrderLineType.PURCHASE)
                    .setAmount(BigDecimal.valueOf(40000))
            ));
        final Order order2 = new Order()
            .setId(1002)
            .setOrderLines(Arrays.asList(
                new OrderLine()
                    .setId(10003)
                    .setType(OrderLine.OrderLineType.PURCHASE)
                    .setAmount(BigDecimal.valueOf(5000)),
                new OrderLine()
                    .setId(10004)
                    .setType(OrderLine.OrderLineType.DISCOUNT)
                    .setAmount(BigDecimal.valueOf(-2000))
            ));
        final Order order3 = new Order()
            .setId(1003)
            .setOrderLines(Collections.singletonList(
                new OrderLine()
                    .setId(10005)
                    .setType(OrderLine.OrderLineType.DISCOUNT)
                    .setAmount(BigDecimal.valueOf(-5000))
            ));
        final List<Order> orders = Arrays.asList(order1, order2, order3);

        final BigDecimal reduce = orders.stream()
            .map(Order::getOrderLines)
            .flatMap(List::stream)
            .map(OrderLine::getAmount)
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("reduce = " + reduce);
    }
}
