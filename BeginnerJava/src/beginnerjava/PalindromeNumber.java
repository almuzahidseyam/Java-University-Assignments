
package beginnerjava;

import java.util.Scanner;

public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num, temp, remainder, sum = 0;
        
        System.out.print("Enter any number = ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp != 0)
        {
            remainder = temp%10;
            sum = sum*10+remainder;
            temp = temp / 10;
        }
        System.out.println("The reverse number is = "+sum);
        if(num == sum)
        {
            System.out.println("Palindome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
