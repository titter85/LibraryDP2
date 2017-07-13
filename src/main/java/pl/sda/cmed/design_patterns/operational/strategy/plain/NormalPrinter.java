package pl.sda.cmed.design_patterns.operational.strategy.plain;

import java.util.List;

public class NormalPrinter {

    public String print(List<Integer> printable) {
        return printable.stream()
                .map(Object::toString) // przykład referencji do metody
                .reduce((x, y) -> x + "," + y)
                .orElse("");
    }
}
