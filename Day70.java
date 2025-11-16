import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi (N): ");
        int N = input.nextInt();

        System.out.print("Masukkan lebar (M): ");
        int M = input.nextInt();

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= M; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
