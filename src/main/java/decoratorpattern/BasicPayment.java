package decoratorpattern;

class BasicPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " without discount.");
    }
}
