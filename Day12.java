import java.util.Scanner;

public class Day12{
    public static void main(String[] args) {
         Scanner input = new 
         Scanner (System.in);

         // input data
         System.out.println("Masukkan nama: ");
         String nama = input.nextLine();
         System.out.println("Masukkan alamat: ");
         String alamat = input.nextLine();
         System.out.println("Masukkan tanggal lahir: ");
         String tanggallahir = input.nextLine();
         System.out.println("Masukkan jenis kelamin: ");
         String jk = input.nextLine();
         System.out.println("Masukkan tinggi badan (cm): ");
         double tinggi = input.nextDouble();
         input.nextLine();
         System.out.println("Masukkan hobi");
         String hobi = input.nextLine();

         // output biodata
         System.out.println("\n===== BIODATA =====");
         System.out.println("Nama         :" + nama);
         System.out.println("Alamat       : " + alamat);
         System.out.println("Tanggal lahir: " + tanggallahir);
         System.out.println("Jenis kelamin: " + jk);
         System.out.println("Tinggi badan : " + tinggi + "cm");
         System.out.println("Hobi         :" + hobi);

         input.close();






    }

}