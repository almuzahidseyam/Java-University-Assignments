
package beginnerjava;

import java.util.Scanner;

public class For_Odd {
    
    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);
        
        int m, n, sum = 0;
        System.out.println("Enter initial number : ");
        m = input.nextInt();
        
        System.out.println("Enter final number : ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            if(i%2 != 0)
            {
                sum = sum +i;
                System.out.print(" "+i);
            }
            
        }
        System.out.println(" ");
        System.out.println("The sum is: "+sum);
        
    }
}

