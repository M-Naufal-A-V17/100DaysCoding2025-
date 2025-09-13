 public class Day6{
    public static void main(String[] args){
        // Tipe data float
        float panjang = 2.6f;
        float lebar = 1.76f;

        float volume = panjang * lebar;
        System.out.println("panjang: " + panjang + "m");
        System.out.println("lebar: " + lebar + "m");
        System.out.println("Volume : " + volume + "m3");
        
        // Tipe data double
        double hargabarang = 199.99;
        double diskon = 0.1;
        double hargadiskon = hargabarang - (hargabarang * diskon);
        System.out.println("harga barang: Rp" + hargabarang);
        System.out.println("harga setelah diskon: Rp" + hargadiskon);
    }
 }

