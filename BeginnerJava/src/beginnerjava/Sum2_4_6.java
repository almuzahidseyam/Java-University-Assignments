// 2+4+6+.......+n
package beginnerjava;

import java.util.Scanner;

public class Sum2_4_6 {
     public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        int n,sum = 0;
        
        System.out.println("Enter the last number: ");
        n = input.nextInt();
        
        for (int i = 2; i <= n; i= i+2) { // i++ mane i = i+1;
            System.out.print(i+" ");
            sum = sum+i;
            
        }
        System.out.println(" ");
        System.out.println(sum);
    }
}
