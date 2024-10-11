package Pertemuan7;

import  java.util.Scanner;
public class pertemuan7Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        int jml;
        int i = 0;

        System.out.println("Masukkan jumlah mahasiswa : ");
        jml = input.nextInt();
        while (i < jml) {
            
            System.out.println("Masukkan nilai mahasiswa " + (i+1) + " : ");
            nilai = input.nextInt();
            if(nilai < 0 || nilai > 100){
                System.out.println("Nilai Tidak Valid");
            continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Mahasiswa " + (i+1) + " bernilai A");
                System.out.println("Pertahankan Prestasi");
            } else if (nilai >73 && nilai <= 80) {
                System.out.println("Mahasiswa " + (i+1) + " bernilai B");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Mahasiswa " + (i+1) + " bernilai C+");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Mahasiswa " + (i+1) + " bernilai C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Mahasiswa " + (i+1) + " bernilai C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Mahasiswa " + (i+1) + " bernilai D");
            } else {
                System.out.println("Mahasiswa " + (i+1) + " bernilai 3");
            }
            i++;
        }
    }
}
