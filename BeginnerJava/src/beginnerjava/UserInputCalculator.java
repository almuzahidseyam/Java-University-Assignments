
package beginnerjava;

import java.util.Scanner;

public class UserInputCalculator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1,num2,result;
        
        System.out.println("Enter First number: ");
        num1 = input.nextInt();
        
        System.out.println("Enter Second number: ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum = "+result);
        
        result = num1 - num2;
        System.out.println("Sub = "+result);
        
        result = num1 * num2;
        System.out.println("Multiplication = "+result);
        
        double result2 = (double) num1 / num2;
        System.out.println("Div = "+result2);
        
        result = num1 % num2;
        System.out.println("Reminder = "+result);
        
        
    }
}
