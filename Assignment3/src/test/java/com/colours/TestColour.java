package com.colours;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestColour {

    Colour colourObj1 = new Colour("255", "255", "255", "cmyk");


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
        Colour colourObj1 = new Colour(255, 255, 255);

    }

    @Test
    public void checkingValues(){
        assertTrue(colourObj1.checkValuesAreInRange(colourObj1.getComponent_oneR()));
    }


    @Test
    public void checkValuesInRange(){
//        fail("not implemented yet");
        assertTrue(colourObj1.checkColours(colourObj1));
    }

    @Test
    public void equals(){
        //fail("no implementation yet");
        Colour colour1 = new Colour(100, 200, 255);
        Colour colour2 = new Colour(100, 200, 255);

        assertTrue(colour1.equals(colour2));
    }

    @Test
    public void addWithinRange(){
        //fail("fail because no implementation yet");
        Colour colour1 = new Colour(45,34,67);
        Colour colour2 = new Colour(45,78,100);
        assertTrue(colour1.add(colour2));
    }

    @Test
    public void addOutsideRange(){
        //fail("fail because no implementation yet");
        Colour colour1 = new Colour(500,200,67);
        Colour colour2 = new Colour(45,78,100);
        assertFalse(colour1.add(colour2));
    }

    @Test
    public void addColourDifferentModels(){
        Colour colour1 = new Colour(100,200,240, "CMYK");
        Colour colour2 = new Colour(45,78,100);
        assertFalse(colour1.add(colour2));
    }
}

