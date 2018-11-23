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
        int grade = 1;
        int colours = 0;
        boolean rBot = false;
        boolean rCorn = false;
        boolean sTop = true;
        int qty = 1;
        
        FlexBox goodBoxOrder = createFlexBoxOrder(arr, grade, colours, rBot, rCorn, sTop, qty);
        System.out.println("This is a " + goodBoxOrder.getClass().getSimpleName() + " order!");
        System.out.println("The Box has dimensions of: " + Arrays.toString(goodBoxOrder.getDimension()));
        System.out.println("The Box has " + goodBoxOrder.getColour() + " colours");
        System.out.println("The Box has a reinforced bottom value of: " + goodBoxOrder.getReinforcedBottom());
        System.out.println("The Box has a reinforced corners vale of : " + goodBoxOrder.getReinforcedCorners());
        System.out.println("The Box has a sealable top value of: " + goodBoxOrder.getSealableTop());
        System.out.println(goodBoxOrder.getQuantity() + " of these Boxes have been ordered.");
        System.out.println("The sub-total order price for this Box style is: " + goodBoxOrder.calcPrice()); 
        
    }
    
    
    
    /**
     * Method that takes all of the data fields for a box and creates and returns
     * the desired box
     * @param arr box dimension array
     * @param grade box grade value
     * @param colours number of box colours
     * @param rBot reinforced bottom value
     * @param rCorn reinforced corners value
     * @param sTop sealable top value
     * @param qty quantity of boxes of this type ordered.
     * @return created FlexBox of a specific type
     */
    public static FlexBox createFlexBoxOrder(double[] arr, int grade, int colours, boolean rBot, boolean rCorn, boolean sTop, int qty){
        
        if(
            (grade >= 1 && grade <= 3) && //conditions for a type i box
            (colours == 0) &&
            (rBot == false) &&
            (rCorn == false)
            ){
                return new FlexBoxTypeI(arr, grade, colours, rBot, rCorn, sTop, qty);
        }else if(
                (grade >= 2 && grade <= 4) && //conditions for a type ii box
                (colours == 1) &&
                (rBot== false) &&
                (rCorn == false)
                ){
                    return new FlexBoxTypeII(arr, grade, colours, rBot, rCorn, sTop, qty);
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type iii box
                (colours == 2) &&
                (rBot == false) &&
                (rCorn == false)
                ){
                    return new FlexBoxTypeIII(arr, grade, colours, rBot, rCorn, sTop, qty);
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type iv box
                (colours == 2) &&
                (rBot == true) &&
                (rCorn == false)
                ){
                    return new FlexBoxTypeIV(arr, grade, colours, rBot, rCorn, sTop, qty);
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type v box
                (colours == 2) &&
                (rBot == true) &&
                (rCorn == true)
                ){
                    return new FlexBoxTypeV(arr, grade, colours, rBot, rCorn, sTop, qty);
        }else{
            System.out.println("box not possible!!!");
            return null;
        }
        
    }
}
