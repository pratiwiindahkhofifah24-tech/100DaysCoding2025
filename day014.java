//mengubah string jadi tipe data primitif
public class Codingday14 {
    public static void main(String[] args) {
        
        String nt = "123";
        int angka = Integer.parseInt(nt );
        String ble = "3.14";
        double pecahan = Double.parseDouble(ble);

        System.out.println("angka :" + angka);
        System.out.println("pecahan :" + pecahan);
    }
}