
package beginnerjava;

import java.util.Scanner;

public class ArmostrongNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any number = ");
        int n = input.nextInt();
        int temp = n;
        int sum = 0;
        
        while(temp != 0){
            int remainder  = temp % 10;
            sum = sum + remainder*remainder*remainder;
            temp = temp/10;
        }
        
        if(n == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number.");
        }
    }
}
