package com.mocadev.fastcampus.stream.flatmap;

import com.mocadev.fastcampus.stream.model.Order;
import com.mocadev.fastcampus.stream.model.OrderLine;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-11
 **/
public class Main {
    public static void main(String[] args) {
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
        final List<OrderLine> collect = orders.stream()
            .map(Order::getOrderLines)
            .flatMap(List::stream)
            .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
