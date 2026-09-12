// output hobe 0
//             1    2
//             3    4   5
//             6    7   8   9


package arraydemo;

public class Triangle_Row_Col {
    
    public static void main(String[] args) {
        
        int[][] number = new int[4][];
        int k = 0;
        
        number[0] = new int[1];  // ek number row te column thakbe 3 ta
        number[1] = new int[2]; // dui number row te column thakbe 4 ta
        number[2] = new int[3]; // tin number row te column thakbe 5 ta
        number[3] = new int[4];
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < i+1; j++) { // prothom row er jonno ekta column , ditiyo row er jonno duita column, 3rd row er jonno 3 ta column, 4th row er jonno 4 ta column
                
                number [i][j] = k;
                k++;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
            //System.out.println("");
        }
    }
}
