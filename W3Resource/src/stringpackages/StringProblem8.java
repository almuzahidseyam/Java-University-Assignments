
package stringpackages;

public class StringProblem8 {
    
    public static void main(String[] args) {
        
        String str1 = "My name is Levinho";
        String str2 = "is";
        
        System.out.println("Main string is = "+str1);
        
        boolean result = str1.contains(str2);
        System.out.println(result);
    }
}
