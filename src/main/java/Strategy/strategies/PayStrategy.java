package Strategy.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectionPaymentDetails();
}
