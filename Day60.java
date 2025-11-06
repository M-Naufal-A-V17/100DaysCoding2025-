import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka batas (N): ");
        int batas = input.nextInt();

        System.out.println("\nAngka ganjil dari atas ke bawah:");
        for(int angka = batas; angka >= 1; angka--){
            if(angka % 2 != 0){
                System.out.println(angka);
            }
        }

        System.out.println("\nAngka genap dari atas ke bawah:");
        for(int angka = batas; angka >= 1; angka--){
            if(angka % 2 == 0){
                System.out.println(angka);
            }
        }




    }
    
}
