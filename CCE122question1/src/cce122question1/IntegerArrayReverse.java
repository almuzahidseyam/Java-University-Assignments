
package cce122question1;

import java.util.Arrays;


public class IntegerArrayReverse {
    
    public static void main(String[] args) {
        
        int[] number = {1,45,67,78,54,34,57,99,88,77,55};
        
        System.out.println("Begining Array : "+Arrays.toString(number));
   
        for (int i = 0; i < number.length/2; i++) {
            
            int temp = number[i];
            number[i] = number[number.length-i-1];
            number[number.length-i-1] = temp;
            
        }
        System.out.println("reverse array : "+Arrays.toString(number));
    }
}
