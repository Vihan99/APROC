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
    //values for colours, reinforced bottom and reinforced corners are accessed by calling methods implemented in each subclass
    
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
     * Accessor method to get number of colours printed on box
     * @return number of colours printed on box
     */
    abstract int getColour();
    /**
     * Accessor method to get reinforced bottom value
     * @return true if box has reinforced bottom
     */
    abstract boolean getReinforcedBottom();
    /**
     * Accessor method to get reinforced corners value
     * @return true if box has reinforced corners
     */
    abstract boolean getReinforcedCorners();
    /**
     * Accessor method to get sealable top value
     * @return true if box has sealable top
     */
    public boolean getSealableTop(){
        return sTop;
    }
    /**
     * Accessor method to get box order quantity value
     * @return quantity of boxes ordered of the specific instance
     */
    public int getQuantity(){
        return qty;
    }
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
     * Mutator method to set whether box has a sealable top
     * @param newSTop false if box doesn't have a sealable top
     */
    public void setSealableTop(boolean newSTop){
        sTop = newSTop;
    }
    /**
     * Mutator method to set box order quantity value
     * @param newQuantity new value for the quantity of boxes of this instance
     */
    public void setQuantity(int newQuantity){
        qty = newQuantity;
    }
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
     * Method to create and return a string describing the features of an ordered box
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


