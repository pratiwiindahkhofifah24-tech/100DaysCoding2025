//mengubah string jadi tipe data primitif
public class Codingday14 {
    public static void main(String[] args) {
        int angka = Integer.parseInt("123");
        double pecahan = Double.parseDouble("3.14");
        char huruf = "A".charAt(0);

        System.out.println("angka :" + angka);
        System.out.println("pecahan :" + pecahan);
        System.out.println("huruf :" + huruf);
    }}