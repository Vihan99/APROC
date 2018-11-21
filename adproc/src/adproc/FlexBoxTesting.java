/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc;

import java.util.Arrays;

/**
 *
 * @author up850844
 */
public class FlexBoxTesting {
    public static void main(String arg[]){
        double[] arr = {0.4,0.5,0.2};
        FlexBox newBoxOrder = createFlexBoxOrder(arr, 1, 0, false, false, true, 10);
        
        System.out.println("This is a " + newBoxOrder.getClass().getSimpleName() + " order!");
        System.out.println("The Box has dimensions of: " + Arrays.toString(newBoxOrder.getDimension()));
        System.out.println("The Box has " + newBoxOrder.getColour() + " colours");
        System.out.println("The Box has a reinforced bottom value of: " + newBoxOrder.getReinforcedBottom());
        System.out.println("The Box has a reinforced corners vale of : " + newBoxOrder.getReinforcedCorners());
        System.out.println("The Box has a sealable top value of: " + newBoxOrder.getSealableTop());
        System.out.println(newBoxOrder.getQuantity() + " of these Boxes have been ordered.");
        //HOW CAN THIS BE FIXED?
        //System.out.println("The sub-total order price for this Box style is: " + newBoxOrder.calcPrice()); 
    }
    
    /**
     * Method to create and return a flexbox of a specific type 
     * @param dim
     * @param grade
     * @param colours
     * @param rbot
     * @param rcorn
     * @param stop
     * @param qty
     * @return the created flexbox or null if impossible values are entered
     */
    public static FlexBox createFlexBoxOrder(double[] dim, int grade, int colours,
                                 boolean rbot, boolean rcorn, boolean stop,
                                 int qty){
        
        if(
            (grade >= 1 && grade <= 3) && //conditions for a type i box
            (colours == 0) &&
            (rbot == false) &&
            (rcorn == false)
            ){
                FlexBoxTypeI box = new FlexBoxTypeI(dim,grade,colours,rbot,rcorn,stop,qty);
                return box;
        }else if(
                (grade >= 2 && grade <= 4) && //conditions for a type ii box
                (colours == 1) &&
                (rbot== false) &&
                (rcorn == false)
                ){
                    FlexBoxTypeII box = new FlexBoxTypeII(dim,grade,colours,rbot,rcorn,stop,qty);
                    return box;
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type iii box
                (colours == 2) &&
                (rbot == false) &&
                (rcorn == false)
                ){
                    FlexBoxTypeIII box = new FlexBoxTypeIII(dim,grade,colours,rbot,rcorn,stop,qty);
                    return box;
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type iv box
                (colours == 2) &&
                (rbot == true) &&
                (rcorn == false)
                ){
                    FlexBoxTypeIV box = new FlexBoxTypeIV(dim,grade,colours,rbot,rcorn,stop,qty);
                    return box;
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type v box
                (colours == 2) &&
                (rbot == true) &&
                (rcorn == true)
                ){
                    FlexBoxTypeV box = new FlexBoxTypeV(dim,grade,colours,rbot,rcorn,stop,qty);
                    return box;
        }else{
            System.out.println("box not possible!!!");
            return null;
        }
        
    }
}
