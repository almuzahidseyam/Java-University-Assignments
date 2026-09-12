
package beginnerjava;

import java.util.Scanner;
public class InputString {
    
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       //String name;
       
       //name = "Al Muzahid";
       
       //String name = "Al Muzahid";
       String name;
       
        System.out.print("Enter your name: ");
        
        //name = input.next();
        name = input.nextLine();
        //System.out.println("name is : "+name);
        //System.out.println("Welcome : "+name);
        System.out.println("Welcome : "+name);
    }
}
