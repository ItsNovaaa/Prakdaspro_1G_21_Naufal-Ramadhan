package Pertemuan5;

import java.util.Scanner;

public class pemilihanBilangan21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int angka ;
        String hasil;
        System.err.print("Masukkan Angka : ");
        angka = sc.nextInt();

        hasil = (angka % 2 == 0) ? " Bilangan Genap" : " Bilangan Ganjil";
        
        System.out.println("Angka " + angka + hasil);

        // if (angka % 2 == 0) {
        //     System.err.print("Angka " + angka + " Bilangan genap");
        // } else {
        //     System.err.print("Angka " + angka + " Bilangan Ganjil");
        // }
    }


}


    