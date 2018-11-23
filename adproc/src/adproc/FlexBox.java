package adproc;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * FlexBox superclass
 * @author up879045
 * @author  up850844
 * 
 */
public abstract class FlexBox {
    protected double[] dim;
    protected int cGrade;
    protected int colPrint;
    protected boolean rBot;
    protected boolean rCorn;
    protected boolean sTop;
    protected int qty;
    protected static double[] gradePriceMultiplier = {0.55, 0.65, 0.82, 0.98, 
                                                      1.5};
    
    /**
     * Default constructor for FlexBox
     */
    public FlexBox(){}
    
    /**
     * Constructor for FlexBox using all variables
     * @param dimension Array for the x,y,z dimensions of the box
     * @param cardGrade Value of the card grade (1-5)
     * @param colourPrint Value of the number of colours used in printing (0-2)
     * @param reinforcedBottom Declares whether box has a reinforced bottom
     * @param reinforcedCorners Declares whether box has reinforced corners
     * @param sealableTop Declares whether box has a sealable top
     * @param quantity Quantity of boxes of this instance
     */
    public FlexBox(double[] dimension, int cardGrade, int colourPrint, 
                   boolean reinforcedBottom, boolean reinforcedCorners, 
                   boolean sealableTop, int quantity){
        dim = dimension;
        cGrade = cardGrade;
        colPrint = colourPrint;
        rBot = reinforcedBottom;
        rCorn = reinforcedCorners;
        sTop = sealableTop;
        qty = quantity;
    }
    
    // accessor methods
    /**
     * Method to return array of box dimensions
     * @return box dimension array
     */
    public double[] getDimension(){
        return dim;
    }
    /**
     * 
     * @return box card grade
     */
    public int getCardGrade(){
        return cGrade;
    }
    /**
     * 
     * @return number of colours printed on box
     */
    public int getColour(){
        return colPrint;
    }
    /**
     * 
     * @return true if box has reinforced bottom
     */
    public boolean getReinforcedBottom(){
        return rBot;
    }
    /**
     * 
     * @return true if box has reinforced corners
     */
    public boolean getReinforcedCorners(){
        return rCorn;
    }
    /**
     * 
     * @return true if box has sealable top
     */
    public boolean getSealableTop(){
        return sTop;
    }
    /**
     * 
     * @return quantity of boxes ordered of the specific instance
     */
    public int getQuantity(){
        return qty;
    }
    // mutator methods
    /**
     * Mutator method to set dimension array
     * @param newDim the array for dimension
     */
    public void setDimension(double[] newDim){
        dim = newDim;
    }
    /**
     * Mutator method to set card grade value
     * @param newGrade card grade value
     */
    public void setCardGrade(int newGrade){
        cGrade = newGrade;
    }
    /**
     * Mutator method to set number of colours used
     * @param newColour number of colours used
     */
    public void setColour(int newColour){
        colPrint = newColour;
    }
    /**
     * Mutator method to set whether box has a reinforced bottom
     * @param newRBot false if box doesn't have reinforced bottom
     */
    public void setReinforcedBottom(boolean newRBot){
        rBot = newRBot;
    }
    /**
     * Mutator method to set whether box has reinforced corners
     * @param newRCorn false if box doesn't have reinforced corners
     */
    public void setReinforcedCorners(boolean newRCorn){
        rCorn = newRCorn;
    }
    /**
     * Mutator method to set whether box has a sealable top
     * @param newSTop false if box doesn't have a sealable top
     */
    public void setSealableTop(boolean newSTop){
        sTop = newSTop;
    }
    /**
     * 
     * @param newQuantity new value for the quantity of boxes of this instance
     */
    public void setQuantity(int newQuantity){
        qty = newQuantity;
    }
    // end of accessor/mutator methods
    
    /**
     * Method to calculate the surface area of the box
     * @return surface area value of box
     */
    public double calcSurfaceArea(){
        double sa;
        sa = (2 * dim[0] * dim[2]) + 
             (2 * dim[1] * dim[0]) +
             (2 * dim[2] * dim[1]);
        return sa;
    }
    /**
     * Abstract method to calculate the base price (card determined) of the box
     * @return base price value of the box
     */
    abstract double calcPrice();
    
    
    public String orderStatement(){
        String orderSt = "Box Dimension: " + Arrays.toString(dim) ;
        return orderSt;
    }
}


