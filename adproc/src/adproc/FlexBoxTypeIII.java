package adproc;
/**
 * FlexBoxTypeIII subclass
 */
public class FlexBoxTypeIII extends FlexBox {
    /**
     * Constructor for FlexBoxTypeIII subclass
     * @param dimension Array for the x,y,z dimensions of the box
     * @param cardGrade Value of the card grade (1-5)
     * @param sealableTop Declares whether box has a sealable top
     * @param quantity Quantity of boxes of this instance
     */
    public FlexBoxTypeIII(double[] dimension, int cardGrade, 
                        boolean sealableTop, int quantity){
        super(dimension, cardGrade, sealableTop, quantity);
    }
    /**
     * Method to return value of colour for TypeIII FlexBox
     * @return Will be 2 for all TypeIII FlexBoxes
     */
    @Override
    public int getColour(){
        return 2;
    }
    /**
     * Method to return value of reinforced bottom for TypeIII FlexBox
     * @return Will be false for all TypeIII FlexBoxes
     */
    @Override
    public boolean getReinforcedBottom(){
        return false;
    }
    /**
     * Method to return value of reinforced corners for TypeIII FlexBox
     * @return Will be false for all TypeIII FlexBoxes
     */
    @Override
    public boolean getReinforcedCorners(){
        return false;
    }
    /**
     * Method to calculate the order price for the box(es) of this instance 
     * @return order price for the box(es) of this instance
     */
    @Override
    public double calcPrice(){
        double area = calcSurfaceArea();
        double p = area * gradePriceMultiplier[cGrade-1];
        
        p *= (1 + 0.15);
        if(sTop == true){
            return p * 1.1 * qty;
        }else{
            return p * qty;
        }
    }
}
