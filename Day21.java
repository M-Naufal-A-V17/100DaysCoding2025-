public class Day21 {
    public static void main(String[] args) {
   
 
        int a = 5;
        int b = 10;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Proses menukar nilai
        int sementara = a;
        a = b;
        b = sementara;

        System.out.println("Setelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    
}
