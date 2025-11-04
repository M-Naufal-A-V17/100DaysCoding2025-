import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        // Mencetak dari 1 ke N
        System.out.println("Dari 1 sampai N:");
        for(int i = 1; i <= N; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        // Mencetak dari N ke 1
        System.out.println("Dari N sampai 1:");
        for(int i = N; i >= 1; i--){
            System.out.print(i + " ");
        }
    }
    
}
