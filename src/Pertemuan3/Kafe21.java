package Pertemuan3;

import java.util.Scanner;

public class Kafe21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            boolean keanggotaan;
            int jmlKopi, jmlTeh, jmlRoti, HargaBayar;
            double hargaKopi = 12000.0,  hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga,nominalBayar;
            float diskon = 10 / 100f;       
            byte Totalbyte;
            System.out.print("Masukkan keanggotaan (True/False): ");
            keanggotaan = input.nextBoolean();
            System.out.print("Masukkan jumlah pembelian kopi: ");
            jmlKopi = input.nextInt();           
            System.out.print("Masukkan jumlah pembelian teh: ");
            jmlTeh = input.nextInt();
            System.out.print("Masukkan jumlah pembelian roti: ");
            jmlRoti = input.nextInt();
            totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
            nominalBayar = totalHarga - (diskon * totalHarga);
            HargaBayar = (int)nominalBayar;
            Totalbyte = (byte) totalHarga;
            System.err.println("Total Harga : " + Totalbyte);
            System.err.println("Nominal Bayar : " + HargaBayar);
    }
}