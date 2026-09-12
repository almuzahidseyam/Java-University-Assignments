
package string_package;

public class StringDemo2 {
    
    public static void main(String[] args) {
        
        String firstname = "AL-Muzahid ";
        String lastname = "Farhan";
        
        String fullname = firstname + lastname;//concat()--->> oncatination
        
        System.out.println("Full name = "+fullname);
        
        
        String s1 = "BD ";
        
        String s2 = "Levinho";
        
       
        System.out.println("Full name with a integer = "+s1+s2+77);
        
        
        //by concat() method
        
        String fullname1 = firstname.concat(lastname);
        System.out.println(fullname1);
        
        String upperName = fullname.toUpperCase();
        System.out.println("upperName = "+upperName);
        
        String lowerName = fullname.toLowerCase();
        System.out.println("lowerName = "+lowerName);
        
        boolean b = firstname.startsWith("A");
        System.out.println("b = "+b);
        
        boolean c = firstname.startsWith("a");
        System.out.println("b = "+c);
        
        boolean d = firstname.startsWith("AL-M");
        System.out.println("b = "+d);
        
        boolean l = lastname.endsWith("d");
        System.out.println("last = "+l);
        
        boolean last = lastname.endsWith("n");
        System.out.println("last = "+last);
        
        
        // string er array kivabe toiri korte hoy???
        
        String[] names = {"Muzahid","Sobuj","Niloy"};
        
        for(String x : names){ //for each loop
        
            System.out.println(x);
        }
        
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println(names[i]);
        }
     }
}
