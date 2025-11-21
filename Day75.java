import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String teks = input.nextLine();

        // Method length()
        int panjang = teks.length();

        // Method toUpperCase()
        String hurufBesar = teks.toUpperCase();

        // Method toLowerCase()
        String hurufKecil = teks.toLowerCase();

        System.out.println("\n--- HASIL ---");
        System.out.println("Panjang teks     : " + panjang);
        System.out.println("Huruf besar      : " + hurufBesar);
        System.out.println("Huruf kecil      : " + hurufKecil);
    }
    
}
