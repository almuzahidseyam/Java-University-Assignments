
package welcome1;

import java.util.Scanner;

public class Welcome1 {

 
    public static void main(String[] args) {
        
        System.out.println("Welcome to JAVA programming");
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        switch(n){
            
            case 1: 
                System.out.println("One");
                break;
            case 2: 
                System.out.println("Two");
                break;
                
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
                
            default:
                System.out.println("No number");
                
            
        }
    }
    
}
