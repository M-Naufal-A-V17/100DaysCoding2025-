
import java.util.Scanner;

public class part4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble(); input.nextLine();

        System.out.print("Masukkan nim: ");
        final String nim = input.nextLine();

        System.out.printf("Umur saya: %dtahun\n", umur);
        System.out.printf("tinggi badan saya: %.2f cm\n",tinggi);
        System.out.printf("Nim saya: %s\n", nim);

        
        


    }
    
}
