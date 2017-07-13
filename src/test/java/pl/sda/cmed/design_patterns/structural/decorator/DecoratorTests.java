package pl.sda.cmed.design_patterns.structural.decorator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Zadanie 1:
 * Uzupełnij implementację klasy TextView tak by
 * implementowała interfejs Component, poprzez konstruktor
 * przyjmowała List<String> i przypisywała go do swojego pola.
 * <p>
 * Metoda printout powinna zwrócić tą listę.
 */
@RunWith(JUnit4.class)
public class DecoratorTests {

    private List<String> text = new ArrayList<>();

    @Before
    public void setup() {
        text.add("first line");
        text.add("second line");
        text.add("third line");
        text.add("fourth line");
        text.add("fifth line");
        text.add("sixth line");
    }


    @Test
    public void testSimpleTextView() {
        // Zadanie 1:
        // Utwórz obiekt klasy TextView podając jako parametr zmienną text
        // Używając go poprzez interfejs Component pobierz jego zawartość(printout)
        // Porównaj czy długość zwróconej listy jest zgodna z oczekiwaną


//        to tylko zalążek testu
        Component component = new TextView(text);
        assertThat(component.printout().size()).isEqualTo(text.size());
        System.out.println(component.printout());
    }

    /**
     * Zadanie 2 - Dodanie dekoratora Quoted:
     * <p>
     * Zaznajom się z klasą Decorator, implementującą interfejs Component
     * i przyjmującą jako parametr w konstruktorze obiekt klasy Component.
     * Zauważ, że metody klasy decorator wywołują metody obiektu przyjętego jako parametr konstruktora
     * <p>
     * <p>
     * Utwórz klasę QuotedDecorator, rozszerzającą Decorator,
     * która każdy ze Stringów ze zwracanej listy opatrzy w cudzysłowia ( w metodzie printout)
     */
    @Test
    public void testQuotedViewHasCorrectLength() {
        // Zadanie 2 - Dodanie dekoratora Quoted:
        // Utwórz obiekt klasy TextView i przekaż go do QuotedDecorator.
        // Używając poprzez interfejs Component udekorowanego TextView pobierz jego zawartość(printout)
        // Porównaj czy tak zwrócona lista stringów również ma spodziewaną długość (6)
        // hint: hasSize()


//          to tylko zalążek testu
        Component textView = new TextView(text);
        System.out.println(textView.printout());
        Component quotedView = new QuotedDecorator(textView);
        System.out.println(quotedView.printout());
        assertThat(quotedView.printout().size()).isEqualTo(textView.printout().size());
    }

    @Test
    public void testQuotedViewIsReallyQuoted() {
        // Zadanie 2 - Dodanie dekoratora Quoted:
        // Utwórz obiekt klasy TextView i przekaż go do QuotedDecorator.
        // Używając poprzez interfejs Component udekorowanego TextView pobierz jego zawartość(printout)
        // Porównaj czy każdy ze Stringów rozpoczyna się i kończy znakiem cudzysłowia.
        // hint: forEach(), startsWith(), endsWith()
        Component textView = new TextView(text);
        Component quotedView = new QuotedDecorator(textView);
        for(String line: quotedView.printout()) {
            assertThat(line).startsWith("\"").endsWith("\"");
        }
    }

    /**
     * Zadanie 3:
     * <p>
     * Utwórz klasę ScrollDecorator dziedziczącą z Decorator,
     * Utwórz w niej metodę scroll(int lines), która zapamięta przekazany parametr w polu klasy.
     * Zmodyfikuj metodę printout tak by momencie wywołania pomijała odpowiednią ilość elementów listy (lines).
     * hint: Stream ma metodę skip(int)
     */
    @Test
    public void testScrolledViewHasCorrectLengthAfterScroll() {
        //Zadanie 3:
        // Utwórz obiekt klasy TextView i przekaż go do ScrollDecorator.
        // Wywołaj metodę scroll na dekoratorze z parameterm 4
        // Pobierz jego zawartość(printout)
        // sprawdź czy zwrócona lista ma odpowiednią długość (2)
    }

    @Test
    public void testScrolledViewHasCorrectLengthAfterTwoScrolls() {
        // Zadanie 4:
        // Zmień implementację metody scroll tak by dodawała przekazaną wartość
        // do już posiadanej wartości scrolla i sprawdź jej działanie.
        // jednocześnie zabezpiecz ją przed podaniem ujemnych wartości.
        // Przetestuj działanie.
    }

    @Test
    public void testScrolledViewHasCorrectLengthAfterReset() {
        // Zadanie 5:
        // Dodaj metode resetScroll(), która wyzeruje pozycję scrolla.
        // Przetestuj działanie.

    }
}