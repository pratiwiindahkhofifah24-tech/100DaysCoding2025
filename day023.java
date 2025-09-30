//program menghitung luas persegi panjang
import java.util.Scanner;

public class Codingday23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}