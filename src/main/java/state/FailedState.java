package state;

class FailedState implements PaymentState {
    @Override
    public void handlePayment() {
        System.out.println("Payment has failed.");
    }
}