//biodata sederhana
import java.util.Scanner;

public class Codingday12 {
    public static void main(String[] args) {
        Scanner Biodata = new Scanner(System.in);
        System.out.println("BiodataSederhana");
        
        System.out.println("nama_saya");
        String nama_saya = Biodata.nextLine();
        System.out.println("saya_umur");
        int saya_umur = Biodata.nextInt();
        System.out.println("nim_saya");
        long nim_saya = Biodata.nextLong();
        System.out.println("umur_adikSaya");
        byte umur_adikSaya = Biodata.nextByte();
        System.out.println("tanggal_lahirSaya");
        short tanggal_lahirSaya = Biodata.nextShort();
        System.out.println("saya_pintar");
        boolean saya_pintar = Biodata.nextBoolean();
        System.out.println("saya_tinggi");
        char saya_tinggi = Biodata.next().charAt(0);
        System.out.println("berat_badanSaya");
        double berat_badanSaya = Biodata.nextDouble();
        
        System.out.println("\nBiodataSederhana");
        System.out.println("nama_saya :" + nama_saya);
        System.out.println("saya_umur :" + saya_umur);
        System.out.println("nim_saya :" + nim_saya);
        System.out.println("umur_adikSaya :" + umur_adikSaya);
        System.out.println("tanggal_lahirSaya :" + tanggal_lahirSaya);
        System.out.println("saya_pintar" + saya_pintar);
        System.out.println("saya_tinggi" + saya_tinggi + "tinggi");
       System.out.println("berat_badanSaya :" + berat_badanSaya);
    }}