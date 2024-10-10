package Pertemuan6;

import java.util.Scanner;

public class pemilihan2percobaan221 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        String member;
        int pilihan_menu;
        double nilaiBayar;
        double diskon;
        double harga;

        System.out.println("----------------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("----------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("----------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input21.nextInt();
        input21.nextLine(); // membersihkan newline dari input sebelumnya
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input21.nextLine();
        System.out.println("----------------------------------");

        // Memeriksa apakah user adalah member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Diskon 10%");

            // Memeriksa pilihan menu dan menetapkan harga
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl : " + harga);
            } else if (pilihan_menu == 2) {
                harga = 7000;
                System.out.println("Harga Ice Tea : " + harga);
            } else if (pilihan_menu == 3) {
                harga = 21000;
                System.out.println("Harga Paket Bunding : " + harga);
            } else {
                System.out.println("Pilihan menu tidak tersedia");
                return;
            }

            // Menghitung nilai bayar setelah diskon
            nilaiBayar = harga - (harga * diskon);
            System.out.println("Total Bayar setelah diskon : " + nilaiBayar);

        } 
        // Jika bukan member
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl : " + harga);
            } else if (pilihan_menu == 2) {
                harga = 7000;
                System.out.println("Harga Ice Tea : " + harga);
            } else if (pilihan_menu == 3) {
                harga = 21000;
                System.out.println("Harga Paket Bunding : " + harga);
            } else {
                System.out.println("Pilihan menu tidak tersedia");
                return;
            }
            // Menghitung nilai bayar tanpa diskon
            nilaiBayar = harga;
            System.out.println("Total Bayar : " + nilaiBayar);
        }
        else {
            System.out.println("Input tidak valid, silakan masukkan y atau n untuk status member.");
        }

        input21.close(); // Menutup scanner untuk mencegah kebocoran resource
    }
}
