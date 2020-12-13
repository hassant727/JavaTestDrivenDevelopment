package com.colours;


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
        this.component_one = component_one;
        this.component_two = component_two;
        this.component_three = component_three;
        this.colourModel = "RGB";

    }

    public int getComponent_one(){

        return component_one;
    }

    public int setComponent_one(int col1){

        this.component_one = col1;
        return component_one;
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



    void compare(){

    }

    void equals(){
    }

    void add(){

    }




}
