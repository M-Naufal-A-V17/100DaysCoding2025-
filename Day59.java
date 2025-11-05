import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.println("Bilangan dari 1 sampai N:");

        for(int i = 1; i <= N; i++){
            if(i % 2 == 0){
                System.out.println(i + " = Genap");
            } else {
                System.out.println(i + " = Ganjil");
            }
        }
        


    }
    
}
