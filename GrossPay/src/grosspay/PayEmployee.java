
package grosspay;

import java.util.Scanner;

public class PayEmployee {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double hours = 40, salary = 10000;
        System.out.print("Enter employee name1 = ");
        String name1 = input.nextLine();
        double workhour1 = input.nextDouble();
        
        System.out.print("Enter employee name2 = ");
        String name2 = input.nextLine();
        double workhour2 = input.nextDouble();
        
        System.out.print("Enter employee name3 = ");
        String name3 = input.nextLine(); 
        double workhour3 = input.nextDouble();
        
        if(workhour1>=40){
            System.out.println("Employee1 name = "+name1);
            System.out.println("Salary = "+(workhour1/40)*salary);
        }
        if(workhour2>=40){
            System.out.println("Employee2 name = "+name2);
            System.out.println("Salary = "+(workhour2/40)*salary);
        }
        if(workhour3>=40){
            System.out.println("Employee3 name = "+name3);
            System.out.println("Salary = "+(workhour3/40)*salary);
        }
        
    }
}
