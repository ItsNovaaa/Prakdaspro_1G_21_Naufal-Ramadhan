package Pertemuan4.kuis;

import java.util.Scanner;

public class Kuis1_NaufalRamadhan_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tanggalBerangkat21,bulanBerangkat21,tahunBerangkat21;
        int tanggalPulang21,bulanPulang21,tahunPulang21;
        int jumlahHariBerangkat21,jumlahHariPulang21,lamaSE21,selisihHari21,lamaTahun21,lamaBulan21,lamaHari21,LamatahunModulo21;

        System.out.println("Nama : Naufal Ramadhan W");
        System.out.println("Nim : 244107020201");
        System.out.println("Absen : 21");
        System.out.println("Tanggal Berangkat : ");
        tanggalBerangkat21 = input.nextInt();
        System.out.println("Bulan Berangkat : ");
        bulanBerangkat21 = input.nextInt();
        System.out.println("Tahun Berangkat : ");
        tahunBerangkat21 = input.nextInt();
        System.out.println("Tanggal Berangkat : " + tanggalBerangkat21 + "-" + bulanBerangkat21 + "-" + tahunBerangkat21);

        System.out.println("Tanggal Pulang : ");
        tanggalPulang21 = input.nextInt();
        System.out.println("Bulan Pulang : ");
        bulanPulang21 = input.nextInt();
        System.out.println("Tahun Pulang : ");
        tahunPulang21 = input.nextInt();
        System.out.println("Tanggal Pulang2 : " + tanggalPulang21 + "-" + bulanPulang21 + "-" + tahunPulang21);

        jumlahHariBerangkat21 = tanggalBerangkat21 + (bulanBerangkat21*30) + (tahunBerangkat21*360);
        jumlahHariPulang21 = tanggalPulang21 + (bulanPulang21*30) + (tahunPulang21*360);
        selisihHari21 = jumlahHariPulang21-jumlahHariBerangkat21;
        lamaTahun21= selisihHari21/360; 
        LamatahunModulo21 = selisihHari21 %360; 
        lamaBulan21 = LamatahunModulo21/30; 
        lamaHari21 = LamatahunModulo21%30; 

        System.out.println("Lama SE : " + lamaTahun21 + "Tahun " + lamaBulan21 + "Bulan " + lamaHari21 + "Hari");


    }
}
