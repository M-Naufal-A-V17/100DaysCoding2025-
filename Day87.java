import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        int[] data = {12, 7, 22, 5, 30, 18};

        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;
        int indexKetemu = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                indexKetemu = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka ditemukan pada index ke-" + indexKetemu);
        } else {
            System.out.println("Angka tidak ditemukan dalam array.");
        }

        input.close();
    }
}