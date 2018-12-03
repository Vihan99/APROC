package adproc;

/**
 * FlexBoxTypeV subclass
 * @author up850844
 */
public class FlexBoxTypeV extends FlexBox {
//    private int colPrint = 2;
//    private boolean rBot = true;
//    private boolean rCorn = true;
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
    
    @Override
    public int getColour(){
        return 2;
    }
    @Override
    public boolean getReinforcedBottom(){
        return true;
    }
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
