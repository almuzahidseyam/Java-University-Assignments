
package stringpackages;

public class StringProblem9 {
    
    public static void main(String[] args) {
        
        String str1 = "example.com";
        String str2 = "Example.com";
        CharSequence cs = "example.com";
        
        boolean a = str1.contentEquals(cs);
        boolean b = str2.contentEquals(cs);
        
        System.out.println(a);
        System.out.println(b);
    }
}
