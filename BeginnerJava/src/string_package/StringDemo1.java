
package string_package;

public class StringDemo1 {
    
    public static void main(String[] args) {
        
        String s1 = "AL muzahid";
        String s2 = new String("AL- muzahid");
        
        char[] s3 = {'m','u','z','a','h','i','d'};
        
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        
        int len = s1.length();
        System.out.println("Length of s1 = "+len);
        
        if(s1 == s2){ //not equal dekhabe..karon reference ek na .. s1 o s2 alada alada reference
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        
        // check equality
        if(s1.equals(s2)){
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not equals");
        }
         // check contains
        if(s1.contains(s2)){
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not equals");
        }
        
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not equals");
        }
        
        boolean con = s1.contains("ami");
        System.out.println(con);
        
        con = s1.contains("muzahid");
        System.out.println(con);
        
        
        boolean b = s1.isEmpty();
        System.out.println("b = "+b);
        
    }
}
