
package arraydemo;

import java.util.Scanner;

public class Two_D_Array_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        
        int[][] C = new int[2][3];
        
        System.out.println("Please Enter Element for A Matrix : ");
        //getting input for A matrix
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col] = input.nextInt();
            }
        }
        
        System.out.println("Please Enter Element for B Matrix : ");
        //getting input for B matrix
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col] = input.nextInt();
            }
        }

        //printing A matrix
        System.out.print("A = ");
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
               
                System.out.print("\t "+A[row][col]);
            }
            System.out.println();
        }

        System.out.print("\n");
        
        
        //printing B matrix
        System.out.print("B = ");
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
   
                System.out.print("\t "+B[row][col]);
            }
            System.out.println(); 
        }
        
        System.out.print("\n");
        System.out.print("A+B = ");
        
        
        // Adding A & B Matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
                C[row][col] = A[row][col]+B[row][col];
                System.out.print("\t "+C[row][col]);
                
                //System.out.print("\t "+(A[row][col]+B[row][col]));
            }
            System.out.println();
        }
        
        
        System.out.println("\n");
        System.out.print("A-B = ");
        
        // Substracting A & B Matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
                C[row][col] = A[row][col]-B[row][col];
                System.out.print("\t "+C[row][col]);
                
                //System.out.print("\t "+(A[row][col]-B[row][col]));
            }
            System.out.println();
        }
    }
}
