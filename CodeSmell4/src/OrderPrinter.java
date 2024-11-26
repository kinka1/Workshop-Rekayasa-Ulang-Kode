public class OrderPrinter {
    public void printOrderDetails(Order order) {
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Amount: $" + order.getOrderAmount());
        
    }
}
