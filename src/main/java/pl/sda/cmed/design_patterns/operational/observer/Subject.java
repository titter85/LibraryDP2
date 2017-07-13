package pl.sda.cmed.design_patterns.operational.observer;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyChanged();
}
