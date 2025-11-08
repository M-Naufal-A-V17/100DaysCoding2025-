import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka batas akhir: ");
        int batas = input.nextInt();

        int total = 0;
        int angka = 1;

        while (angka <= batas) {
            total = total + angka;
            angka = angka + 1;
        }

        System.out.println("Hasil penjumlahan dari 1 sampai " + batas + " adalah: " + total);
    }
    
}
