
package beginnerjava;

public class BreakStatement {
    
    public static void main(String[] args) {
        /*
        for(int i =1; i<=100; i++){
            if(i==10)
                break; // ekhane second bracket dito paro abar nao paro....karon eikhane ekta matroi statement
            System.out.println(i);
        }
        */
        for(int i =1; i<=100; i = i+2){
            if(i==10)
                break; // ekhane second bracket dito paro abar nao paro....karon eikhane ekta matroi statement
            System.out.println(i);
        }
    }
}
