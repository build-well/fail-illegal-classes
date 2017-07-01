package io.buildwell.acceptance;

import io.buildwell.foundation.Calculator;
import io.buildwell.foundation.Result;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAcceptanceTest {
    private Calculator calc = new Calculator();

    @Test
    public void shouldAddNegativeNumbers() {
        Result actual = calc.add(-1, 200);
        assertEquals(199, actual.getValue());
    }
}
