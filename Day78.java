import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau kalimat: ");
        String teks = input.nextLine();

        // Menghitung jumlah karakter
        int jumlahKarakter = teks.length();

        // Mengubah menjadi huruf besar
        String kapital = teks.toUpperCase();

        // Mengubah menjadi huruf kecil
        String kecil = teks.toLowerCase();

        // Menghapus spasi di depan dan belakang
        String rapih = teks.trim();

        System.out.println("\n=== HASIL ===");
        System.out.println("Panjang teks          : " + jumlahKarakter);
        System.out.println("Huruf besar           : " + kapital);
        System.out.println("Huruf kecil           : " + kecil);
        System.out.println("Setelah di-trim       : \"" + rapih + "\"");
    }
    
}
