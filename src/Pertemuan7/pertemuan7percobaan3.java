package Pertemuan7;
import java.util.Scanner;
public class pertemuan7percobaan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kopi;
        int teh;
        int roti;

        int Hargakopi;
        int Hargateh;
        int Hargaroti;

        int HargaTotal;


        Hargakopi = 12000;
        Hargateh = 7000;
        Hargaroti = 20000;

        do { 
            System.err.println("masukkan Nama Pelanggan : (Ketikan batal untuk Membatalkan Transaksi) ");
            String nama = input.next();
            if (nama.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }

            System.out.println("masukkan Jumlah Kopi : ");
            kopi = input.nextInt();
            System.out.println("masukkan Jumlah Teh : ");
            teh = input.nextInt();
            System.out.println("masukkan Jumlah Roti : ");
            roti = input.nextInt();

            HargaTotal = (kopi*Hargakopi) + (teh*Hargateh) + (roti*Hargaroti);

            System.out.println("Harga Total : " + HargaTotal);
            input.nextLine();

        } while (true);

        System.err.println("Transaksi selseai");

    }
}
