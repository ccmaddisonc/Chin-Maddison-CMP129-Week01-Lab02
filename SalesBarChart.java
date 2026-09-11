//package Labs.Week_1.scr;

import java.util.Scanner;

public class SalesBarChart {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //declare variables
        int stores;
        int sales;
        String Ast = " ";

        //prompt user to enter number of stores
        System.out.print("Enter number of stores: ");
        stores = input.nextInt();
            
        //create for loop to repeat for each store
        for(int i=0; i<stores; i++){
            //prompt user to enter sales from stores
            System.out.print("Enter today's sales for store " + (i+1) + ": ");
            sales = input.nextInt();
            sales = sales/100;

            for(int j=0; j<sales; j++){
            Ast = Ast + "*";
            System.out.println(Ast);
            //Ast = Ast + "\n";
            
            }
        
        }

        System.out.println("SALES BAR CHART\n" + "Each * = $100");

        
        
    
        
        
    }   //end of main method
        
}   //end of class
