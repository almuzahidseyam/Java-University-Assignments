
package string_package;

public class StringDemo4 {
    
    public static void main(String[] args) {
        
        String country = "    Bangladesh is my country    ";
        System.out.println(country);
        
        String s3 = country.trim(); // prothom o sesher diker space gula bad dia dibe 
        System.out.println(s3);
        
        char ch = country.charAt(0);
        System.out.println("ch "+ch);
        
        int value = country.codePointAt(0);
        System.out.println("value = "+value);
        
        int pos = country.indexOf('n');
        System.out.println("first position of n = "+pos);
        
        pos = country.lastIndexOf('n');
        System.out.println("last position of n = "+pos);
    }
}
