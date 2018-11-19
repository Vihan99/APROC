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
public class FlexBoxTypeII extends FlexBox {
    private int quantity;
    
    public FlexBoxTypeII(int[] dimension, int cardGrade, int colourPrint, 
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
        p *= 1.12;
        if(sTop == true){
            return p *= 1.1;
        }else{
            return p;
        }
    }
}
