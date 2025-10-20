import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Hitung Luas Persegi Panjang ===");
        System.out.print("Masukkan panjang (cm): ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar (cm): ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;

        System.out.println("-----------------------------------------");
        System.out.println("Luas persegi panjang adalah: " + luas + " cm²");
        System.out.println("=========================================");
    }
}
