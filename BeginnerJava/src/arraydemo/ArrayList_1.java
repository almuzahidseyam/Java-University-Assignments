
package arraydemo;

import java.util.ArrayList;

public class ArrayList_1 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        System.out.println("size = "+number.size()); // size = 0 hobe karon kono element add kori nai..
        
        //adding elements
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        System.out.println(number);
        System.out.println("size = "+number.size());
    }
}
