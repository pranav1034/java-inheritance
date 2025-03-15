import java.time.LocalDate;

// Base class: Order
class Order {
    protected String orderId;
    protected LocalDate orderDate;

    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

// Subclass: ShippedOrder (extends Order)
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);  // Call superclass constructor
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped with Tracking No: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder (extends ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);  // Call superclass constructor
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }

    public static void main(String[] args) {
        // Order created
        Order order = new Order("1234", LocalDate.of(2025, 2, 21));
        order.displayOrderDetails();
        System.out.println();
        // Order shipped
        ShippedOrder shippedOrder = new ShippedOrder("1234", LocalDate.of(2025, 2, 21), "TR987654");
        shippedOrder.displayOrderDetails();
        System.out.println();
        // Order delivered
        DeliveredOrder deliveredOrder = new DeliveredOrder("1234", LocalDate.of(2025, 2, 21), "TRK987654", LocalDate.of(2025, 2, 23));
        deliveredOrder.displayOrderDetails();
    }
}
