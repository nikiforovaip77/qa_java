package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    @Test
    void eatMeatReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    void getFamilyReturnsFelineFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittensWithoutParamsReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

}
