package fastcampus.stream.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-08
 **/
public class Order {
    private long id;
    private LocalDateTime createdAt;
    private long cratedByUserId;
    private OrderStatus status;
    private BigDecimal amount;
    private List<OrderLine> orderLines;

    public enum OrderStatus {
        CRATED,
        IN_PROGRESS,
        ERROR,
        PROCESSED
    }

    public long getId() {
        return id;
    }

    public Order setId(long id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Order setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public long getCratedByUserId() {
        return cratedByUserId;
    }

    public Order setCratedByUserId(long cratedByUserId) {
        this.cratedByUserId = cratedByUserId;
        return this;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Order setStatus(OrderStatus status) {
        this.status = status;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Order setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public Order setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", createdAt=" + createdAt + ", cratedByUserId=" + cratedByUserId + ", status=" + status + ", amount=" + amount + ", orderLines=" + orderLines + '}';
    }
}
