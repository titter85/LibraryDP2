package pl.sda.cmed.enums;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class OldCarOperations {

    @Test
    public void properValue() {
        // Stwórz instancję klasy OldCar, initcjalizując ją wartością SEDAN
        OldCar oldCar = new OldCar(OldCar.SEDAN);
    }

    @Test
    public void rougeProgrammer() {
        // Stwórz instancję klasy OldCar, initcjalizując ją wartością SEDAN
        // Spróbuj nadpisać wartość używając metody setType i wartości spoza zdefiowanych
        // Czy operacja się powiedzie?
        OldCar oldCar = new OldCar(OldCar.SEDAN);
        oldCar.setType(123);
    }
}
