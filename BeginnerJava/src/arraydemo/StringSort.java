
package arraydemo;

import java.util.Arrays;

public class StringSort {
    
    public static void main(String[] args) {
        
        String[] names = {"Razu","Rony","Rifat","Farhan","Muzahid"};
        
        Arrays.sort(names);
        
        for (int i = 0; i <5; i++) {
            System.out.print(names[i]+" ");
        }
        
        System.out.println("");
        
        for (int i = 4; i >= 0; i--) {
            System.out.print(names[i]+" ");
        }
        System.out.println("");
    }
}
