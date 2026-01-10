package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FelineParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 10})
    void getKittensReturnsPassedValue(int kittensCount) {
        Feline feline = new Feline();
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}
