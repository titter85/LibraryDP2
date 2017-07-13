package pl.sda.cmed.design_patterns.operational.strategy.pattern;

import java.util.List;

public class NoSort implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> printable) {
        return printable;
    }
}
