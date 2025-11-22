import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        
          Scanner in = new Scanner(System.in);

        System.out.print("Masukkan kata pertama: ");
        String kata1 = in.nextLine();

        System.out.print("Masukkan kata kedua : ");
        String kata2 = in.nextLine();

        // Mengecek sama persis
        boolean samaPersis = kata1.equals(kata2);

        // Mengecek sama tanpa melihat besar kecil huruf
        boolean samaTanpaHuruf = kata1.equalsIgnoreCase(kata2);

        // Mengecek apakah kata pertama mengandung kata kedua
        boolean terkandung = kata1.contains(kata2);

        System.out.println("\n--- HASIL PENGECEKAN ---");
        System.out.println("Sama persis              : " + samaPersis);
        System.out.println("Sama (abaikan kapital)   : " + samaTanpaHuruf);
        System.out.println("Kata kedua ada di kata1? : " + terkandung);
    }
    
}
