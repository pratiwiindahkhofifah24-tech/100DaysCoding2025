import java.util.Scanner;

public class Codingday24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = input.nextDouble();
        double luas = Math.PI * radius * radius;
        System.out.printf("Luas lingkaran adalah: %.2f\n", luas);
    }
}
