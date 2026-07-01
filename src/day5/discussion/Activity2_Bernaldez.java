
package day5.discussion;

public class Activity2_Bernaldez {
    
    public static void main(String[] args) {
        
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;
        
        double foodPercent = (foodAllowance / income) * 100;
        double transportationPercent = (transportation / income) * 100;
        double rentPercent = (rent / income) * 100;
        double utilityPercent = (utilityBill / income) * 100;
        
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses; 
       
        // %.1f -> prints a decimal number with 1 digit afte the decimal point
        // %% -> prints the % symbol
        // \n -> goes to the next line
        System.out.printf("Food Allowance: %.1f %%\n", foodPercent);
        System.out.printf("Trasportation: %.1f %%\n", transportationPercent);
        System.out.printf("Rent: %.1f %%\n", rentPercent);
        System.out.printf("Utility Bill: %.1f %%\n", utilityPercent);
        
        
        System.out.println("Remaining Balance: " + remainingBalance);
            
    }
    
}
