import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        
          Scanner in = new Scanner(System.in);

       
        System.out.println("=== Buat Akun Baru ===");
        System.out.print("Buat username : ");
        String userBaru = in.nextLine();

        System.out.print("Buat password : ");
        String passBaru = in.nextLine();

        System.out.println("\nAkun berhasil dibuat!\n");

      
        System.out.println("=== Login Akun ===");
        System.out.print("Masukkan username : ");
        String userLogin = in.nextLine();

        while (!userLogin.equals(userBaru)) {
            System.out.println("Username tidak ditemukan.");
            System.out.print("Masukkan username : ");
            userLogin = in.nextLine();
        }

        String cobaPass;
        do {
            System.out.print("Masukkan password : ");
            cobaPass = in.nextLine();

            if (!cobaPass.equals(passBaru)) {
                System.out.println("Password salah, coba lagi!\n");
            }

        } while (!cobaPass.equals(passBaru));

        System.out.println("\nLogin berhasil! Selamat datang, " + userBaru + "!");
    }
    
}
