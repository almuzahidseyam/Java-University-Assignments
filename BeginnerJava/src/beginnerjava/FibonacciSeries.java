
package beginnerjava;

import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers : ");
        int n = input.nextInt();
        
        int first = 0;
        int second = 1;
        int fibo; ////********* Tutorialspoint and javaTpoint ei duita sight dekha
        
        System.out.print(first+" "+second);
        
        for (int i = 3; i <= n; i++) { // already duita number amra print kore diyechi... tai i = 3 theke suru korbo....
            
            fibo = first + second;
            System.out.print(" "+fibo);
            
            first = second;
            second = fibo;
        }
        System.out.println(); // build successful likha ta pore jate dekhay
        
    }
}
