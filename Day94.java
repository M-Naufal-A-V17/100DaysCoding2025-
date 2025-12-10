public class Day94 {
     static String ambilAngka() {
        String hasil = "";
        for (int i = 1; i <= 5; i++) {
            hasil += i + " ";
        }
        return hasil;  
    }

    public static void main(String[] args) {
        String data = ambilAngka();
        System.out.println(data);
    
    }
}
