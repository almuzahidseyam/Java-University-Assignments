
package w3resource;

import java.util.Scanner;

public class Problem11 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
     
        System.out.print("Radius = ");
        double radius = input.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI*radius*radius;
        
        System.out.println("Perimeter is = "+perimeter);
        System.out.println("Area is =  "+area);
    }
}
