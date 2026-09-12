
package beginnerjava;

import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double cels;
        
        System.out.println("Celsius = ");
        cels = input.nextDouble();
        
        double farn = 1.8*cels +32;
        
        System.out.println("Fahrenheit : "+farn);
    }
}
