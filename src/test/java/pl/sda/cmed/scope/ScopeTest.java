package pl.sda.cmed.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ScopeTest {

    @Test
    public void testMutableImmutable() {
        Integer zmienna = 20;
        String mojeImie = "Lilo";
        ModifiableBook book = new ModifiableBook("Pan Lodowego Ogrodu", "Jarosław Grzędowicz");

        System.out.println("Przed modyfikacją");
        System.out.println(book);
        System.out.println(zmienna);
        System.out.println(mojeImie);
        System.out.println("-----------------------");

        zmienKsiazke(book);
        zmienZmienna(zmienna);
        zmienImie(mojeImie);

        System.out.println("-----------------------");
        System.out.println("Po modyfikacji");
        System.out.println(book);
        System.out.println(zmienna);
        System.out.println(mojeImie);
        System.out.println("-----------------------");
    }

    private void zmienKsiazke(ModifiableBook book) {
        book.title = "Zmieniono tytuł";
        System.out.println("Książka po zmianie: " + book);
    }

    private void zmienImie(String mojeImie) {
        mojeImie = mojeImie + " & Stich";
        System.out.println("Imię po zmianie: " + mojeImie);
    }

    private void zmienZmienna(Integer zmienna) {
        zmienna = zmienna * 100;
        System.out.println("Integer po zmianie: " + zmienna);
    }
}
