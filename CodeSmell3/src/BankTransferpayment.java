public class BankTransferpayment implements PaymentMethod {

    @Override
    public double calcutaleFee(double amount) {
        return 0.01 * amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer...");
    }
    
}
