
package oop;

public class Test {
    
    public static void main(String[] args) {
        
        /*
        Teacher teacher1; // object declare
        teacher1 = new Teacher(); // object create
        */
        Teacher teacher1 = new Teacher("AL Muzahid","male",37286);
        teacher1.displayInformation();
        
        Teacher teacher2 = new Teacher("farhan", "male", 3545);
        teacher2.displayInformation();
    }
}
