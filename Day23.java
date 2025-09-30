
import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan panjang: ");
        int panjang = input.nextInt();

        System.out.println("Masukkan lebar: ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;

        System.out.println("Luas persegi panjang = " + luas);
    }
    
}
