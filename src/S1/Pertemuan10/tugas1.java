package Pertemuan10;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rata;
        int tertinggi = 0;
        int terendah = 100;
        int total = 0;
        // int totalNilai;

        System.out.println("Masukkan Jumlah Mahasiswa : ");
        int N = input.nextInt();
        int[] nilaiMahasiswa = new int[N];

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = input.nextInt();
            total += nilaiMahasiswa[i];
        }

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
           if (nilaiMahasiswa[i] > tertinggi) {
                tertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < terendah) {
                terendah = nilaiMahasiswa[i];
            }
        }

        rata = total / nilaiMahasiswa.length;
        System.out.println("Nilai Rata Rata : " + rata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("total Nilai " + total);

    }
}
