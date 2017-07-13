package pl.sda.cmed.design_patterns.operational.strategy.pattern;

import java.util.List;

public class ConfigurablePrinter {

    public String print(List<Integer> printable, SortStrategy sortStrategy) {

        // zadanie 1:
        // Dodaj do tej metody parameter, który pozwoli podać Ci
        // obiekt implementujący interfejs SortStrategy

        // zdadnie 2:
        // Wykorzystaj przekazaną implementację interfejsu do tego by
        // posortować listę przekazaną w parametrze printable
        // przed jej wydrukowaniem

        // zadanie 3:
        // Stwórz trzy klasy implementujące interfejs SortStrategy
        // zmieniające daną wejściową (List<Integer>) w taki sposób by:
        // a) nie zmieniła się (nazwij ją: NoSort)
        // b) była w odwrotnej kolejności (nazwij ją: ReverseSort)
        //        - wykorzystaj do tego metodę z klasy List o nazwie sort i gotowy komparator Comparator.reverseOrder();
        // c) była w losowej kolejności (nazwij ją: RandomSort)
        //        - wykorzystaj do tego Collections.shuffle()

        // Po wykonaniu każdego z podpunktów zadania 3 odkomentuj w klasie StrategyTest odpowiedni test i potwierdź
        // poprawne działanie

        return sortStrategy.sort(printable)
                .stream()
                .map(Object::toString)
                .reduce((x, y) -> x + "," + y)
                .orElse("");
    }
}























