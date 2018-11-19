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
public class FlexBoxTypeIV extends FlexBox {
    private int quantity;
    
    public FlexBoxTypeIV(int[] dimension, int cardGrade, int colourPrint, 
                        boolean reinforcedBottom, boolean reinforcedCorners, 
                        boolean sealableTop){
        super(dimension, cardGrade, colourPrint, reinforcedBottom,
              reinforcedCorners, sealableTop);
    }
    
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int newQuantity){
        quantity = newQuantity;
    }
    
    public double calcPrice(){
        double p = calcBasePrice();
        double totalModifier = 1 + 0.15 + 0.13;
        p *= totalModifier;
        if(sTop == true){
            return p *= 1.1;
        }else{
            return p;
        }
    }
}
