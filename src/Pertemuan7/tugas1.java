package Pertemuan7;
    
import  java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i =0;
        int Jenistiket;
        int jumlahTiket;
        double Diskon;
        double bayarawal;
        double bayar;

        System.out.println("Masukkan Jenis tiket : ");
        jumlahTiket = input.nextInt();

        while ( i < jumlahTiket) {
            System.out.println("Berapa jenis tiket yg dihitung");
            Jenistiket = input.nextInt();
            if (Jenistiket < 0 ) {
                System.out.println("Tidak boleh 0");
                continue;
            }

            if (jumlahTiket > 10) {
                Diskon = 0.15;
                bayarawal = 50000 * jumlahTiket;
                bayar = bayarawal - (bayarawal * Diskon);
                System.out.println("harga  : " + bayar);
            } else if (jumlahTiket > 4) {
                Diskon = 0.1;
                bayarawal = 50000 * jumlahTiket;
                bayar = bayarawal - (bayarawal * Diskon);
                System.out.println("harga  : " + bayar);
            }
            i++;
        }
    }

}
