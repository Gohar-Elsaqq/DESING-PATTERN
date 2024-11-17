package decoratorpattern;

public class Main {
    public static void main(String[] args) {
        Payment payment = new DiscountDecorator(new BasicPayment());
        payment.pay(100);
    }
}