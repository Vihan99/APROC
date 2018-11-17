/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adproc;

import java.util.Arrays;

/**
 *
 * @author jayra
 */
public class FlexBoxTesting {
    public static void main(String arg[]){
        int[] dim = {55,55,55};
        FlexBoxTypeI fbi = new FlexBoxTypeI(dim, 2, 3, true, true, true);
        
        fbi.setQuantity(5);
        System.out.println("My First FlexBox:");
        System.out.println("Dimension: " + Arrays.toString(fbi.getDimension()));
        System.out.println("Card Grade: " + fbi.getCardGrade());
        System.out.println("Colour Print: " + fbi.getColour());
        System.out.println("Reinforced Bottom: " + fbi.getReinforcedBottom());
        System.out.println("Reinforced Corners: " + fbi.getReinforcedCorners());
        System.out.println("Sealable Top: " + fbi.getSealableTop());
        System.out.println("Quantity: " + fbi.getQuantity());
        
        int[] newDim = {66,66,66};
        fbi.setDimension(newDim);
        fbi.setCardGrade(5);
        fbi.setColour(0);
        fbi.setReinforcedBottom(false);
        fbi.setReinforcedCorners(false);
        fbi.setSealableTop(false);
        fbi.setQuantity(10);
        
        System.out.println("\nMy FlexBox Updated:");
        System.out.println("Dimension: " + Arrays.toString(fbi.getDimension()));
        System.out.println("Card Grade: " + fbi.getCardGrade());
        System.out.println("Colour Print: " + fbi.getColour());
        System.out.println("Reinforced Bottom: " + fbi.getReinforcedBottom());
        System.out.println("Reinforced Corners: " + fbi.getReinforcedCorners());
        System.out.println("Sealable Top: " + fbi.getSealableTop());
        System.out.println("Quantity: " + fbi.getQuantity());
    }
}
