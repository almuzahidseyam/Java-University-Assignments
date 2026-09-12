
package beginnerjava;

public class IncrementDecrement {
    
    public static void main(String[] args) {
        
        int x = 25;
        int y;
        
       /*
        y = x++;//post increment
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+y);
        */
       /*
        y = ++x;//pre increment x = 26
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+y);

        */
        y = --x;//pre decrement x = 24
        System.out.println("y = "+y);
        
        y = x--; // x =24 
        System.out.println("y = "+y);
        
        y = ++x; // x = 23 >>> 24
        System.out.println("y = "+y);
        
        y = x++; // x = 24
        System.out.println("y = "+y);
    }
    
}
