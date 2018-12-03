package adproc;
/**
 * FlexBoxTypeV subclass
 */
public class FlexBoxTypeV extends FlexBox {
    /**
     * Constructor for FlexBoxTypeV subclass
     * @param dimension Array for the x,y,z dimensions of the box
     * @param sealableTop Declares whether box has a sealable top
     * @param quantity Quantity of boxes of this instance
     */
    public FlexBoxTypeV(double[] dimension, int cardGrade, 
                        boolean sealableTop, int quantity){
        super(dimension, cardGrade, sealableTop, quantity);        
    }
    /**
     * Method to return value of colours for TypeV FlexBox
     * @return Will be 2 for all TypeV FlexBoxes
     */
    @Override
    public int getColour(){
        return 2;
    }
    /**
     * Method to return value of reinforced bottom for TypeV FlexBox
     * @return Will be true for all TypeV FlexBoxes
     */
    @Override
    public boolean getReinforcedBottom(){
        return true;
    }
    /**
     * Method to return value of reinforced corners for TypeV FlexBox
     * @return Will be true for all TypeV FlexBoxes
     */
    @Override
    public boolean getReinforcedCorners(){
        return true;
    }
    /**
     * Method to calculate the order price for the box(es) of this instance 
     * @return order price for the box(es) of this instance
     */
    @Override
    public double calcPrice(){
        double area = calcSurfaceArea();
        double p = area * gradePriceMultiplier[cGrade-1];
        
        double totalModifier = 1 + 0.15 + 0.13 + 0.12;
        p *= totalModifier;
        if(sTop == true){
            return p * 1.1 * qty;
        }else{
            return p * qty;
        }
    }
}
