package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        int[] nilaiMahasiswa = new int [10];
        double total = 0;
        double rata;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan Nilai");
            nilaiMahasiswa[i] = sc.nextInt(); 
        }
        for(int i =0; i < nilaiMahasiswa.length;i++){
            total += nilaiMahasiswa[i] ;
        }
        rata = total/nilaiMahasiswa.length;
        System.out.println("Rata Rata Nilai Mahasiswa" + rata);
    }
}
