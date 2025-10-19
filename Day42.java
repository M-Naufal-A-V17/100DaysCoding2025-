import java.util.Scanner;

public class Day42{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = input.nextDouble();

        double totalGaji = gajiPokok + tunjangan;
        double potongan;

        if (totalGaji > 5000000) {
            potongan = totalGaji * 0.1; 
        } else if (totalGaji > 3000000) {
            potongan = totalGaji * 0.05; 
        } else {
            potongan = 0; 
        }

        double gajiBersih = totalGaji - potongan;

        System.out.println("Total Gaji: " + totalGaji);
        System.out.println("Potongan: " + potongan);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}