package Pertemuan5;

import java.util.Scanner;

public class LatihanIndividu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double HM1 ;
        double HM2 ;
        double HM3 ;
        double totalHarga ;
        double totalBayar ;
        int JM1;
        int JM2;
        int JM3;

        System.out.println("Masukkan Harga Fuyunghai : ");
        HM1 = sc.nextDouble();
        System.out.println("Masukkan Harga Nasi Goreng : ");
        HM2 = sc.nextDouble();
        System.out.println("Masukkan Harga Mie Rebus : ");
        HM3 = sc.nextDouble();  
        System.out.println("Masukkan Jumlah Fuyunghai : ");
        JM1 = sc.nextInt();
        System.out.println("Masukkan Jumlah Nasi Goreng : ");
        JM2 = sc.nextInt();
        System.out.println("Masukkan Jumlah Mie Rebus : ");
        JM3 = sc.nextInt();

        totalHarga = HM1*JM1 + HM2*JM2 + HM3*JM3;

        if (totalHarga >= 500000) {
            totalBayar = totalHarga - totalHarga * 0.1;
        } else if (totalHarga >= 200000)  {
            totalBayar = totalHarga - totalHarga * 0.05;
        } else if (totalHarga >= 100000) {
            totalBayar = totalHarga - totalHarga * 0.02;
        } else { 
            totalBayar = totalHarga;
        }

        System.out.println("Total Harga : " + totalHarga);
        System.out.println("Total Bayar : " + totalBayar);
    }
}
