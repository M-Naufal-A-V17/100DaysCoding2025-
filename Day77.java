import java.util.Scanner;

public class  Day77{
    public static void main(String[] args) {
        
          Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        // Mengambil bagian kalimat
        String potongAwal = kalimat.substring(0, 3); // tiga huruf pertama
        String potongAkhir = kalimat.substring(kalimat.length() - 3); // tiga huruf terakhir

        // Mengambil satu karakter tertentu
        char hurufTengah = kalimat.charAt(kalimat.length() / 2);

        // Mengganti huruf tertentu
        String diganti = kalimat.replace("a", "*");

        System.out.println("\n--- HASIL ---");
        System.out.println("3 huruf pertama      : " + potongAwal);
        System.out.println("3 huruf terakhir     : " + potongAkhir);
        System.out.println("Huruf tengah         : " + hurufTengah);
        System.out.println("Kalimat setelah edit : " + diganti);
    }

}