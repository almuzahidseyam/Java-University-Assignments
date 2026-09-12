
package welcome1;

import java.util.Scanner;

public class Comparison {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1st integer :  ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd integer :  ");
        int num2 = input.nextInt();
        
        if(num1 == num2){
            System.out.printf("%d == %d%n",num1,num2);
        }
        if(num1 != num2){
            System.out.printf("%d != %d%n",num1,num2);
        }
        if(num1 > num2){
            System.out.printf("%d > %d%n",num1,num2);
        }
        if(num1 < num2){
            System.out.printf("%d < %d%n",num1,num2);
        }
        if(num1 >= num2){
            System.out.printf("%d >= %d%n",num1,num2);
        }
        if(num1 <= num2){
            System.out.printf("%d <= %d%n",num1,num2);
        }
        
    }
}
