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
public class FlexBoxTypeIII extends FlexBox {
    private int quantity;
    
    public FlexBoxTypeIII(int[] dimension, int cardGrade, int colourPrint, 
                        boolean reinforcedBottom, boolean reinforcedCorners, 
                        boolean sealableTop){
        super(dimension, cardGrade, colourPrint, reinforcedBottom,
              reinforcedCorners, sealableTop);
        
        if (
            (cardGrade <= 5 && cardGrade >= 2) &&
            (colourPrint == 2) &&
            (reinforcedBottom == false) &&
            (reinforcedCorners == false)
           ){
            System.out.println("OK!");
        }
        else{
            System.out.println("NOT OK!");
        }
    }
    
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int newQuantity){
        quantity = newQuantity;
    }
}
