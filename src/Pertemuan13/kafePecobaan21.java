package Pertemuan13;

import java.util.Scanner;

public class kafePecobaan21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihanMenu;
        int jumlahPesanan;

        menu("Andi", true, "PROMO50%");

        System.out.println("\nMasukkan Nomor Menu Yang akan Dipesan : ");
        pilihanMenu = new Scanner(System.in).nextInt();
        System.out.println("Masukkan Jumlah Pesanan : ");
        jumlahPesanan = new Scanner(System.in).nextInt();
        
        int hargaTotal = hitungHarga(pilihanMenu, jumlahPesanan);
        System.out.println("Total Harga : " + hargaTotal);
    }   
    public static void menu(String namaPelanggan , boolean member, String kodePromo) {

    if (member) {
        System.out.println("Selamat datang, " + namaPelanggan + " Anda adalah member.");
    } 

    switch (kodePromo) {
        case "PROMO50%":
            System.out.println("Selamat datang, " + namaPelanggan + " Anda mendapatkan diskon 50%.");
            break;
        case "PROMO30%":
            System.out.println("Selamat datang, " + namaPelanggan + " Anda mendapatkan diskon 30%.");
            break;
        default:
            System.out.println("Selamat datang, " + namaPelanggan + " Anda tidak mendapatkan diskon.");
            break;
    }
    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam – Rp 15,000");
    System.out.println("2. Cappuccino – Rp 20,000");
    System.out.println("3. Latte – Rp 22,000");
    System.out.println("4. Teh Tarik – Rp 12,000");
    System.out.println("5. Roti Bakar – Rp 10,000");
    System.out.println("6. Mie Goreng – Rp 18,000");
    System.out.println("===========================");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungHarga(int pilihanMenu, int jumlahPesanan) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihanMenu - 1] * jumlahPesanan;
        return hargaTotal;
    }
}