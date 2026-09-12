
package arraydemo;

import java.util.Scanner;

public class Array_5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        
        System.out.print("Enter 5 numbers : ");
        
        for (int i = 0; i  < 5; i++) {
            number[i] =  input.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            sum = sum + number[i];
        }
        
        System.out.println("The sum is : "+sum);
    }
}
