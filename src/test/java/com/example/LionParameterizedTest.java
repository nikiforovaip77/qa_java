package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class LionParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void doesHaveManeDependsOnSex(String sex, boolean expected) throws Exception {
        Predator predator = mock(Predator.class);
        Lion lion = new Lion(sex, predator);
        assertEquals(expected, lion.doesHaveMane());
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", " ", "Неизвестно", "другой"})
    void constructorThrowsExceptionForInvalidSex(String invalidSex) {
        Predator predator = mock(Predator.class);

        Exception exception = assertThrows(
                Exception.class,
                () -> new Lion(invalidSex, predator)
        );

        assertEquals("Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage());
    }

}