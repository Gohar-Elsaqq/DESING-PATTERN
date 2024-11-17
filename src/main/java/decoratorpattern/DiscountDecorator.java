package decoratorpattern;

class DiscountDecorator implements Payment {
    private Payment payment;

    public DiscountDecorator(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void pay(int amount) {
        int discountedAmount = amount - 10;
        payment.pay(discountedAmount);
    }
}