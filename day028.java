import java.util.Scanner;

public class Codingday28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input angka1 : ");
        int a = sc.nextInt();
        System.out.print("input angka2 : ");
        int b = sc.nextInt();
        
        System.out.println("(a == b)" + (a == b));
        System.out.println("(a != b)" + (a != b));
        
    }
}    