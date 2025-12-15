import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
          int n = in.nextInt();

        System.out.println("Bilangan prima dari 1 sampai " + n + ":");

        for (int i = 1; i <= n; i++) {
            int hitung = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    hitung++;
                }
            }

            if (hitung == 2) {
                System.out.print(i + " ");
            }
        }
        

    }
    
}
