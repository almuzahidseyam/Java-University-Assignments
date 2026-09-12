
package arraydemo;

import java.util.Scanner;

public class Array_Maximum_Minimum {
    
    // code modify formatted... er jonno agey puro code ta select kore nite hobe . then altr+shift+s capte hobe...  
    public static void main(String[] args) {
                    
        Scanner input = new Scanner(System.in);
        
        double[ ] number = new  double[5];
        double sum = 0;
        
        System.out.println("Enter 5 numbers : ");
        
        for(int i = 0; i<number.length ; i++){
            number[i] = input.nextDouble();
            
        }
        for(int i = 0 ; i<number.length; i++)
        {
            sum = sum + number[i];
        }
        System.out.println("The sum is : "+sum);
        double avg = sum/number.length;
        System.out.println("The average is: "+avg);
        
        double max = number[0];
        double min = number[0];
        for (int i = 1; i < 5; i++) {// ekhane number 0 jehetu rekhechi i=0 er modde ....
            if(max < number[i])
            {
                max = number[i];
                
            }
            if (min> number[i])
            {
                min = number[i];
            }
            
        }
        System.out.println("The maximum = "+max);
        System.out.println("The minimum = "+min);
        
    }
}
