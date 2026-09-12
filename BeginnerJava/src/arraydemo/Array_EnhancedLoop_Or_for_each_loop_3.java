
package arraydemo;

public class Array_EnhancedLoop_Or_for_each_loop_3 {
    
    public static void main(String[] args) {
        
        int[] num = {10,20,30,40,50,60,70,80,90,100};
        
        int sum = 0;
        
        for(int x : num){
            System.out.println(x);
            sum = sum + x;
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
