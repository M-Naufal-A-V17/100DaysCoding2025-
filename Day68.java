import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bintang: ");
        int n = input.nextInt();

        for(int i = 0; i <= n; i++){
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
                
            }
            System.out.print("\n");
        }
    }
    
}
