public class Codingday20 {
    public static void main(String[] args) {
      
          int angka = 123;

        // 1. Pakai String.valueOf()
        String a1 = String.valueOf(angka);

        // 2. Pakai Integer.toString()
        String a2 = Integer.toString(angka);

        // 3. Pakai penjumlahan string
        String a3 = angka + "";

        System.out.println("String 1: " + a1);
        System.out.println("String 2: " + a2);
        System.out.println("String 3: " + a3);
    }
}
