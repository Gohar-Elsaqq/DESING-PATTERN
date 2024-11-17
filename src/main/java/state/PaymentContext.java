package state;

class PaymentContext {
    private PaymentState state;

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void processPayment() {
        state.handlePayment();
    }
}
