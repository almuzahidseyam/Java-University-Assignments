
package grosspay;



public class Table {
    
    public static void main(String[] args) {
        
     
        
        int result = 0;
        int num = 1 ;
        
        System.out.println("N"+"    "+"10*N"+"    "+"100*N"+"    "+"1000*N");
        for (int i = 1; i <= 5; i++) {
            
            result = num  *i;
            System.out.println(result + "    "+result*10 + "    "+result *100 +"    "+result*1000);
        }
    }
}
