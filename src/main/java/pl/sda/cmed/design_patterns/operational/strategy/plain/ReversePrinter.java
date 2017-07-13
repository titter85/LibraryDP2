package pl.sda.cmed.design_patterns.operational.strategy.plain;

import java.util.Comparator;
import java.util.List;

public class ReversePrinter {

    public String print(List<Integer> printable) {
        printable.sort(Comparator.reverseOrder());
        return printable.stream()
                .map(Object::toString)
                .reduce((x, y) -> x + "," + y)
                .orElse("");
    }
}
