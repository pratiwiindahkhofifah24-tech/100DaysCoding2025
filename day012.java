//BIODATA SEDERHANA

import java.util.Scanner;

public class Codingday12 {
    public static void main(String[] args) {
        Scanner Biodata = new Scanner(System.in);
        System.out.println("BiodataSederhana");
        
        System.out.println("nama_saya");
        String nama_saya = Biodata.nextLine();
        Biodata.nextLine();

        System.out.println("saya_umur");
        byte saya_umur = Biodata.nextByte();

        System.out.println("nim_saya");
        int nim_saya = Biodata.nextInt();
        
        System.out.println("umur_adikSaya");
        short umur_adikSaya = Biodata.nextShort();
        
        System.out.println("tanggal_lahirSaya");
        long tanggal_lahirSaya = Biodata.nextLong();
        
        System.out.println("saya_pintar");
        boolean saya_pintar = Biodata.nextBoolean();
        
        System.out.println("jenis_kelamin");
        char jenis_kelamin = Biodata.next().charAt(0);
        Biodata.nextLine();
        
        System.out.println("berat_badanSaya");
        double berat_badanSaya = Biodata.nextDouble();
        
        System.out.println("\nBiodataSederhana");
        System.out.println("nama_saya:" + nama_saya);
        System.out.println("saya_umur:" + saya_umur);
        System.out.println("nim_saya:" + nim_saya);
        System.out.println("umur_adikSaya:" + umur_adikSaya);
        System.out.println("tanggal_lahirSaya:" + tanggal_lahirSaya);
        System.out.println("saya_pintar: " + saya_pintar);
        System.out.println("jenis_kelamin: " +jenis_kelamin);
        System.out.println("berat_badanSaya:" + berat_badanSaya);

        Biodata.close();
    }
}