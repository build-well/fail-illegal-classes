package io.buildwell.foundation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    public void shouldAddIntegers() {
        Result actual = calc.add(3, 5);
        assertEquals(8, actual.getValue());
    }

}
