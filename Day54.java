public class Day54 {
    public static void main(String[] args) {
        
        int angka = 1;

        while (angka <= 5) {

            if (angka == 3) {
                angka++; 
                continue;   // melewati angka 3
            }

            System.out.println("Angka: " + angka);
            angka++;
        }
    }
    
}
