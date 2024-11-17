package state;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setState(new PendingState());
        context.processPayment();

        context.setState(new CompletedState());
        context.processPayment();

        context.setState(new FailedState());
        context.processPayment();
    }
}