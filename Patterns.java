//package Labs.Week_1.scr;
/*
    Maddison Chin
    CMP129-80235   
    Week 1, Lab 2
    11 September 2026
 */

public class Patterns {
    public static void main(String[] args){


        //declare variables
        String titleBorder = "_________________________________________";
        int pattern = 10;
        
        //display line border
        System.out.println(titleBorder);
        //display titles for both patterns
        System.out.println("Pattern A                   Pattern B");
        //display another border to emphasize title
        System.out.println(titleBorder);

        //create for loop to separate 10 lines
        for(int i=1; i<=pattern; i++){
            String pattA = "";
            //create nested for loop for pattern A
            for (int a=0; a<i; a++){
                pattA = pattA + "+";
            }
            String pattB = "";
            //create nested for loop for pattern B
            for(int b=0; b<=(10-i); b++){
                pattB = pattB + "+";
            }
        //display +s for pattern A and pattern B
        System.out.println(pattA + "                             " + pattB);

        }   //end of main for loop

        }   //end of main
    }   //end of class
