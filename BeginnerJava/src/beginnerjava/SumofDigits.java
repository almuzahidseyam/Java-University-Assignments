
package beginnerjava;

import java.util.Scanner;

public class SumofDigits {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num , temp, reminder, sum=0;
        
        System.out.print(" Enter the nuumber : ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp!=0)
        {
            reminder = temp % 10;
            sum = sum + reminder;
            temp = temp/10;
        }
        System.out.println("The sum of digits "+sum);
    }
}
