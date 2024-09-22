/* 
I learned how to use ! to negate equals -> not equal https://stackoverflow.com/questions/16995809/opposite-of-java-equals-method,
how to create and use lists: https://java-programming.mooc.fi/part-3/2-lists
how to find size/length of list: https://www.geeksforgeeks.org/list-size-method-in-java-with-examples/
how to iterate through lists: https://stackoverflow.com/questions/12335405/iterating-through-list-in-java-using-for-loop
*/

package com.example.project;
import java.util.Scanner;
import java.util.ArrayList;


public class extraCredit {
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
        Scanner scan = new Scanner(System.in);
        String character = "";
        ArrayList<String> itemsOrdered = new ArrayList<>();
    
        while (!character.equals("-1")) {
            System.out.print("Enter an item name or type '-1' to finish: ");
            character = scan.nextLine();
            itemsOrdered.add(character);
        }


        int people = 2; 
        int percent = 5;
        double cost = 29.56;              
        System.out.print(calculateTip(people,percent, cost));

        System.out.println("Items ordered: ");

        int size = itemsOrdered.size();
        size --;
        for (int i=0; i<size;){
            System.out.println(itemsOrdered.get(i));
            i ++;
        }




        scan.close();
        
    }
}
        
