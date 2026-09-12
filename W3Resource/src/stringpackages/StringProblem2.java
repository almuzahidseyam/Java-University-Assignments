
package stringpackages;

public class StringProblem2 {
    
    public static void main(String[] args) {
        
        String str = "AL Muzahid Seyam";
        System.out.println("Original String is : "+str);
        
        //codepoint at index1
        int val1 = str.codePointAt(1);
        
        //codepoint at index9
        int val2 = str.codePointAt(9);
        
        System.out.println(val1);
        System.out.println(val2);
    }
}
