public class Day93 {
    public static void main(String[] args) {
        
          double angka = 7.3;

        double atas = Math.ceil(angka);   
        double bawah = Math.floor(angka); 
        long bulat = Math.round(angka);   

        System.out.println("Angka asli: " + angka);
        System.out.println("Ceil: " + atas);
        System.out.println("Floor: " + bawah);
        System.out.println("Round: " + bulat);
    }
    
}
