import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("=== Menu Makanan ===");
        System.out.println("1. Nasi goreng");
        System.out.println("2. Mie goreng");
        System.out.println("3. Sate ayam");
        System.out.println("4. Pilih menu (1-3): ");

        int pilihan = input.nextInt();

        if (pilihan == 1){
            System.out.println("Memilih nasi goreng. Harga: Rp15.000");
        }else if (pilihan == 2){
            System.out.println("Memilih mie goreng. Harga: Rp12.000");
        }else if (pilihan == 3){
            System.out.println("Memilih sate ayam. Harga: Rp20.000");
        }else {
            System.out.println("Pilihan tidak tersedia. ");
        }
    }
    
}
