package strategypattern;

public class Fawry implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Fawry.");
    }
}
