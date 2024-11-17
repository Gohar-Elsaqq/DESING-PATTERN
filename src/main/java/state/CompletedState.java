package state;

class CompletedState implements PaymentState {
    @Override
    public void handlePayment() {
        System.out.println("Payment is completed.");
    }
}