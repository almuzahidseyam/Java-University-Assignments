
package beginnerjava;

import java.util.Scanner;

public class InputDemo {
    
    public static void main(String[] args) {
        Scanner Farhan = new Scanner(System.in);// scanner == class; input = variable; 
        String name;
        System.out.println("Enter your name : ");
        name = Farhan.nextLine();
        
        double num;
        System.out.println("Enter a double number: ");
        num = Farhan.nextDouble();
        
        
        System.out.println("welcome : "+name);
        System.out.println("The num is : "+num);
    }
}
    
