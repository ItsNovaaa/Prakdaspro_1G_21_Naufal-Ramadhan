package Pertemuan6;

import java.util.Scanner;

public class pmilihan2tugas1 {
    public static void main(String[] args) {
        
        Scanner input21 = new Scanner(System.in);

        String jenisBuku;
        int JumlahBuku;
        double Diskon;

        System.err.println("Masukkan jenis buku: ");
        jenisBuku = input21.next();

        System.err.println("Masukkan jumlah buku: ");
        JumlahBuku = input21.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            Diskon = 0.1;
            if (JumlahBuku >= 2) {
                Diskon = Diskon + 0.02;
                System.out.println("Diskon : " + Diskon);
            } else 
            System.out.println("diskon : " + Diskon);
        }   else if (jenisBuku.equalsIgnoreCase("novel")) {
            Diskon = 0.07;
            if (JumlahBuku >= 3) {
                Diskon = Diskon + 0.02;
                System.out.println("Diskon : " + Diskon);
            } else 
            Diskon = Diskon + 0.01;
            System.out.println("diskon : " + Diskon);
        }   else {
            System.out.println("Maaf Tidak Dapat Diskon");
        }
    }
}
