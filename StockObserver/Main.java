package StockObserver;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("ABC Corp", 100.0);

        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        stock.attach(investor1);
        stock.attach(investor2);

        stock.setPrice(105.5);
        stock.setPrice(98.7);

        stock.detach(investor1);

        stock.setPrice(110.0);
    }
}
