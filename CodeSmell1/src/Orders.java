import java.util.List;

public class Orders {
    private String orderId;
    private String customerName;
    private String customerPhone;
    private String customerAddres;
    private List<String> menuItems;
    private double totalPrice;
    private double tax;
    private String paymentMethod;
    private String discountCode;
    private double finalPrice;

    public boolean isNotValid() {
        return orderId == null || customerName == null || customerPhone == null || menuItems == null || totalPrice <= 0;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    
    public String getCustomerAddres() {
        return this.customerAddres;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getFinalPrice() {
        return this.finalPrice;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public String getDiscount(){
        return this.discountCode;
    }

    double getTax() {
        return this.tax;
    }

}