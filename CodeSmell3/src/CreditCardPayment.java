public class CreditCardPayment implements PaymentMethod {

    @Override
    public double calcutaleFee(double amount) {
        return 0.02 * amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }
    
}
