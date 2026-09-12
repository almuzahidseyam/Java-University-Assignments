// ****   https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html


package beginnerjava;

public class MathClass {
    public static void main(String[] args) {
        int x = 2;
        //int y = -10;
        int y = 4;
      
        //System.out.println(Math.max(x,y));
        //System.out.println(Math.min(x,y));
        
        int max = Math.max(x, y);
        System.out.println("Maximum = "+max);
        
        int min = Math.min(x, y);
        System.out.println("Minimum = "+min);
        
        int absolute = Math.abs(y);
        System.out.println("Absolute = "+absolute);
        
        double power = Math.pow(x, y);
        System.out.println("X to the powewr Y = "+power);
        
        int round = Math.round(8.8f);
        System.out.println("Round of 8.8 ="+round); 
        int round1 = Math.round(8.4f);
        System.out.println("Round of 8.4 ="+round1); 
        
        //System.out.println(Math.PI);
        double pi = Math.PI;
        System.out.println("pi = "+pi);
    }
}
