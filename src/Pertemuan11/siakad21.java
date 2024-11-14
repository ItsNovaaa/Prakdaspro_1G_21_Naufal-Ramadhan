package Pertemuan11;

import java.util.Scanner;

public class siakad21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nilai = new int [4][3];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;

            for (int j = 0; i < nilai[i].length; j++) {
                System.out.println("nilai Matkul ke-" + (j+1) + " : ");
                nilai[i][j] = scanner.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("nilai rata rata " + totalPersiswa/3);
        }

        System.out.println("\n====================================");
        System.out.println("Rata Tiap Matkul");

        for (int j = 0; j < 10; j++) {
            double nilaiPermatkul =0;
            for (int i = 0; i < nilai.length; i++) {
                nilaiPermatkul += nilai[i][j];
            }
            System.out.println("nilai matkul ke-" + (j+1) + " : " + nilaiPermatkul/4);
        }
    }
}
