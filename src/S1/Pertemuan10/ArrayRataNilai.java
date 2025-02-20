package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double rata;
        int lulus =0 ;
        int input;
        double nilaiLulus = 0;
        double nilaiTidakLulus = 0;
        double ratalulus;
        double rataTidakLulus;
        System.out.println("Masukkan Berpabanyak Mahasiswa");
        input = sc.nextInt();
        
        int[] nilaiMahasiswa = new int [input];
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan Nilai");
            nilaiMahasiswa[i] = sc.nextInt(); 
        }
        for(int i =0; i < nilaiMahasiswa.length;i++){
            total += nilaiMahasiswa[i] ;
            if (nilaiMahasiswa[i] > 70) {
                nilaiLulus += nilaiMahasiswa[i];
                lulus++;
            } else {
                nilaiTidakLulus += nilaiMahasiswa[i];
            }
        }

        rata = total/nilaiMahasiswa.length;
        ratalulus = nilaiLulus / nilaiMahasiswa.length;
        rataTidakLulus = nilaiTidakLulus / nilaiMahasiswa.length;
        System.out.println("lulus : " + lulus);
        System.out.println("Rata Rata Nilai Mahasiswa" + rata);
        System.out.println("Rata Rata Nilai Lulus Mahasiswa" + ratalulus);
        System.out.println("Rata Rata Nilai Tidak Lulus Mahasiswa" + rataTidakLulus );
    }
}
