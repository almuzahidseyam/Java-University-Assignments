
package stringpackages;

public class stringProblem3 {
    
    public static void main(String[] args) {
        
        String str = "AL Muzahid Seyam";
        System.out.println("Original String is : "+str);
        
        //codepoint before index1
        int val1 = str.codePointBefore(1);
        
        //codepoint before index9
        int val2 = str.codePointBefore(9);
        
        System.out.println(val1);
        System.out.println(val2);
    }
}
