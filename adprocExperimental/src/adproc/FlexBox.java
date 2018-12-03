package adproc;

import java.util.Arrays;

/**
 * FlexBox superclass
 *  
 */
public abstract class FlexBox {
    protected double[] dim;
    protected int cGrade;
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
     * @param sealableTop Declares whether box has a sealable top
     * @param quantity Quantity of boxes of this instance
     */
    public FlexBox(double[] dimension, int cardGrade, 
                   boolean sealableTop, int quantity){
        dim = dimension;
        cGrade = cardGrade;
        sTop = sealableTop;
        qty = quantity;
    }
    
    /**
     * Dimension array accessor method
     * @return box dimension array
     */
    public double[] getDimension(){
        return dim;
    }
    /**
     * Card grade accessor method
     * @return box card grade
     */
    public int getCardGrade(){
        return cGrade;
    }
    /**
     * 
     * @return number of colours printed on box
     */
    abstract int getColour();
    /**
     * 
     * @return true if box has reinforced bottom
     */
    abstract boolean getReinforcedBottom();
    /**
     * 
     * @return true if box has reinforced corners
     */
    abstract boolean getReinforcedCorners();
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
//    /**
//     * Mutator method to set number of colours used
//     * @param newColour number of colours used
//     */
//    abstract void setColour(int newColour);
//    /**
//     * Mutator method to set whether box has a reinforced bottom
//     * @param newRBot false if box doesn't have reinforced bottom
//     */
//    abstract void setReinforcedBottom(boolean newRBot);
//    /**
//     * Mutator method to set whether box has reinforced corners
//     * @param newRCorn false if box doesn't have reinforced corners
//     */
//    abstract void setReinforcedCorners(boolean newRCorn);
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
    
    /**
     * 
     * @return statement about an flexbox order
     */
    public String orderStatement(){
        String orderSta = "Box Dimension: " + Arrays.toString(dim);
        orderSta += "\nCard Grade: " + cGrade;
        orderSta += "\nColours Printed: " + getColour();
        orderSta += "\nReinforced Bottoms?: " + getReinforcedBottom();
        orderSta += "\nReinforced Corners?: " + getReinforcedCorners();
        orderSta += "\nSealable Top?: " + sTop;
        orderSta += "\nQuantity of this box style ordered: " + qty;
        orderSta += "\nORDER SUB-TOTAL: £" + String.format("%.2f", calcPrice())  + "\n\n";
        
        return orderSta;
    }
}


