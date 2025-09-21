public class Day14 {
    public static void main(String[] args) {
         // String
        String strUmur = "18";
        String strTinggi = "170.5";
        String strAktif = "true";

        // Konversi ke primitif
        int umur = Integer.parseInt(strUmur);
        double tinggi = Double.parseDouble(strTinggi);
        boolean aktif = Boolean.parseBoolean(strAktif);

        // Output
        System.out.println("Umur (int)     : " + umur);
        System.out.println("Tinggi (double): " + tinggi);
        System.out.println("Aktif (boolean): " + aktif);
   }
}
    
    

