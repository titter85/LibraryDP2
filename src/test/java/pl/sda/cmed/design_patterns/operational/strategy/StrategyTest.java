package pl.sda.cmed.design_patterns.operational.strategy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pl.sda.cmed.design_patterns.operational.strategy.pattern.ConfigurablePrinter;
import pl.sda.cmed.design_patterns.operational.strategy.pattern.NoSort;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class StrategyTest {

    private List<Integer> input;

    @Before
    public void setup() {
        input = Arrays.asList(0, 42, 124, 189, 241);
    }


    @Test
    public void test_3a_NormalPrinter() {
        String output = new ConfigurablePrinter().print(input, new NoSort());
        assertThat(output).isEqualTo("0,42,124,189,241");
    }

    @Test
    public void test_3b_ReversePrinter() {
//        String output = new ConfigurablePrinter().print(input, new ReverseSort());
//        assertThat(output).isEqualTo("241,189,124,42,0");
    }

    @Test
    public void test_3c_RandomPrinter() {
//        List<Integer> secondInput = new ArrayList<>(input);
//
//        String output = new ConfigurablePrinter().print(input, new RandomSort());
//        String secondOutput = new ConfigurablePrinter().print(input, new RandomSort());
//
//        assertThat(output).isNotEqualTo(secondOutput);
    }
}
