
package string_package;

public class StringDemo3badgesilo5 {
    
    public static void main(String[] args) {
        
        String s1 = "This is my country";
        System.out.println(s1);
      
        String s2 = s1.replace('i', 'j');
        System.out.println(s2);
        
        //split() method
        
        String[] s3 = s1.split(" ");
        
        for(String x : s3){
            System.out.println(x);
        }
        
        String s4 = "This_is_my_country";
        
        String[] s5 = s4.split("_");
        for(String x : s5){
            System.out.println(x);
        }
        
        
        String s6 = "01781-089548";
        
        String[] s7 = s6.split("-");
        for(String x : s7){
            System.out.println(x);
        }
    }
}
