public interface PaymentMethod {
    double calcutaleFee(double amount);
    void processPayment();
}
