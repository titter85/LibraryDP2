package pl.sda.cmed.design_patterns.operational.observer;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class StringSubject implements Subject {

    // zadanie 1a:
    // Stwórz pole typu List<Observer>, które będzie przechowywać zarejestrowanych obserwatorów
    // i zainicjalizuj je instancją klasy LinkedList
    private final List<Observer> observers = new LinkedList<>();
    // zadanie1b:
    // Stwórz pole odpowiadające obecnemu stanowi naszego Subject'a
    private String myState = "Initial State";

    @Override
    public void attach(Observer observer) {
        // zadanie 1c:
        // Wypełnij metodę dołączającą obserwatora do listy obserwatorów
        // sprawadzając najpierw czy jest on już w liście obserwatorów
        // hint: .contains() .add()
        if (!observers.contains(observer)) {
            observers.add(observer);
            observer.update(myState);
        }
    }

    @Override
    public void notifyChanged() {
        // zadanie 2a:
        // powiadom każdego z zarejestrowanych obserwatorów wywołując ich metodę update(...)
        // hint: forEach()
        observers.forEach(observer -> observer.update(myState));
    }

    // zadanie 2b:
    // Dodaj metodę ustawiającą wartość zmiennej stanu
    // wywołaj meotdę notifyChanged by powiadomić obserwatorów o zmianie
    public void setValue(String newValue) {
        myState = newValue;
        notifyChanged();
    }

    @Override
    public void detach(Observer observer) {
        // zadanie 2c:
        // usuń obserwatora z listy
        // hint: .remove()
        observers.remove(observer);
    }
}