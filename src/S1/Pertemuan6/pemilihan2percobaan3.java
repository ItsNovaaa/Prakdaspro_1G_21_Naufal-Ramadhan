package Pertemuan6;

import java.util.Scanner;

public class pemilihan2percobaan3 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        String kategori;
        int penghasilan;
        int gajibersih;
        double pajak;

        System.out.println("Masukkan kategori: ");
        kategori = input21.next();

        System.out.println("Masukkan penghasilan: ");
        penghasilan = input21.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("penghasilan bersih : " + gajibersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("penghasilan bersih : " + gajibersih);

        } else 
            System.out.println("Masukan Kategori salah");
    }    
}
