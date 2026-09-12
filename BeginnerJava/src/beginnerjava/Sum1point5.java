
package beginnerjava;

import java.util.Scanner;

public class Sum1point5 {
     public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        double n,sum = 0;
        
        System.out.println("Enter the last number: ");
        n = input.nextDouble();
        
        for (double i = 1.5; i <= n; i= i+1) { // i++ mane i = i+1;
            System.out.print(i+" ");
            sum = sum+i;
            
        }
        System.out.println(" ");
        System.out.println(sum);
    }
}
