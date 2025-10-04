
import java.util.Scanner;

public class Codingday27 {
public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
     System.out.printf("input : ");
     int a = sc.nextInt();       
     System.out.printf("input : ");
     int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Nilai variabel a setelah di tukar "+ a);
        System.out.println("Nilai variabel b setelah di tukar "+ b);

    }

}