public class Day34 {
    public static void main(String[] args) {
        int umur = 18;
        boolean punyaSIM = true;
        boolean hujan = false;

        boolean bolehKeluar = (umur >= 17 && punyaSIM) || !hujan;

        System.out.println("Apakah boleh keluar rumah? " + bolehKeluar);
    }
    
}
