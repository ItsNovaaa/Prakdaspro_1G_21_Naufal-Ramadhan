package Pertemuan13;

import java.util.Scanner;

public class kafePecobaan21 {
    public static void main(String[] args) {

        int pilihanMenu;
        int jumlahPesanan;
        int totalHarga = 0;
        String isPesananSelesai;
        

        
        double Total = menu("Andi", true, "PROMO50%");
        
       
        while (true) { 
            System.out.println("\nMasukkan Nomor Menu Yang akan Dipesan : ");
            pilihanMenu = new Scanner(System.in).nextInt();
            System.out.println("Masukkan Jumlah Pesanan : ");
            jumlahPesanan = new Scanner(System.in).nextInt();
            
            double hargabersih = hitungHarga(pilihanMenu, jumlahPesanan, Total);
            totalHarga += hargabersih;
            System.out.println("Lanjut Pesan (y/n) : ");
            isPesananSelesai = new Scanner(System.in).nextLine();
            if (isPesananSelesai.equalsIgnoreCase("n")) {
                System.out.println("Total Harga : " + totalHarga);
                break;
            }
        }

    }   
    public static double menu(String namaPelanggan , boolean member, String kodePromo) {

    double diskon;

    if (member) {
        System.out.println("Selamat datang, " + namaPelanggan + " Anda adalah member.");
    } 

    switch (kodePromo) {
        case "PROMO50%":
            System.out.println("Selamat datang, " + namaPelanggan + " Anda mendapatkan diskon 50%.");
            diskon = 0.5;
            break;
        case "PROMO30%":
            System.out.println("Selamat datang, " + namaPelanggan + " Anda mendapatkan diskon 30%.");
            diskon = 0.3;
            break;
        default:
            System.out.println("Selamat datang, " + namaPelanggan + " Anda tidak mendapatkan diskon.");
            diskon = 0;
            break;

        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam Rp 15,000");
        System.out.println("2. Cappuccino Rp 20,000");
        System.out.println("3. Latte Rp 22,000");
        System.out.println("4. Teh Tarik Rp 12,000");
        System.out.println("5. Roti Bakar Rp 10,000");
        System.out.println("6. Mie Goreng Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
        return diskon;
    }

    public static double hitungHarga(int pilihanMenu, int jumlahPesanan, double diskon) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        double hargaTotal = hargaItem[pilihanMenu - 1] * jumlahPesanan;
        double hargaAsli = hargaTotal - (hargaTotal*diskon);
        return hargaAsli;
    }
}