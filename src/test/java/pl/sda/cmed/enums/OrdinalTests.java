package pl.sda.cmed.enums;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class OrdinalTests {

    @Test
    /*
     * Wypisz liczbę osób w zespole, zapisaną w enumie
     * BandType za pomocą metody numberOfMusicians()
     * dla wartości QUINTET.
     * Zanotuj sobie co zostało zwrócone.
     */
    public void showQuintetMusiciansNumber() {
        System.out.println(BandType.QUINTET.numberOfMusicians()); // zwróci 5
    }

    @Test
    /*
     * Zmień kolejność przesuwając deklarację typu QUINTET
     * na sam początek.
     * Ponownie wypisz liczbę osób w zespole dla typu QUINTET.
     * Porównaj co zostało zwrócone w pierwszym podejściu!
     */
    public void showQuintetMusiciansNumberOops() {
        System.out.println(BandType.QUINTET.numberOfMusicians());// zwróci 1
    }
}
