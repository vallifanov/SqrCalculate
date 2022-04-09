package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareCounterTest {
    @ParameterizedTest
    @CsvSource(value = {" 200, 300, 3",
            " 1, 600, 15",
            " 500, 1000, 9"})
    void shouldCalculate(int lowerRange, int higherRange, int expected) {
        int actual = SQRService.calculate(lowerRange, higherRange);
        assertEquals(expected, actual);
    }
}