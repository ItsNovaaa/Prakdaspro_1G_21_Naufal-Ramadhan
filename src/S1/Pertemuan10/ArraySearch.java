package Pertemuan10;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int keySearch;
        int hasil = 0;
        
        System.out.println("Masukkan Banyak Nilai yang akan di masukkan");
        int size = input.nextInt();
        int [] Nilai = new int [size];
        
        for (int i = 0; i < Nilai.length; i++) {
            System.out.println("Masukkan Nilai");
            Nilai[i] = input.nextInt();
        }

        System.out.println("Masukkan Nilai Yang Akan di cari");
        keySearch = input.nextInt();

        for (int i = 0; i < Nilai.length; i++) {
            if ( keySearch == Nilai[i]) {
                hasil = i;
                break;
            }
        }

        if (hasil == 0) {
            System.out.println("Nilai " + keySearch + " Tidak Ditemukan");
        } else {
            System.out.println();
            System.out.println("Nilai " + keySearch + " Di Indeks " + hasil);
            System.out.println(); 
        }

    }
}
