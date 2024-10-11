package Pertemuan7;

import java.util.Scanner;

public class pertemuan7percobaan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilai;
        double tertinggi = 0;
        double terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai Mahasiswa " + i + " : ");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Mahasiswa nilai tertinggi : " + tertinggi);
        System.out.println("Mahasiswa nilai terendah : " + terendah);
    }
}
