public class Day96 {
     
    static int tambah(int a, int b) {
        return a + b;
    }

    
    static int kurang(int a, int b) {
        return a - b;
    }

    
    static int kali(int a, int b) {
        return a * b;
    }

    
    static double bagi(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        int x = 20;
        int y = 5;

        System.out.println("Hasil tambah: " + tambah(x, y));
        System.out.println("Hasil kurang: " + kurang(x, y));
        System.out.println("Hasil kali: " + kali(x, y));
        System.out.println("Hasil bagi: " + bagi(x, y));
    
    }
}
