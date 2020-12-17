package com.colours;

/**
 *Colour is the main entity we will will be using to represent and operate
 * on colours that can be represented in a variety of colour models.
 *
 * Please visit https://github.com/hassant727/JavaTestDrivenDevelopment
 * to see my git repository.
 *
 * @author Hassan Tariq
 *
 */
public class Colour{
    // Fields and methods

    /**
     * RGB components set as integers - Three components one for R, G and B
     * Colour model set as a string
     */
    private final int component_oneR;
    private final int component_twoG;
    private final int component_threeB;
    private String colourModel = "RGB";

    /**
     * <p>
     *     In the Colour method the cRGB components are passed in as parameters
     * the class instances are passed in this method
     * passed in the default values
     * </p>
     * @param component_one RGB component one
     * @param component_two RGB component two
     * @param component_three RGB component three
     */
    public Colour(int component_one, int component_two, int component_three){
        this.component_oneR = component_one;
        this.component_twoG = component_two;
        this.component_threeB = component_three;
    }

    /**
     * <p>
     *     This Colour method is used to pass in integers with different colour models
     * </p>
     * @param component_one RGB component one
     * @param component_two RGB component two
     * @param component_three RGB component three
     * @param colourModel to represent the different colour models as string
     */
    public Colour(int component_one, int component_two, int component_three, String colourModel){
        this.component_oneR = component_one;
        this.component_twoG = component_two;
        this.component_threeB = component_three;
        this.colourModel = colourModel;
    }

    /**
     * <p>This  Colour method is used if the values entered were in string form,
     * therefore this method will be referenced in this case.
     * </p>
     * @param component_one RGB component one represented as string
     * @param component_two RGB component two represented as string
     * @param component_three RGB component three represented as string
     * @param colourModel colour Model represented as string
     */
    public Colour(String component_one, String component_two, String component_three, String colourModel){
        this.component_oneR = Integer.parseInt(component_one);
        this.component_twoG = Integer.parseInt(component_two);
        this.component_threeB = Integer.parseInt(component_three);
        this.colourModel = colourModel;
    }

    /**
     * <p>
     *     This is the default Colour method implemented as string with just
     *     thr RGB colour components and not the colour Model
     * </p>
     * @param component_one
     * @param component_two
     * @param component_three
     */
    public Colour(String component_one, String component_two, String component_three){
        this.component_oneR = Integer.parseInt(component_one);
        this.component_twoG = Integer.parseInt(component_two);
        this.component_threeB = Integer.parseInt(component_three);
    }

    /**
     * Getter for RGB component one
     * @return component_oneR
     */
    public int getComponent_oneR() {
        return component_oneR;
    }

    /**
     * Getter for RGB component two
     * @return component_twoG
     */
    public int getComponent_twoG() {
        return component_twoG;
    }

    /**
     * Getter for RGB component three
     * @return component_threeB
     */
    public int getComponent_threeB() {
        return component_threeB;
    }

    /**
     * Getter for the Colour Model
     * @return colourModel as string
     */
    public String getColourModel() {
        return colourModel;
    }

    /**
     * <p>
     *     The checkColours method will return true if all the colours
     *     are within the range of 0-255
     * </p>
     * @param colour pass in colour as a parameter
     * @return colour objects if in correct range
     */
    public boolean checkColours(Colour colour){
        return checkValuesAreInRange(colour.component_oneR) &&
                checkValuesAreInRange(colour.component_twoG) &&
                checkValuesAreInRange(colour.component_threeB);
    }

    /**
     * <p>
     *     he checkValuesAreInRange method returns colour object if RGB values
     *     are in range and is referenced by the checkColour method
     * </p>
     * @param obj1 take in parameter as integer to check for range
     * @return colour object if greater than 0 and less than 256
     */
    public boolean checkValuesAreInRange(int obj1){
        return obj1 > 0 && obj1 < 256;
    }

    /**
     * <p>
     *     The equals method is used to check if the coloud objects are equal
     *     to one another. If they are equat true will be returned and
     *     the test case will pass else it will return false and
     *     the test case may fail
     * </p>
     * @param other parameter to reference other colour object to compare with.
     * @return colour components and the colour model equaling to each other
     */
    public boolean equals(Colour other){
        return (this.getComponent_oneR() == other.getComponent_oneR()) &
                (this.getComponent_twoG() == other.getComponent_twoG()) &
                (this.getComponent_threeB() == other.getComponent_threeB()) &
                (this.getColourModel().equals(other.getColourModel()));
    }

    /**
     * <p>
     *     The add method is to add colours that use the same model,
     *     by adding each of the components. However the value of each
     *     component cannot exceed 255.
     * </p>
     * @param newC takes in newC to add with the default colour.
     * @return returns true if colours in range after adding and
     *          returns false if values outside of range after adding
     */
    public boolean add(Colour newC){
        // only add the colour components if the colour Models are equal
        if (this.getColourModel().equals(newC.getColourModel())) {
            int newColourR = this.getComponent_oneR() + newC.getComponent_oneR();
            int newColourG = this.getComponent_twoG() + newC.getComponent_twoG();
            int newColourB = this.getComponent_threeB() + newC.getComponent_threeB();
            return (newColourR <= 255) && (newColourG <= 255) && (newColourB <= 255);
        }
        return false;
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
}