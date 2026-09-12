
package arraydemo;

import java.util.Arrays;

public class Sorting {
    
    public static void main(String[] args) {
        
        int[] number = {10,-3,18,5,25};
        
        //ascending sort
        Arrays.sort(number);
        
        System.out.println("Ascending sort :  ");
        for (int i = 0; i < 5; i++) {
           
            System.out.print(" "+number[i]);
        }
        System.out.println("");
        
        
        System.out.println("Descending sort :  ");
        for (int i = 4; i >= 0; i--) {
           
            System.out.print(" "+number[i]);
        }
        System.out.println("");
    }
}
