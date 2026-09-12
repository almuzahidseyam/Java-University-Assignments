
package beginnerjava;

import java.util.Scanner;

public class Timetable2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.println("Enter initial number = ");
        m = input.nextInt(); //5
        System.out.println("Enter final number = ");
        n = input.nextInt(); //10
        
        for (int i = m; i <= n; i++) {
            
                for (int j = 1; j <= 10; j++) {
                System.out.println(i+" X " + j + " = " + i*j);
                
            }
                System.out.println("\n\n");
        }
    }
}
