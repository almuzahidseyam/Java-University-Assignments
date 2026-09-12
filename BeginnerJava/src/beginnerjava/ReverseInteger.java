
package beginnerjava;

import java.util.Scanner;

public class ReverseInteger {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any number = " );
        int num, sum = 0, remainder, temp;
        num = input.nextInt();
        
        temp = num ;
        while(temp!=0)
        {
            remainder =temp % 10;
            sum = sum*10 + remainder;
            temp = temp/10;
            
        }
        System.out.println("the reverse of the of the number = "+sum);
    }
}
