package adproc;
public class BoxOrdering {
    /**
     * Method to return a created flexbox order of a specific type given a flexbox's data fields
     * @param arr dimension array
     * @param grade card grade value
     * @param colours colours value
     * @param rBot reinforced bottom value
     * @param rCorn reinforced corners value
     * @param sTop sealable top value
     * @param qty quantity for this style of box
     * @return flexbox order of a specific type
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
            return null;
        }
    }
}