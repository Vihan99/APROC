/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc;

/**
 *
 * @author up850844
 */
public class BoxOrdering {
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

    FlexBox createFlexBoxOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

