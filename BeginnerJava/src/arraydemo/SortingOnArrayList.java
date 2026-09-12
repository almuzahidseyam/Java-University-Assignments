
package arraydemo;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOnArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(20);
        number.add(-3);
        number.add(45);
        number.add(0);
        number.add(56);
        number.add(99);
        number.add(93);
        
        System.out.println("before sorting :  "+number);
    
        //ascending 
        
        Collections.sort(number);
        System.out.println("After sorting in ascending :  "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        
        System.out.println("After sorting in descending : "+number);
    }
}
