package pl.sda.cmed.design_patterns.operational.observer;

public class ModifyingObserver implements Observer {
    @Override
    public void update(String newValue) {
        System.out.println("ModifyingObserver: " + newValue);
    }
}
