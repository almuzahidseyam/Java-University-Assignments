
package beginnerjava;

import java.util.Scanner;

public class Loop_1_Demo {
    
    public static void main(String[] args) {
        /*
        int sum  = 0;
        
        for (int i = 1; i <= 10; i++) {
            
            sum = sum + i;  
        }
        System.out.println("The sum is = "+sum);
        */
        Scanner input  = new Scanner(System.in);
        int m,n,sum = 0;
        System.out.println("Enter initial number : ");
        
         m = input.nextInt();
         System.out.println("Enter final number : ");
        
         n = input.nextInt();
        for(int i = m; i <= n; i++) {
            
            sum = sum + i;  
        }
        System.out.println("The sum is = "+sum);
    }
}
