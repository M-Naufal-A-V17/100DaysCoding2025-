public class Day32{
    public static void main(String[] args) {
        boolean punyaKartuPelajar = false;
        boolean punyaKTP = true;

        boolean bolehMasuk = punyaKartuPelajar || punyaKTP;

        System.out.println("Apakah boleh masuk? " + bolehMasuk);
    }
}