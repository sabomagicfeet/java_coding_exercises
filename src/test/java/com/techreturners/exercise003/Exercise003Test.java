package com.techreturners.exercise003;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;


public class Exercise003Test {

    //property of the Class
    private Exercise003 ex003;

    @BeforeEach
    public void setup() {
        ex003 = new Exercise003();
    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForKimchi() {
        String iceCreamFlavour = "Kimchi";
        int expected = -1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkPickMultipleIceCreamFlavours() {

        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

        assertArrayEquals(expected, ex003.iceCreamFlavours());
    }


}
