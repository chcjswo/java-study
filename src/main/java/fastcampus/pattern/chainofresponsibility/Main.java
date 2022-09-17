package fastcampus.pattern.chainofresponsibility;

import fastcampus.stream.model.Order;
import fastcampus.stream.model.Order.OrderStatus;
import fastcampus.stream.model.OrderLine;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-17
 **/
public class Main {
    public static void main(String[] args) {
        OrderProcessStep initStep = new OrderProcessStep(order -> {
            if (order.getStatus() == OrderStatus.CREATED) {
                System.out.println("Start processing order " + order.getId());
                order.setStatus(OrderStatus.IN_PROGRESS);
            }
        });

        OrderProcessStep setOrderAmountStep = new OrderProcessStep(order -> {
            if (order.getStatus() == OrderStatus.IN_PROGRESS) {
                System.out.println("Setting amount of order " + order.getId());
                order.setAmount(order.getOrderLines().stream()
                    .map(OrderLine::getAmount)
                    .reduce(BigDecimal.ZERO, BigDecimal::add));
            }
        });

        OrderProcessStep verifyOrderStep = new OrderProcessStep(order -> {
            if (order.getStatus() == OrderStatus.IN_PROGRESS) {
                System.out.println("Verifying order " + order.getId());
                if (order.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
                    order.setStatus(OrderStatus.ERROR);
                }
            }
        });

        OrderProcessStep processPaymentStep = new OrderProcessStep(order -> {
            if (order.getStatus() == OrderStatus.IN_PROGRESS) {
                System.out.println("Processing payment of order " + order.getId());
                order.setStatus(OrderStatus.PROCESSED);
            }
        });

        OrderProcessStep handleErrorStep = new OrderProcessStep(order -> {
            if (order.getStatus() == OrderStatus.ERROR) {
                System.out.println("Sending out fail process order " + order.getId());
            }
        });

        OrderProcessStep completeProcessingOrderStep = new OrderProcessStep(order -> {
            if (order.getStatus() == OrderStatus.PROCESSED) {
                System.out.println("Finished processing order " + order.getId());
            }
        });

        OrderProcessStep chainProcessSteps = initStep
            .setNext(setOrderAmountStep)
            .setNext(verifyOrderStep)
            .setNext(processPaymentStep)
            .setNext(handleErrorStep)
            .setNext(completeProcessingOrderStep);

        final Order order1 = new Order()
            .setId(1001)
            .setStatus(OrderStatus.CREATED)
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

        chainProcessSteps.process(order1);

        final Order order2 = new Order()
            .setId(1001)
            .setStatus(OrderStatus.CREATED)
            .setOrderLines(Arrays.asList(
                new OrderLine()
                    .setId(10001)
                    .setType(OrderLine.OrderLineType.PURCHASE)
                    .setAmount(BigDecimal.valueOf(5000)),
                new OrderLine()
                    .setId(10002)
                    .setType(OrderLine.OrderLineType.PURCHASE)
                    .setAmount(BigDecimal.valueOf(-40000))
            ));

        chainProcessSteps.process(order2);
    }
}
