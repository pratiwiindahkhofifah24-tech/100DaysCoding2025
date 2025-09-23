//operasi aritmatika pada perkalian(*)dan pembagian(/).

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner angka = new Scanner(System.in);
	System.out.print("input angka1 : ");
	int angka1 = angka.nextInt();
	System.out.print("input angka2 :");
	int angka2 = angka.nextInt();
	
	System.out.println("input angka1 :" + angka1*angka2);
	System.out.println("input angka2 :" + angka1/angka2);
	}
}