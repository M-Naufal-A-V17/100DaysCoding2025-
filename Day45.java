import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menu Minuman ===");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Jus");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Kopi. Harga: Rp10.000");
                break;
            case 2:
                System.out.println("Anda memilih Teh. Harga: Rp8.000");
                break;
            case 3:
                System.out.println("Anda memilih Jus. Harga: Rp12.000");
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
        }
    }
    
}
