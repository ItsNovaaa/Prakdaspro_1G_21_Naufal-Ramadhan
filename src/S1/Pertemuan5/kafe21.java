package Pertemuan5;

import java.util.Scanner;

public class kafe21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            boolean keanggotaan;
            int jmlKopi, jmlTeh, jmlRoti;
            double hargaKopi = 12000.0, HargaBayar, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga,nominalBayar,Totalbyte;
            float diskon = 10 / 100f;       
            
            System.out.print("Masukkan keanggotaan (True/False): ");
            keanggotaan = input.nextBoolean();
            System.out.print("Masukkan jumlah pembelian kopi: ");
            jmlKopi = input.nextInt();           
            System.out.print("Masukkan jumlah pembelian teh: ");
            jmlTeh = input.nextInt();
            System.out.print("Masukkan jumlah pembelian roti: ");
            jmlRoti = input.nextInt();
             
            if (keanggotaan == true) {
                totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
                nominalBayar = totalHarga - (diskon * totalHarga);
                HargaBayar = nominalBayar;
                Totalbyte = totalHarga;
            } else {
                totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
                nominalBayar = totalHarga;
                HargaBayar = nominalBayar;
                Totalbyte = totalHarga;
            }

            System.err.println("Total Harga : " + Totalbyte);
            System.err.println("Nominal Bayar : " + HargaBayar);
    }

}
