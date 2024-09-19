package Pertemuan3;

import java.util.Scanner;

public class P3_Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam kerja karyawan: ");
        int jumlahJamKerja = input.nextInt();
        System.out.print("Masukkan upah per jam: ");
        int upahPerJam = input.nextInt();

        double gajiKaryawan ;
        double bonusGaji ;
        double gajiSebelumPajak ;
        double gajiSetelahPajak ;
        int gajiBersih ;

        gajiKaryawan = jumlahJamKerja * upahPerJam;
        bonusGaji = gajiKaryawan * 1/10;
        gajiSebelumPajak = gajiKaryawan + bonusGaji;
        gajiSetelahPajak = gajiSebelumPajak - (bonusGaji * 5/100);
        gajiBersih = (int) (gajiKaryawan - gajiSetelahPajak);

        System.out.println("Gaji Karyawan: " + gajiKaryawan);
        System.out.println("Bonus Gaji: " + bonusGaji);
        System.out.println("Gaji Sebelum Pajak: " + gajiSebelumPajak);
        System.out.println("Gaji Setelah Pajak: " + gajiSetelahPajak);
        System.out.println("Gaji bersih sebesar: " + gajiBersih);

        input.close();
    }
}
