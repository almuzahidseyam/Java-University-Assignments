
package newjava;

import java.util.Scanner;

public class VowelConsonent {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Please enter a new letter = ");
        char ch;
        
        ch = input.next().charAt(0);
        
        if(ch == 'a'){
            System.out.println("vowel");
        }
    }
}
