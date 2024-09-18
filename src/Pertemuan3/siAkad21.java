package Pertemuan3;

import java.util.Scanner;

public class siAkad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        String nim;
        char kelas;
        byte absen;
        double nilaiKuis;
        double nilaiTugas;
        double nilaiUjian;
        double nilaiAkhir;

        // absen = 10;
        // kelas = 'G';
        // System.err.println(absen);

        System.err.print("Masukan Nama: ");
        nama = sc.nextLine();
        System.err.print("Masukan Nim: ");
        nim = sc.nextLine(); 
        System.err.print("Masukan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.err.print("Masukan absen: ");
        absen = sc.nextByte(); 
        System.err.print("Masukan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble(); 
        System.err.print("Masukan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble(); 
        System.err.print("Masukan Kuis: ");
        nilaiKuis = sc.nextDouble();

        nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUjian) / 3;
        
        System.err.print("Nama : " + nama + "\nNim" + nim);
        System.err.print("\nKelas : " + kelas + "\nAbsen" + absen);
        System.err.print("\nNilai Akhir : " + nilaiAkhir);

        
    }
}
