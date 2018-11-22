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
        String newBoxType = getFlexBoxType(grade, colours, rBot, rCorn);
        
        if(newBoxType.equals("typei")){
            FlexBoxTypeI boxOrder = new FlexBoxTypeI(arr, grade, colours, rBot, rCorn, sTop, qty);
            System.out.println("This is a " + boxOrder.getClass().getSimpleName() + " order!");
            System.out.println("The Box has dimensions of: " + Arrays.toString(boxOrder.getDimension()));
            System.out.println("The Box has " + boxOrder.getColour() + " colours");
            System.out.println("The Box has a reinforced bottom value of: " + boxOrder.getReinforcedBottom());
            System.out.println("The Box has a reinforced corners vale of : " + boxOrder.getReinforcedCorners());
            System.out.println("The Box has a sealable top value of: " + boxOrder.getSealableTop());
            System.out.println(boxOrder.getQuantity() + " of these Boxes have been ordered.");
            System.out.println("The sub-total order price for this Box style is: " + boxOrder.calcPrice()); 
        }
       
        
    }
    
    /**
     * Method to return a string describing box type
     * @param grade
     * @param colours
     * @param rbot
     * @param rcorn
     * @return string describing type or null if impossible values are entered
     */
    public static String getFlexBoxType(int grade, int colours, boolean rbot, boolean rcorn){
        
        if(
            (grade >= 1 && grade <= 3) && //conditions for a type i box
            (colours == 0) &&
            (rbot == false) &&
            (rcorn == false)
            ){
                return "typei";
        }else if(
                (grade >= 2 && grade <= 4) && //conditions for a type ii box
                (colours == 1) &&
                (rbot== false) &&
                (rcorn == false)
                ){
                    return "typeii";
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type iii box
                (colours == 2) &&
                (rbot == false) &&
                (rcorn == false)
                ){
                    return "typeiii";
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type iv box
                (colours == 2) &&
                (rbot == true) &&
                (rcorn == false)
                ){
                    return "typeiv";
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type v box
                (colours == 2) &&
                (rbot == true) &&
                (rcorn == true)
                ){
                    return "typev";
        }else{
            System.out.println("box not possible!!!");
            return null;
        }
        
    }
}
