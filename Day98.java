public class Day98 {

    
    static String fibonacci(int n) {
        int a = 0;
        int b = 1;
        String hasil = "";

        for (int i = 1; i <= n; i++) {
            hasil += a + " ";
            int c = a + b;
            a = b;
            b = c;
        }

        return hasil;
    }

    public static void main(String[] args) {
        int n = 10;

        String data = fibonacci(n);
        System.out.println("Deret Fibonacci:");
        System.out.println(data);
    
    }
}
