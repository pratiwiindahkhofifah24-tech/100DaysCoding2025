import java.util.Scanner;

public class Codingday11 {
public static void main(String[] args) {
        Scanner huruf = new Scanner(System.in);

        System.out.print("input byte : ");
        byte b = huruf.nextByte();

        System.out.print("input short : ");
        short sh = huruf.nextShort();

        System.out.print("input int : ");
        int i = huruf.nextInt();

        System.out.print("input long :");
        long l = huruf.nextLong();

        System.out.print("input float :");
        float f = huruf.nextFloat();

        System.out.print("input double :");
        double d = huruf.nextDouble();

        System.out.print("input boolean :");
        boolean bool = huruf.nextBoolean();

        System.out.print("input char : ");
        char c = huruf.next().charAt(0);
        
        huruf.nextLine();
        System.out.print("input string :");
        String s = huruf.nextLine();

        System.out.println("\nHasil input:");
        System.out.println("byte: " + b);
        System.out.println("short: " + sh);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + c);
        System.out.println("String: " + s);
    }
}