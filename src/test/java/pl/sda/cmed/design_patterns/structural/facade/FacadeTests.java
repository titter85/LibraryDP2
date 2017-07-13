package pl.sda.cmed.design_patterns.structural.facade;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class FacadeTests {

    private Map<String, Integer> bonuses;
    private Map<String, Integer> fines;
    private Map<String, Integer> wages;
    private Map<String, Integer> workTimes;
    private PaymentSystem paymentSystem;

    @Before
    public void setup() {
        bonuses = new HashMap<>();
        bonuses.put("kowalski", 1000);

        fines = new HashMap<>();
        fines.put("kowalski", 100);
        fines.put("hajzer", 1000);

        wages = new HashMap<>();
        wages.put("kowalski", 700);
        wages.put("hajzer", 50);
        wages.put("tarczynski", 70);
        wages.put("gola", 120);

        workTimes = new HashMap<>();
        workTimes.put("kowalski", 240);
        workTimes.put("hajzer", 158);
        workTimes.put("tarczynski", 160);
        workTimes.put("gola", 160);

//        paymentSystem = new PaymentSystem(new HRSystem(wages), new TimeTracker(workTimes), new FineTracker(fines), new BonusTracker(bonuses));
    }

    @Test()
    public void shouldCalculateCorrectlyWithBonus() {
        // Policz wynagrodzenie dla pracownika "kowalski" z użyciem obiektu paymentSystem
    }

    @Test()
    public void shouldCalculateCorrectlyWithFine() {
        // Policz wynagrodzenie dla pracownika "hajzer" z użyciem obiektu paymentSystem
    }

    @Test()
    public void shouldCalculateCorrectlyWithoutFine() {
        // Policz wynagrodzenie dla pracownika "tarczynski" z użyciem obiektu paymentSystem
    }

    @Test()
    public void shouldCalculateCorrectlyWithoutBonus() {
        // Policz wynagrodzenie dla pracownika "gola" z użyciem obiektu paymentSystem
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWhenCalculatingForNonExistenWorker() {
        // Policz wynagrodzenie dla nieistniejącego pracownika z użyciem obiektu paymentSystem
    }
}

/*
 * Miesięczne wynagrodzenia dla podanych danych testowych i poprawnej implementacji
 * kowalski   - 169100
 * hajzer     - 8900
 * tarczynski - 11200
 * gola       - 19200
 */