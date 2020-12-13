package com.colours;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestColour{


    @Test
    public void getComponent_one() {
        Colour one = new Colour(255, 255, 255);
        assertEquals(255, one.getComponent_one());
    }

    @Test
    public void setComponent_one() {
        Colour one = new Colour(255, 255, 255, "RGB");
        assertEquals(100, one.setComponent_one(100));

    }

    @Test
    public void getComponent_two() {
        Colour one = new Colour(255, 255, 255);
        assertEquals(255, one.getComponent_two());
    }

    @Test
    public void setComponent_two() {
    }

    @Test
    public void getComponent_three() {
    }

    @Test
    public void setComponent_three() {
    }

    @Test
    public void compare() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void add() {
    }







}