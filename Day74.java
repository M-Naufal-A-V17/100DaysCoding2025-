import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
        int pilih = 0;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Cetak Nama");
            System.out.println("2. Hitung Jumlah 10 + 20");
            System.out.println("3. Keluar Program");
            System.out.print("Masukkan pilihan: ");
            pilih = in.nextInt();

            if (pilih == 1) {
                System.out.println("Nama Anda: " + "User");
            }
            else if (pilih == 2) {
                int hasil = 10 + 20;
                System.out.println("Hasil penjumlahan: " + hasil);
            }
            else if (pilih == 3) {
                System.out.println("Program dihentikan...");
            }
            else {
                System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilih != 3);
    }
    
}
