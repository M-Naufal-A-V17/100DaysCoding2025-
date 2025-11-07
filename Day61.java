import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas atas (N): ");
        int batas = input.nextInt();

        System.out.print("Masukkan angka kelipatan (M): ");
        int kelipatan = input.nextInt();

        System.out.println("\nBilangan kelipatan dari M:");

        for(int angka = 1; angka <= batas; angka++){
            if(angka % kelipatan == 0){
                System.out.println(angka);
            }
        }
    }
    
}
