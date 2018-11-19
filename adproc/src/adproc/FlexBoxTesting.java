/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc;

/**
 *
 * @author jayra
 */
public class FlexBoxTesting {
    public static void main(String arg[]){
        
//process to selectively create boxes of a specific type
        
        //eg input variable:
        int[] dim = {1, 2, 3};
        boolean stop = true;
        int qty = 10;
        //only these determine box type
        int grade = 2;
        int colours = 2;
        boolean rbot = true;
        boolean rcorn = false;
        
        
        if(
          (grade >= 1 && grade <= 3) && //conditions for a type i box
          (colours == 0) &&
          (rbot == false) &&
          (rcorn == false)
          ){
            FlexBoxTypeI box = new FlexBoxTypeI(dim,grade,colours,rbot,rcorn,stop,qty);
            System.out.println("Type I created");
        }else if(
                (grade >= 2 && grade <= 4) && //conditions for a type ii box
                (colours == 1) &&
                (rbot == false) &&
                (rcorn == false)
                ){
            FlexBoxTypeII box = new FlexBoxTypeII(dim,grade,colours,rbot,rcorn,stop,qty);
            System.out.println("Type II created");
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type iii box
                (colours == 2) &&
                (rbot == false) &&
                (rcorn == false)
                ){
            FlexBoxTypeIII box = new FlexBoxTypeIII(dim,grade,colours,rbot,rcorn,stop,qty);
            System.out.println("Type III created");
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type iv box
                (colours == 2) &&
                (rbot == true) &&
                (rcorn == false)
                ){
            FlexBoxTypeIV box = new FlexBoxTypeIV(dim,grade,colours,rbot,rcorn,stop,qty);
            System.out.println("Type IV created");
            double price = box.calcPrice();
            System.out.println("costs: " + price);
        }else if(
                (grade >= 2 && grade <= 5) && //conditions for a type v box
                (colours == 2) &&
                (rbot == true) &&
                (rcorn == true)
                ){
            FlexBoxTypeV box = new FlexBoxTypeV(dim,grade,colours,rbot,rcorn,stop,qty);
            System.out.println("Type V created");
        }else{
            System.out.println("Box not possible");
        }
    }
}
