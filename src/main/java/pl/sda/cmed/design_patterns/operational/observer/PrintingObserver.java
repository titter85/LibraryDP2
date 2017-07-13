package pl.sda.cmed.design_patterns.operational.observer;

public class PrintingObserver implements Observer {
    @Override
    public void update(String newValue) {
        System.out.println("PrintingObserver: " + newValue);
    }
}
