package Pertemuan5;

import java.util.Scanner;

public class siAkad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        String nim;
        String gradeNilai;
        String kualifikasi;
        char kelas;
        byte absen;
        float nilaiKuis;
        float nilaiTugas;
        float nilaiUjianUTS;
        float nilaiUjianUAS;
        float nilaiAkhir;

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
        nilaiTugas = sc.nextFloat() * 15/100; 
        System.err.print("Masukan Nilai Ujian UTS: ");
        nilaiUjianUTS = sc.nextFloat() * 30/100;
        System.err.print("Masukan Nilai Ujian UAS: ");
        nilaiUjianUAS = sc.nextFloat() * 35/100; 
        System.err.print("Masukan Kuis: ");
        nilaiKuis = sc.nextFloat() * 20/100;

        nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUjianUAS + nilaiUjianUTS) ;
        
        
        if (nilaiAkhir >= 80) {
            gradeNilai = "A";
        } else if (nilaiAkhir >= 73) {
            gradeNilai = "B+";
        } else if (nilaiAkhir >= 65) {
            gradeNilai = "B";
        } else if (nilaiAkhir >= 60) {
            gradeNilai = "C+";
        } else if (nilaiAkhir >= 50) {
            gradeNilai = "C";
        } else if (nilaiAkhir >= 39) {
            gradeNilai = "D";
        } else {
            gradeNilai = "E";
        }
        
        switch (gradeNilai) {
            case "A" :
            kualifikasi = "Sangat Baik";
            break;
            case "B+" :
            kualifikasi = "Lebih Dari Baik";
            break;
            case "B" :
            kualifikasi = "Baik";
            break;
            case "C+" :
            kualifikasi = "Lebih Dari Cukup";
            break;
            case "C" :
            kualifikasi = "Cukup";
            break;
            case "D" :
            kualifikasi = "Kurang";
            break;
            case "E" :
            kualifikasi = "Gagal";
            break;
            default:
            return;
        }
        System.err.print("Nama : " + nama + "\nNim" + nim);
        System.err.print("\nKelas : " + kelas + "\nAbsen" + absen);
        System.err.print("\nNilai Akhir : " + nilaiAkhir);
        System.err.print("\nNilai Akhir Huruf : " + gradeNilai);
        System.out.println("\nKualifikasi : " + kualifikasi);
    }
   
}
