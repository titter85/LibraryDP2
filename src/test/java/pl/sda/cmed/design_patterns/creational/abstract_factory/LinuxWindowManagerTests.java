package pl.sda.cmed.design_patterns.creational.abstract_factory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pl.sda.cmed.design_patterns.creational.abstract_factory.factory.AbstractFactory;

/**
 * Zadanie 1:
 * <p>
 * Dodaj implementacje interfejsów ScrollBar oraz StartMenu
 * dla produktów Gnome:
 * GnomeScrollBar powinien scrollować tekst o 15,
 * GnomeStartMenu powinno zwracać "FunnyPenguin"
 * <p>
 * Dodaj implementacje interfejsu AbstractFactory,
 * produkującą odpowiednie obiekty z rodziny Gnome (GnomeFactory)
 */

@RunWith(JUnit4.class)
public class LinuxWindowManagerTests {

    private AbstractFactory factory;

    @Before
    public void setup() {
        //Zadanie 2:
        //  Przypisz do właściwości factory fabrykę Gnome
    }

    @Test
    public void testCorrectScrollbarIsConstructed() {
        // Zadanie 2:
        // Utwórz nowy obiekt klasy WindowManager i podaj mu jako
        // parametr stworzoną fabrykę obiektów z rodziny Gnome.
        //
        // Zweryfikuj czy jego właściwość scrollBar rzeczywiście
        // jest instancją klasy GnomeScrollBar
        // hint: wyrażenie assertThat(...).isExactlyInstanceOf(...)
    }

    @Test
    public void testCorrectMenuIconIsConstructed() {
        // Zadanie 2:
        // Utwórz nowy obiekt klasy WindowManager i podaj mu jako
        // parametr stworzoną fabrykę obiektów z rodziny Gnome.
        //
        // Zweryfikuj czy jego właściwość startMenu rzeczywiście
        // jest instancją klasy GnomeStartMenu
        // hint: wyrażenie assertThat(...).isExactlyInstanceOf(...)
    }

    // Zadanie 6:
    // Dodaj testy, sprawdzające czy:
    // metoda scroll() zwraca poprawną ilość przewiniętych linii
    // metoda nameStartIcon() zwraca poprawna nazwę ikony

}
