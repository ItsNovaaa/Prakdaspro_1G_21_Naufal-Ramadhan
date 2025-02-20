package Pertemuan10;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int N = input.nextInt();
        int totalPesanan;
        int totalHarga = 0;

        System.out.println("Masukkan Banyak Pesanan : " );
        totalPesanan = input.nextInt();
        String [] Menu = new String[totalPesanan]; 
        int [] harga = new int[totalPesanan]; 

        
        for (int i = 0; i < totalPesanan; i++) {
            System.out.println("Masukkan Menu Pesanan ke-" + (i + 1) + " : ");
            Menu[i] = input.next();
            System.out.println("Masukkan Harga Menu ke-" + (i + 1) + " : ");
            harga[i] = input.nextInt();
        }

        
        for(int i = 0; i < totalPesanan; i++) {
            totalHarga += harga[i] * totalPesanan;  
        }

        for (int i = 0; i < totalPesanan; i++) {
            System.out.println("Menu Pesanan ke-" + Menu[i] + " : " + harga[i]);
            System.out.println("Menu Yang dipesanan : " + Menu[i]);
        }
        System.out.println("Total Harga : " + totalHarga);
    }
}
