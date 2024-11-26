
public class OrderProcessorNew {
    private final DiscountCalculation discountCalculation;
    private final SaveOrder saveOrder;
    private final NotificationService notificationService;

    public OrderProcessorNew(DiscountCalculation discountCalculation, SaveOrder saveOrder, NotificationService notificationService) {
        this.discountCalculation = discountCalculation;
        this.saveOrder = saveOrder;
        this.notificationService = notificationService;
    }

    public void ProcessOrder(Orders order) {
        if (order.isNotValid()) {
            System.out.println("Pesanan tidak valid");
            return;
        }
        double finalPrice = this.discountCalculation.calculateFinalPrice(order);
        order.setFinalPrice(finalPrice);

        this.saveOrder.saveOrder(order);
        this.notificationService.sendNotification(order.getCustomerPhone(), "Pesanan Anda telah diproses dengan total: " + finalPrice);
    }
}
