
public class DiscountCalculation {

    public double calculateFinalPrice(Orders order) {
        if (order.getDiscount() != null && !order.getDiscount().isEmpty()) {
            double discount = applyDiscount(order.getDiscount(), order.getTotalPrice());
            return order.getTotalPrice() + order.getTax() - discount;
        } else {
            return order.getTotalPrice() + order.getTax(); 
        }
    }

    private double applyDiscount(String discountCode, double totalPrice) {
        if ("DISC10".equals(discountCode)) {
            return totalPrice * 0.10;
        } else if ("DISC20".equals(discountCode)) {
            return totalPrice * 0.20;
        }
        return 0;
    }
}
