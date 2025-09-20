
import java.util.Scanner;
public class data_barang {
    public static void main(String[] args) {
        Scanner data_barang = new Scanner(System.in);
        
        System.out.print("input nama barang: ");
        String nama = data_barang.nextLine();
        
        System.out.print("input harga barang: ");
        double harga = data_barang.nextDouble();
        
        System.out.print("input diskon (dalam persen): ");
        float diskon = data_barang.nextFloat();
        
        
        System.out.println("\nnama barang: " + nama);
        System.out.printf("harga barang: %.2f%n ", harga);
        System.out.printf("harga diskon: %.2f%n ", diskon);
       
    }
}