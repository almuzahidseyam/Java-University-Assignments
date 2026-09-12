
package w3resource;

import java.util.Scanner;

public class Problem12 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("Input First Number = ");
        int num1 = in.nextInt();
        System.out.print("Input Second Number = ");
        int num2 = in.nextInt();
        System.out.print("Input Third Number = ");
        int num3 = in.nextInt();
        System.out.print("Input Fourth Number = ");
        int num4 = in.nextInt();
        System.out.print("Input Five Number = ");
        int num5 = in.nextInt();
        
        System.out.println("Average of five number is = "+ (num1+num2+num3+num4+num5)/5);
    }
}
