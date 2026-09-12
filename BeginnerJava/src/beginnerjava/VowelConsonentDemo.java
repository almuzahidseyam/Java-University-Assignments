
package beginnerjava;

import java.util.Scanner;


public class VowelConsonentDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter : ");
        ch = input.next().charAt(0); //muzahid
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o'|| ch=='e'){
            
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonent");
        }
    }
}
