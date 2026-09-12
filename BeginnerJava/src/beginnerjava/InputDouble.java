
package beginnerjava;

import java.util.Scanner;

public class InputDouble {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double num1;
        
        System.out.println("Enter any Double value: ");
        num1 = input.nextDouble();
        
        System.out.println(num1);
        //System.out.println("num1 = "+num1);
    }
    
}
