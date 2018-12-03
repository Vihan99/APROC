package adproc;

/**
 * FlexBoxTypeIII subclass
 * @author up850844
 */
public class FlexBoxTypeIII extends FlexBox {
//    private int colPrint = 2;
//    private boolean rBot = false;
//    private boolean rCorn = false;
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
    
    @Override
    public int getColour(){
        return 2;
    }
    @Override
    public boolean getReinforcedBottom(){
        return false;
    }
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
