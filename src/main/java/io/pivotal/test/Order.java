package io.pivotal.test;

/**
 * Created by bliang on 16/08/2017.
 */
public class Order {
    String orderId;
    String orderName;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Order{");
        sb.append("orderId='").append(orderId).append('\'');
        sb.append(", orderName='").append(orderName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
