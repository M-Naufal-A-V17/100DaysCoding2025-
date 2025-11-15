import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {

          Scanner input = new Scanner (System.in);
        
         System.out.println("");
        int angka = input.nextInt();
        
        int hs = 0;
        
        for (int i = 0; i < angka; i++) {
            int y = input.nextInt();
            if(y > 0){
                hs += y;
            }
            
            
            
        }
        System.out.println(hs);  
        


    }
    
}
