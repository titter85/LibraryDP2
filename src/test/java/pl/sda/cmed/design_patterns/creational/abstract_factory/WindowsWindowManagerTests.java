package pl.sda.cmed.design_patterns.creational.abstract_factory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pl.sda.cmed.design_patterns.creational.abstract_factory.factory.AbstractFactory;


/**
 * Zadanie 3:
 * <p>
 * Dodaj implementacje interfejsów ScrollBar oraz StartMenu
 * dla produktów Aero:
 * AeroScrollBar powinien scrollować tekst o 10,
 * AeroStartMenu powinno zwracać "FourWindows"
 * <p>
 * Dodaj implementacje interfejsu AbstractFactory,
 * produkującą odpowiednie obiekty z rodziny Aero (AeroFactory)
 */


@RunWith(JUnit4.class)
public class WindowsWindowManagerTests {

    private AbstractFactory factory;

    @Before
    public void setup() {
        //Zadanie 4:
        //  Przypisz do właściwości factory fabrykę Aero
    }

    @Test
    public void testCorrectScrollbarIsConstructed() {
        // Zadanie 4:
        // Utwórz nowy obiekt klasy WindowManager i podaj mu jako
        // parametr stworzoną fabrykę obiektów z rodziny Aero.
        //
        // Zweryfikuj czy jego właściwość scrollBar rzeczywiście
        // jest instancją klasy AeroScrollBar
    }

    @Test
    public void testCorrectMenuIconIsConstructed() {
        // Zadanie 4:
        // Utwórz nowy obiekt klasy WindowManager i podaj mu jako
        // parametr stworzoną fabrykę obiektów z rodziny Aero.
        //
        // Zweryfikuj czy jego właściwość startMenu rzeczywiście
        // jest instancją klasy AeroStartMenu
    }

    // Zadanie 5:
    // Dodaj testy, sprawdzające czy:
    // metoda scroll() zwraca poprawną ilość przewiniętych linii
    // metoda nameStartIcon() zwraca poprawna nazwę ikony
}
