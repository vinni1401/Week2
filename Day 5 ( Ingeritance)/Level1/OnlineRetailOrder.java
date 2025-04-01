
class Order {
    int orderId;
    String orderDate;
    
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    
    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + " is placed on " + orderDate);
    }
}
class ShippedOrder extends Order {
    String trackingNumber;
    
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    
    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + " is shipped with Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    
    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + " was delivered on " + deliveryDate);
    }
}

public class OnlineRetailOrder {
    public static void main(String[] args) {
        Order order = new Order(1001, "2024-03-01");
        ShippedOrder shippedOrder = new ShippedOrder(1002, "2024-03-02", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(1003, "2024-03-03", "TRK67890", "2024-03-05");
        
        order.getOrderStatus();
        shippedOrder.getOrderStatus();
        deliveredOrder.getOrderStatus();
    }
}
