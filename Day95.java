public class Day95 {

    static String ulangTeks(String teks, int jumlah) {
        String hasil = "";

        for (int i = 1; i <= jumlah; i++) {
            hasil += teks + " ";
        }

        return hasil; 
    }

    public static void main(String[] args) {
        String data = ulangTeks("Halo", 3);
        System.out.println(data);
    
    }
}
