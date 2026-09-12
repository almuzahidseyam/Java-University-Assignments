
package w3resource;

import java.util.Scanner;

public class Problem13 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter Width = ");
        double num1 = in.nextDouble();
        System.out.print("Enter Height = ");
        double num2 = in.nextDouble();
        
        System.out.println("Area is = "+num1*num2);
        System.out.println("Perimeter is = "+(2*(num1+num2)));
    }
}
