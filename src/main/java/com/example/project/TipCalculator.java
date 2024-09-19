// I learned how to round with this website: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java


package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
                       
        double totalTip = (cost * percent) /100.00;
        double totalBillWithTip = cost + totalTip;
        double personCost = cost / people;
        double personTipCost = totalTip / people;
        double totalCostPerPerson = totalBillWithTip / people;


        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + Math.round(cost*100) / 100.00 + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + Math.round(totalTip * 100) / 100.00  + "\n");
        result.append("Total Bill with tip: $" + Math.round(totalBillWithTip * 100) / 100.00 + "\n");
        result.append("Per person cost before tip: $" + Math.round(personCost * 100) / 100.00 + "\n");
        result.append("Tip per person: $" + Math.round(personTipCost * 100) / 100.00 + "\n");
        result.append("Total cost per person: $" + Math.round(totalCostPerPerson * 100) / 100.00 + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        // try different values for people, percent, and cost to test your program before running test cases
        // int people = 0; 
        // int percent = 0;
        // double cost = 0;              
        // System.out.println(calculateTip(people,percent, cost));
    }
}
        
