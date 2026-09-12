
package stringpackages;

public class StringProblem10 {
    
    public static void main(String[] args) {
        
        String str1 = "example.com";
        String str2 = "Example.com";
        
        StringBuffer sb = new StringBuffer(str1);
        
        System.out.println(str1.contentEquals(sb));
        System.out.println(str2.contentEquals(sb));
    }
}
