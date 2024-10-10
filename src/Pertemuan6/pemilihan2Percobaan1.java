package Pertemuan6;

import java.util.Scanner;

public class pemilihan2Percobaan1 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        int tahun;

        System.out.println("Masukkan tahun: ");
        tahun = input21.nextInt();

        if (tahun%4 == 0) {
            if (tahun%100 != 0) 
                System.out.println("Tahun Kabisat");
            else 
                System.out.println("Tahun Bukan Kabisat");
        } else 
            System.out.println("Tahun bukan kabisat");
        
    }
}
