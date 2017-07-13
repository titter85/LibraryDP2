package pl.sda.cmed.enums;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class CreateEnumTests {


    @Test
    /*
     * Wykonaj polecenia zadania 1
     * Stwórz nowy samochód (NewCar) o typie SEDAN
     * Czy da się przypisać niezdefiniowaną wartość?
     */
    public void createNewCarOfTypeSedan() {
        NewCar newCar = new NewCar(CarType.SEDAN);
    }

    @Test
    /*
     * Wykonaj polecenia zadania 2
     * Stwórz dwa samochody typu SEDAN i SPORTS
     * i z użyciem asercji potwierdź, że waga samochodu jest równa spodziewanej
     */
    public void task2() {
        NewCar newSedan = new NewCar(CarType.SEDAN);
        NewCar newSports = new NewCar(CarType.SPORTS);

        assertThat(newSedan.getType().weight()).isEqualTo(1300);
        assertThat(newSports.getType().weight()).isEqualTo(1150);
    }

    @Test
    /*
     * Wykonaj polecenia zadania 3
     * Stwórz dwa samochody typu HATCHBACK i VAN
     * i z użyciem asercji potwierdź, że tekst zwrócony z metody
     * naivePurpose() jest taki jak spodziewany
     */
    public void task3() {
        NewCar newVan = new NewCar(CarType.VAN);
        NewCar newHatchback = new NewCar(CarType.HATCHBACK);

        assertThat(newVan.getType().naivePurpose()).isEqualTo("Carry stuff around");
        assertThat(newHatchback.getType().naivePurpose()).isEqualTo("Smaller yet comfortable");
    }

    @Test(expected = IllegalArgumentException.class)
    /*
     * Chwilowo usuń obsługę jednej z wartości z metody naivePurpose()
     * i wywołaj ją z właśnie usuniętym typem.
     */
    public void task3FailingCase() {
        assertThat(CarType.HATCHBACK.naivePurpose()).isEqualTo("Small yet comfortable");
    }

    @Test
    /*
     * Wykonaj polecenia zadania 4
     * Z użyciem asercji potwierdź, że mapa jest
     * poprawnie wypełniona (zawiera pięć wpisów)
     */
    public void task4() {
        assertThat(CarType.stringToEnum).hasSize(5);
    }

    @Test
    /*
     * Wykonaj polecenia zadania 5
     * Stwórz typ CarType.SEDAN używając metody fromString
     * i przekazująć jej napis "SEDAN".
     * Zweryfikuj poprawność zwróconego wyniku uzywając asercji.
     */
    public void task5Sedan() {
        assertThat(CarType.fromString("SEDAN")).isEqualTo(CarType.SEDAN);
    }

    @Test
    /*
     * Pobierz instancję wartości CarType.SPORTS używając metody
     * fromString, przekazująć jej napis "SPORTS".
     * Zweryfikuj poprawność zwróconego wyniku uzywając asercji.
     */
    public void task5Sports() {
        assertThat(CarType.fromString("SPORTS")).isEqualTo(CarType.SPORTS);
    }

    @Test
    /*
     * Wykonaj polecenie zadania 6
     * Potwierdź wartości zwracane z metody purpose() za pomocą asercji
     * Dla typu WAGON
     */
    public void task6Wagon() {
        assertThat(CarType.WAGON.purpose()).isEqualTo("Family car");
    }

    @Test
    /*
     * Wykonaj polecenie zadania 6
     * Potwierdź wartości zwracane z metody purpose() za pomocą asercji
     * Dla typu Van
     */
    public void task6Van() {
        assertThat(CarType.VAN.purpose()).isEqualTo("Carry stuff around");
    }
}
