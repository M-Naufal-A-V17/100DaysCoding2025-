import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Pilih operasi: +, -, *, /");
        char operasi = input.next().charAt(0);

        if (operasi == '+') {
            System.out.println("Hasil penjumlahan = " + (angka1 + angka2));
        } else if (operasi == '-') {
            System.out.println("Hasil pengurangan = " + (angka1 - angka2));
        } else if (operasi == '*') {
            System.out.println("Hasil perkalian = " + (angka1 * angka2));
        } else if (operasi == '/') {
            if (angka2 != 0) {
                System.out.println("Hasil pembagian = " + (angka1 / angka2));
            } else {
                System.out.println("Error: Tidak bisa membagi dengan nol.");
            }
        } else {
            System.out.println("Operasi tidak dikenal.");
        }
    }
    
}
