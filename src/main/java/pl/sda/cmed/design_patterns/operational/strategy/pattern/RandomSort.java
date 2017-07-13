package pl.sda.cmed.design_patterns.operational.strategy.pattern;

import java.util.Collections;
import java.util.List;

public class RandomSort implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> printable) {
        Collections.shuffle(printable);
        return printable;
    }
}
