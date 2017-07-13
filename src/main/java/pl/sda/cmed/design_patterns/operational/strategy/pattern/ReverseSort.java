package pl.sda.cmed.design_patterns.operational.strategy.pattern;

import java.util.Comparator;
import java.util.List;

public class ReverseSort implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> printable) {
        printable.sort(Comparator.reverseOrder());
        return printable;
    }
}
