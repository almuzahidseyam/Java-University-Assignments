package arraydemo;

import java.util.Scanner;

public class Two_D_Array_1_for_Exercise {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] A = new int[2][3];
        int[] [] B = new int[2][3];
        int[][] C  = new int[2][3];
        
        System.out.println("Enter elemnent for A matrix = ");
        
        //gettig input for A matrix
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col] = input.nextInt();
            }
            
        }
        System.out.println("\n");
        
        System.out.println("Enter elements for B matrix = ");
        
        //getting input for B matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col] = input.nextInt();
            } 
           
        }
        System.out.println("\n");
        
        System.out.println("printing elemnent for A matrix = ");
        
        //printing input for A matrix
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
        System.out.println("\n");
        
        System.out.println("printing elements for B matrix = ");
        
        //printing input for B matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+ B[row][col]);
                
            } 
            System.out.println();
        }
        System.out.println("\n");
        
        System.out.print("Adding Matrix A & Matrix B = ");
        
        // adding matrix A & B
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+ (A[row][col] + B[row][col]));
            }
            System.out.println();
        }
    }
}
