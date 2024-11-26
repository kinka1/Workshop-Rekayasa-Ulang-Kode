public class PaymentProcessor {
    PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double processPayment(double amount) {
        if (paymentMethod == null){
            System.out.println("Unknown payment method");
            return 0;
        } else {
            double fee = paymentMethod.calcutaleFee(amount);
            paymentMethod.processPayment();
            return amount + fee;
        }
        
    }
}
