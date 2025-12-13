public class Day97 {
    
    // Method non-void dengan parameter
    static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        int sisiPersegi = 6;

        int hasil = hitungLuasPersegi(sisiPersegi);
        System.out.println("Luas persegi: " + hasil);
    
    }
}
