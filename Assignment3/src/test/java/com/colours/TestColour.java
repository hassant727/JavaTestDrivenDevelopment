package com.colours;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestColour {

    @Test
    public void initialFailTestCase() {

//        System.out.println("hello");
        fail("no implementation");
    }

    @Test
    public void checkingIfValuesOfTwoObjectsAreEqual(){
        int r = 0, g = 0, b = 0;
        int r1, g1, b1;

        r1 = 100;
        g1 = 150;
        b1 = 255;

        assertAll(
                ()-> assertEquals(r, r1),
                ()-> assertEquals(g, g1),
                ()-> assertEquals(b, b1)
        );
    }

}
