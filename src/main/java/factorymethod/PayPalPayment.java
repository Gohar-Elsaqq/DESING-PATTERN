package factorymethod;

class PayPalPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}