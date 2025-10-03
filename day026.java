public class Codingday26 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("Nilai awal x: " + x);

        // Penugasan penjumlahan
        x += y;
        System.out.println("hasil penjumlahan (+) : " + x);

        // Penugasan pengurangan
        x -= y;
        System.out.println("hasil pengurangan (-) : " + x);

        // Penugasan perkalian
        x *= y;
        System.out.println("hasil perkalian (*) : " + x);

        // Penugasan pembagian
        x /= y;
        System.out.println("hasil pembagian (/) : " + x);

        // Penugasan modulus
        x %= y;
        System.out.println("hasil modulus (%) : " + x);
    }
}