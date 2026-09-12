
package Account;

import java.util.Scanner;

public class AccountTest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        welcome1.Account myAccount = new welcome1.Account();
        
        System.out.printf("Initial name is : %s%n%n",myAccount, getName());
        
        System.out.println("Please enter the name :  ");    
        
        String theName = input.nextLine();
        
        myAccount.setName(theName);
        
        System.out.println();
        System.out.printf("Name in object myAccount is :  %n%s%n",myAccount,getName());
    }
}
