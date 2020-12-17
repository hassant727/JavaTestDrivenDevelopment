package com.colours;


import javax.swing.*;

public class Colour{

    private final int component_oneR;
    private final int component_twoG;
    private final int component_threeB;
    private String colourModel = "RGB";



// if pass in rgb values without default colour
    public Colour(int component_one, int component_two, int component_three){
        this.component_oneR = component_one;
        this.component_twoG = component_two;
        this.component_threeB = component_three;
    }

    // pass in integers with differenet colour model
    public Colour(int component_one, int component_two, int component_three, String colourModel){
        this.component_oneR = component_one;
        this.component_twoG = component_two;
        this.component_threeB = component_three;
        this.colourModel = colourModel;
    }

    // values in string format
    public Colour(String component_one, String component_two, String component_three, String colourModel){
        this.component_oneR = Integer.parseInt(component_one);
        this.component_twoG = Integer.parseInt(component_two);
        this.component_threeB = Integer.parseInt(component_three);
        this.colourModel = colourModel;
    }
//
// default in string format
    public Colour(String component_one, String component_two, String component_three){
        this.component_oneR = Integer.parseInt(component_one);
        this.component_twoG = Integer.parseInt(component_two);
        this.component_threeB = Integer.parseInt(component_three);
    }


    public int getComponent_oneR() {
        return component_oneR;
    }

    public int getComponent_twoG() {
        return component_twoG;
    }

    public int getComponent_threeB() {
        return component_threeB;
    }

    public String getColourModel() {
        return colourModel;
    }

     //return true of all colours are within range
    public boolean checkColours(Colour colour){
        return checkValuesAreInRange(colour.component_oneR) &&
                checkValuesAreInRange(colour.component_twoG) &&
                checkValuesAreInRange(colour.component_threeB);
    }

    // pass in colour1 and then check if colour is within range
    public boolean checkValuesAreInRange(int obj1){
        return obj1 > 0 && obj1 < 256;
    }

    @Override
    public String toString() {
        return "Colour{" +
                "component_oneR=" + component_oneR +
                ", component_twoG=" + component_twoG +
                ", component_threeB=" + component_threeB +
                ", colourModel='" + colourModel + '\'' +
                '}';
    }

        public static void main (String[] args){
        Colour colourObj1 = new Colour(-255, 255, 256);
        //System.out.println(colourObj1.checkColours(colourObj1));
        //System.out.println(checkValuesAreInRange(300));
            System.out.println(colourObj1.toString());


    }




}