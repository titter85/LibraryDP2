package pl.sda.cmed.design_patterns.operational.observer;

public class ReversingObserver implements Observer {
    @Override
    public void update(String newValue) {
        System.out.println("ReversingObserver: " + new StringBuilder(newValue).reverse().toString());
    }
}
