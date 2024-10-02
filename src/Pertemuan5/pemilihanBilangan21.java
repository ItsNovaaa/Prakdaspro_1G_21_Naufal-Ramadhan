package Pertemuan5;

import java.util.Scanner;

public class pemilihanBilangan21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int angka ;

        System.err.print("Masukkan Angka : ");
        angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.err.print("Angka " + angka + " Bilangan genap");
        } else {
            System.err.print("Angka " + angka + " Bilangan Ganjil");
        }
    }


}


    