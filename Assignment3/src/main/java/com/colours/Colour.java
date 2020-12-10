package com.colours;

import sun.font.TrueTypeFont;

public class Colour {

    public int component_one;
    public int component_two;
    public int component_three;
    public String colourModel;

    public Colour(int component_one, int component_two, int component_three, String colourModel) {

        this.component_one = component_one;
        this.component_two = component_two;
        this.component_three = component_three;
        this.colourModel = colourModel;
    }

    public Colour(int component_one, int component_two, int component_three) {
        if (component_one >= 0 & component_one <= 255 && component_two >= 0 & component_two <= 255 && component_three >= 0 && component_three <= 255)
        {
            this.component_one = component_one;
            this.component_two = component_two;
            this.component_three = component_three;
        }
        else{
            this.component_one = 999;
            this.component_two = 999;
            this.component_three = 999;
        }
        this.colourModel = "RGB";
    }

    public int getComponent_one(){

        return component_one;
    }

    public void setComponent_one(int col1){

        this.component_one = col1;
    }

    public int getComponent_two(){

        return component_two;
    }

    public void setComponent_two(int col2){

        this.component_two = col2;
    }

    public int getComponent_three(){

        return component_three;
    }

    public void setComponent_three(int col3){

        this.component_three = col3;
    }


    public boolean isClassValid(){

    }

    void compare(){

    }

    void equals(){

    }

    void add(){

    }




}
