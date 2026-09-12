
package w3resource;

import java.util.Scanner;

public class Problem6 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input First integer : ");
        int num1 = in.nextInt();
        System.out.print("Input Second integer : ");
        int num2 = in.nextInt();
        
        System.out.println(num1 + " + " + num2 +" = "+ num1+num2);
        System.out.println(num1 + " - " + num2 +" = "+ (num1-num2));
        System.out.println(num1 + " * " + num2 +" = "+ num1*num2);
        System.out.println(num1 + " / " + num2 +" = "+ num1/num2);
        System.out.println(num1 + " mod " + num2 +" = "+ num1%num2);
        
    }
}
