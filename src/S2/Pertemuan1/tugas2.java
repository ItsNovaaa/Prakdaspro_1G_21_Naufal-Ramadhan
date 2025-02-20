package S2.Pertemuan1;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Panjang Rusuk Kubus : ");
        double RusukKubus = sc.nextDouble();

        while (true) { 
            System.out.println(" 1. Volume Kubus : ");
            System.out.println(" 2. Perhitungan Luas Permukaan Kubus : ");
            System.out.println(" 3. Keliling Kubus : ");
            System.out.println(" 4. Keluar : ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1 :
                    double volumeKubus = RusukKubus * RusukKubus * RusukKubus;
                    System.out.println("Volume Kubus : " + volumeKubus);
                break;
                case 2 :
                double luasPermukaanKubus = RusukKubus * RusukKubus * 6;
                System.out.println("Luas Permukaan Kubus : " + luasPermukaanKubus);
                break;
                case 3 :
                    double KelilingKubus = RusukKubus * 12;
                    System.out.println("Keliling Kubus : " + KelilingKubus);
                break;
                case 4 :
                    System.out.println("Transaksi Selesai");
                    break;
            }

        }
    }
}
