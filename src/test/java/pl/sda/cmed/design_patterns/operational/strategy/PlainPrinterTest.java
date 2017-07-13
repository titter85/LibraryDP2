package pl.sda.cmed.design_patterns.operational.strategy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pl.sda.cmed.design_patterns.operational.strategy.plain.NormalPrinter;
import pl.sda.cmed.design_patterns.operational.strategy.plain.RandomPrinter;
import pl.sda.cmed.design_patterns.operational.strategy.plain.ReversePrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class PlainPrinterTest {

    private List<Integer> input;

    @Before
    public void setup() {
        input = Arrays.asList(0, 42, 124, 189, 241);
    }

    @Test
    public void testNormalPrinter() {
        String output = new NormalPrinter().print(input);
        assertThat(output).isEqualTo("0,42,124,189,241");
    }

    @Test
    public void testReversePrinter() {
        String output = new ReversePrinter().print(input);
        assertThat(output).isEqualTo("241,189,124,42,0");
    }

    @Test
    public void testRandomPrinter() {
        List<Integer> secondInput = new ArrayList<>(input);

        String output = new RandomPrinter().print(input);
        String secondOutput = new RandomPrinter().print(secondInput);

        assertThat(output).isNotEqualTo(secondOutput);
    }
}
