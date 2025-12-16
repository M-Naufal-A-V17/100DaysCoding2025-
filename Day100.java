import java.util.Scanner;

public class Day100 {
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

        String teks = input.nextLine();

        boolean ketemuI = false;
        boolean ketemuS = false;
        boolean cantik = false;

        for (int i = 0; i < teks.length(); i++) {
            char huruf = teks.charAt(i);

            if (huruf == 'I') {
                ketemuI = true;
            } else if (huruf == 'S' && ketemuI) {
                ketemuS = true;
            } else if (huruf == 'C' && ketemuI && ketemuS) {
                cantik = true;
                break;
            }
        }

        if (cantik) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
    
}
