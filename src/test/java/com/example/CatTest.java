package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CatTest {

    @Test
    void getSoundReturnsMeow() {
        Cat cat = new Cat(mock(Feline.class));
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getFoodReturnsFoodFromPredator() throws Exception {
        Feline feline = mock(Feline.class);
        List<String> expectedFood = List.of("Животные", "Птицы");
        when(feline.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(feline);
        List<String> actualFood = cat.getFood();

        assertEquals(expectedFood, actualFood);
        verify(feline, times(1)).eatMeat();
    }
}