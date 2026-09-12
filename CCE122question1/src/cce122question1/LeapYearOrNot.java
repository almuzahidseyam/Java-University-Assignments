
package cce122question1;

import java.util.Scanner;

public class LeapYearOrNot {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input the year : ");
        int year = input.nextInt();
        
        if((year%400 == 0) || ((year%4 == 0) && (year%100 !=0))){
            System.out.println("This is leap year");
        }
        else 
            System.out.println("Not leap year");
    }
}
