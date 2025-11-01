import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Iyaji");
        } else {
            System.out.println("Tidakji");
        }
    }
    
}
