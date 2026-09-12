
package beginnerjava;

import java.util.Scanner;

public class Pattern_1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int num, row, col;
        num = input.nextInt();
        
        for (row = 1; row <= num; row++) {
            for(col = 1; col<= row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
        System.out.println("\n\n");
        for (row = 1; row <= num; row++) {
            for(col = 1; col<= row; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
