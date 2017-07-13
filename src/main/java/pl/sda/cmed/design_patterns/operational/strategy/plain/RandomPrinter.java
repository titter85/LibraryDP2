package pl.sda.cmed.design_patterns.operational.strategy.plain;

import java.util.Collections;
import java.util.List;

public class RandomPrinter {

    public String print(List<Integer> printable) {
        Collections.shuffle(printable);
        return printable.stream()
                .map(Object::toString)
                .reduce((x, y) -> x + "," + y)
                .orElse("");
    }
}