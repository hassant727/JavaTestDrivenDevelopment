package com.colours;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestColour{


    @Test
    public void initialErrorColourClassNotDefined() {
        assertThrows(IllegalArgumentException.class, () -> {
            Colour colourObj = new Colour(255, 255, 255);
        });
    }








}