import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan teks pertama : ");
        String s1 = sc.nextLine();

        System.out.print("Masukkan teks kedua   : ");
        String s2 = sc.nextLine();

        System.out.println("\n===== METHOD DASAR =====");
        System.out.println("Panjang teks 1                 : " + s1.length());
        System.out.println("Teks 1 huruf besar semua       : " + s1.toUpperCase());
        System.out.println("Teks 1 huruf kecil semua       : " + s1.toLowerCase());

        System.out.println("\n===== METHOD PENGECEKAN =====");
        System.out.println("s1 sama persis dengan s2?      : " + s1.equals(s2));
        System.out.println("s1 sama tanpa lihat huruf?     : " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 mengandung kata 'java'?     : " + s1.contains("java"));
        System.out.println("Teks 1 kosong?                 : " + s1.isEmpty());
        System.out.println("Teks 2 kosong?                 : " + s2.isEmpty());

        System.out.println("\n===== METHOD MANIPULASI =====");
        if (s1.length() >= 3) {
            System.out.println("3 karakter awal dari s1        : " + s1.substring(0,3));
        } else {
            System.out.println("s1 terlalu pendek untuk substring(0,3)");
        }

        System.out.println("Mengganti 'a' dengan 'o'       : " + s1.replace("a","o"));
        System.out.println("Menghapus spasi di pinggir     : '" + s1.trim() + "'");
    }
    
}

