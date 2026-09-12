
package arraydemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        System.out.println("size = "+number.size()); // size = 0 hobe karon kono element add kori nai..
        
        //adding elements
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        /*
        Iterator itr = number.iterator();
        while(itr.hasNext()){
            
            System.out.print(" "+itr.next());
        }
        */
        System.out.println("ArrayList contains : " +number);
        System.out.println();
        System.out.println("size = "+number.size());
        
        //Removing elements
        //Removing elements
        
        number.remove(2); //arraylistnum.remove(2noindex);
        System.out.println("Aftar Removing ArrayList contains : " +number);
        System.out.println("size = "+number.size());
        
        
        // all number remove ************
        
        number.removeAll(number);
        System.out.println("Aftar removing All : "+number);
        System.out.println("Size : "+number.size());
    }
}
