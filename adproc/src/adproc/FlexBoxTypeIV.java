/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc;

/**
 * FlexBoxTypeIV subclass
 * @author up850844
 */
public class FlexBoxTypeIV extends FlexBox {
    
    /**
     * Constructor for FlexBoxTypeIV subclass
     * @param dimension Array for the x,y,z dimensions of the box
     * @param cardGrade Value of the card grade (1-5)
     * @param colourPrint Value of the number of colours used in printing (0-2)
     * @param reinforcedBottom Declares whether box has a reinforced bottom
     * @param reinforcedCorners Declares whether box has reinforced corners
     * @param sealableTop Declares whether box has a sealable top
     * @param quantity Quantity of boxes of this instance
     */
    public FlexBoxTypeIV(int[] dimension, int cardGrade, int colourPrint, 
                        boolean reinforcedBottom, boolean reinforcedCorners, 
                        boolean sealableTop, int quantity){
        super(dimension, cardGrade, colourPrint, reinforcedBottom,
              reinforcedCorners, sealableTop, quantity);
    }
    
    /**
     * Method to calculate the order price for the box(es) of this instance 
     * @return order price for the box(es) of this instance
     */
    public double calcPrice(){
        double p = calcBasePrice();
        double totalModifier = 1 + 0.15 + 0.13;
        p *= totalModifier;
        if(sTop == true){
            return p * 1.1 * qty;
        }else{
            return p * qty;
        }
    }
}
