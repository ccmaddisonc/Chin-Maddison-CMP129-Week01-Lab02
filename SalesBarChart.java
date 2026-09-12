//package Labs.Week_1.scr;
/*
    Maddison Chin
    CMP129-80235   
    Week 1, Lab 2
    11 September 2026
 */

import java.util.Scanner;

public class SalesBarChart {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //declare variables
        int stores;
        int sales;
        String Ast;
        String astChart = " ";

        //prompt user to enter number of stores
        System.out.print("Enter number of stores: ");
        stores = input.nextInt();

        //create for loop to repeat for each store
        for(int i=0; i<stores; i++){
            //prompt user to enter sales from stores
            System.out.print("Enter today's sales for store " + (i+1) + ": ");
            sales = input.nextInt();
            //calculation for chart when translating every 100 to = *
            sales = sales/100;
            //clear so * from previous stores do not get stuck
            Ast = " ";

            //create for loop to turn collect sales data into *
            for(int j=0; j<sales; j++){
                //add * onto the empty string Ast
                Ast = Ast + "*"; 
            }
                //form the whole chart of sales turned to *s including store numbers
                astChart = astChart + "\nStore " + (i+1) + ": " + Ast + "\n";                 
        }
            //display border btwn data collected and chart
            System.out.println("------------------------------------------------------");
            //display chart title to user
            System.out.println("SALES BAR CHART\n" + "Each * = $100");
            //display whole chart
            System.out.println(astChart);
        
    }   //end of main method
}   //end of class
