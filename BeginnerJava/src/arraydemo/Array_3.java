
package arraydemo;

public class Array_3 {
    
    public static void main(String[] args) {
       int[ ] number = new int[5];// ekhane array size icchamoto deya jabe ... mon caile 10 dilam , but use korlam 6 ta , tate kono somossa nai...
       
       number[0] = 10;// 0 index e 10 rekhechi..
       number[1] = 20;
       number[2] = 30;
       number[3] = 40;
       number[4] = 50;
       //array_Size;
       
       int len = number.length;
       System.out.println("Array size = "+len);
       //System.out.println(number[0]); 
       
       int sum = number[0]+ number[1] + number[2] + number[3] + number[4];
        System.out.println("sum = "+sum);
    }
}
