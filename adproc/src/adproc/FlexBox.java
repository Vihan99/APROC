package adproc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author up879045
 * @author  up850844
 */
public class FlexBox {
    protected int[] dim;
    protected int cGrade;
    protected int colPrint;
    protected boolean rBot;
    protected boolean rCorn;
    protected boolean sTop;
    protected static double[] gradePriceMultiplier = {0.55, 0.65, 0.82, 0.98, 1.5};
    
    public FlexBox(){}
    
    public FlexBox(int[] dimension, int cardGrade, int colourPrint, 
                   boolean reinforcedBottom, boolean reinforcedCorners, 
                   boolean sealableTop){
        dim = dimension;
        cGrade = cardGrade;
        colPrint = colourPrint;
        rBot = reinforcedBottom;
        rCorn = reinforcedCorners;
        sTop = sealableTop;
    }
    
    // accessor methods
    public int[] getDimension(){
        return dim;
    }
    public int getCardGrade(){
        return cGrade;
    }
    public int getColour(){
        return colPrint;
    }
    public boolean getReinforcedBottom(){
        return rBot;
    }
    public boolean getReinforcedCorners(){
        return rCorn;
    }
    public boolean getSealableTop(){
        return sTop;
    }
    // mutator methods
    public void setDimension(int[] newDim){
        dim = newDim;
    }
    public void setCardGrade(int newGrade){
        cGrade = newGrade;
    }
    public void setColour(int newColour){
        colPrint = newColour;
    }
    public void setReinforcedBottom(boolean newRBot){
        rBot = newRBot;
    }
    public void setReinforcedCorners(boolean newRCorn){
        rCorn = newRCorn;
    }
    public void setSealableTop(boolean newSTop){
        sTop = newSTop;
    }
    // end of accessor/mutator methods
    
    public double calcSurfaceArea(){
        double sa;
        sa = 2 * dim[0] + 2 * dim[1] + 2 * dim[2];
        return sa;
    }
    
    public double calcBasePrice(){
        double bp;
        double area = calcSurfaceArea();
        bp = area * gradePriceMultiplier[cGrade-1];
        return bp;
    }
    
}
