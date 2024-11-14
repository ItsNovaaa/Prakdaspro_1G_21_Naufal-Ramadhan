package Pertemuan11;

import java.util.Scanner;

public class bioskopWithScanner {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2]; 
        String nama;
        String next;
        int baris;
        int kolom;
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.println("Masukkan Nama Penonton : ");
            nama = input.nextLine();
            System.out.println("Masukkan Baris");
            baris = input.nextInt();
            System.out.println("masukkan Kolom");
            kolom = input.nextInt();
            input.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input Penonton lainnya");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
