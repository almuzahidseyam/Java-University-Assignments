
package grosspay;

import java.util.Scanner;

public class PayEmployee1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double hours = 40, salary = 10000;
        System.out.print("Enter employee name1 = ");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine(); 
        
        
        double workhour1 = input.nextDouble();
        
        double workhour2 = input.nextDouble();

        double workhour3 = input.nextDouble();
        
        System.out.println("Employee1 name = "+name1);
        if(workhour1>=40){
            System.out.println("Salary = "+(workhour1/40)*salary);
        }
        
        System.out.println("Employee2 name = "+name2);
        if(workhour2>=40){
            System.out.println("Salary = "+(workhour2/40)*salary);
        }
        
        System.out.println("Employee3 name = "+name3);
        if(workhour3>=40){
            System.out.println("Salary = "+(workhour3/40)*salary);
        }
        
    }
}
