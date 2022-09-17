package fastcampus.pattern.chainofresponsibility;

import fastcampus.stream.model.Order;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-17
 **/
public class OrderProcessStep {
    private final Consumer<Order> processOrder;
    private OrderProcessStep next;

    public OrderProcessStep(Consumer<Order> processOrder) {
        this.processOrder = processOrder;
    }

    public OrderProcessStep setNext(OrderProcessStep orderProcessStep) {
        if (this.next == null) {
            this.next = orderProcessStep;
        } else {
            this.next.setNext(orderProcessStep);
        }
        return this;
    }

    public void process(Order order) {
        processOrder.accept(order);
        Optional.ofNullable(next)
            .ifPresent(nextStep -> nextStep.process(order));
    }
}
