
package arraydemo;

import java.util.ArrayList;

public class ClearMethod {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        //adding elements 
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4,70);
        
        System.out.println("ArrayList contains : "+number);
 
        System.out.println("size = "+number.size());
        
        
        //removing elements
        
        number.remove(3);
        System.out.println("After removing : "+number);
        System.out.println("Size = "+number.size());
        
        // removing all elements
        
        number.removeAll(number);
        System.out.println("After removing all : "+number);
        
        System.out.println("Size = "+number.size());
        
        // clear method use korbo
        // again adding elements 
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4,70);
        
        System.out.println("ArrayList contains : "+number);
 
        System.out.println("size = "+number.size());
        
        // now using clear 
        number.clear();
        System.out.println("After clear : "+number);
        System.out.println("size = "+number.size());
        
        // check empty or not ???
        
        boolean check = number.isEmpty();
        
        System.out.println("Arraylist empty : "+check);
        
        // check contains any element ????
        
        boolean contain = number.contains(30);
        
        System.out.println("30 is in the list : "+contain);
        
         // again adding elements 
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4,70);
        
        System.out.println("ArrayList contains : "+number);
 
        System.out.println("size = "+number.size());
        
        // finding index
        
        int position = number.indexOf(40);
        
        System.out.println("The index of 40 is = "+position);
        
        // set method  --->>> replacing any elements
        
        number.set(4,60);
        System.out.println("After setting : "+number);
        
        // get Method
        
        int x = number.get(0);
        
        System.out.println("index 0 = "+x);
    }
}
