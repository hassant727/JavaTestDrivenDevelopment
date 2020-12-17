package com.colours;

import org.junit.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;



public class TestColour {

    Colour colourObj1 = new Colour(255, 255, 255);


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

    @Test
    public void testingConstructers(){
        //fail("no implementation yet");
        Colour colourObj1 = new Colour(255, 255, 255);

    }

    @Test
    public void checkingValues(){
        fail("no implementation");
        //colourObj1.checkValuesAreInRange(colourObj1.getComponent_oneR());
    }

//
//    @Test
//    public void checkValuesInRange(){
//        fail("not implemented yet");
//    }
}
