
import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        System.out.println("Masukkan jari jari lingkaran: ");
        double r = input.nextDouble();

        double luas = 3.14 * r * r;

        System.out.println("Luas lingkaran = " + luas);
    }
    
}
