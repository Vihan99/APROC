package adproc;
/**
 * FlexBoxTypeI subclass
 * @author up850844
 */
public class FlexBoxTypeI extends FlexBox{
    /**
     * Constructor for FlexBoxTypeI subclass
     * @param dimension Array for the x,y,z dimensions of the box
     * @param cardGrade Value of the card grade (1-5)
     * @param sealableTop Declares whether box has a sealable top
     * @param quantity Quantity of boxes of this instance
     */
    public FlexBoxTypeI(double[] dimension, int cardGrade,  
                        boolean sealableTop, int quantity){
        super(dimension, cardGrade, sealableTop, quantity);
    }
    /**
     * Method to return value of colour for TypeI FlexBox
     * @return Will be 0 for all TypeI FlexBoxes
     */
    @Override
    public int getColour(){
        return 0;
    }
    /**
     * Method to return value of reinforced bottom for TypeI FlexBox
     * @return Will always be false for TypeI FlexBoxes
     */
    @Override
    public boolean getReinforcedBottom(){
        return false;
    }
    /**
     * Method to return value of reinforced corners for TypeI FlexBox
     * @return Will always be false for TypeI FlexBoxes
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
        if(sTop == true){
            return p * 1.1 * qty;
        }else{
            return p * qty;
        }
    }
}
