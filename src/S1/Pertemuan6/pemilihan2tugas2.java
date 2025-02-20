package Pertemuan6;
import java.util.Scanner;
public class pemilihan2tugas2 {
    public static void main(String[] args) {
        Scanner Input21 = new Scanner (System.in);

        String merk;
        String kategori;
        double ukuran;
        double harga;

        System.out.println("Masukkan merk : ");
        merk = Input21.next();

        System.out.println("Masukkan kategori : ");
        kategori = Input21.next();

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip")) {
                harga = 800000;
                System.out.println("harga : " + harga);
            } else 
                harga = 1200000;
                System.out.println("harga : " + harga);
        } else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                harga = 1000000;
                System.out.println("harga : " + harga);
            } else 
                harga = 1800000;
                System.out.println("harga : " + harga);

        }   else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                harga = 750000;
                System.out.println("harga : " + harga);
            } else 
                harga = 1500000;
                System.out.println("harga : " + harga);
        }   else 
            System.out.println("salah merk");
    }
}
