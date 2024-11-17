package state;

class PendingState implements PaymentState {
    @Override
    public void handlePayment() {
        System.out.println("Payment is pending.");
    }
}
