package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LionTest {

    @Test
    void getFoodReturnsFoodFromPredator() throws Exception {
        Predator predator = mock(Predator.class);
        List<String> food = List.of("Мясо");

        when(predator.eatMeat()).thenReturn(food);
        Lion lion = new Lion("Самец", predator);

        assertEquals(food, lion.getFood());
        verify(predator, times(1)).eatMeat();
    }
}