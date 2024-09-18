package Pertemuan3;

import java.util.Scanner;

public class P3_Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPenggunaanListrik;
        boolean melebihi500;
        int totalTagihan;
        jumlahPenggunaanListrik = input.nextInt();
        melebihi500 = jumlahPenggunaanListrik > 500;
        totalTagihan = jumlahPenggunaanListrik * 1500;
        System.out.print("Masukkan jumlah penggunaan listrik dalam kwh: ");
        System.out.println("Penggunaan listrik melebihi 500 kwh: " + melebihi500);
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);

        input.close();
    }
}
