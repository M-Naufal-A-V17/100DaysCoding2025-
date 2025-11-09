import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = input.nextInt();

        int hasil = 1;
        int i = 1;

        while(i <= n){
            hasil = hasil * i;
            i++;
        }

        System.out.println("Hasil perkalian 1 sampai " + n + " adalah: " + hasil);
    }
    
}
