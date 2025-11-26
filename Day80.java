import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] nama = new String[5];

        System.out.println("Masukkan 5 nama:");

      
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Nama ke-" + (i + 1) + ": ");
            nama[i] = input.nextLine();
        }

       
        System.out.println("\nDaftar nama yang dimasukkan:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("- " + nama[i]);
        }
    }
    
}
