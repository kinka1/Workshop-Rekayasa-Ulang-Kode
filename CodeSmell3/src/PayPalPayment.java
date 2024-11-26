public class PayPalPayment implements PaymentMethod{

    @Override
    public double calcutaleFee(double amount) {
        return 0.03 * amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
    
}
