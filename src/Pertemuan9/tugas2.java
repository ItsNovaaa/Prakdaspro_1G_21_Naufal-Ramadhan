package Pertemuan9;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        int i;
        int k;
        String NamaMahasiswa;
        String cabor;
        Scanner sc = new Scanner(System.in);
        System.out.println("berapa banyak cabor : ");
        i = 1;
        k = sc.nextInt();
        while( i <= k ){
            System.out.println("Nama Cabor :");
            cabor = sc.next();
            for (int j = 1; j <= 5; j++) {
                System.out.println("Masukkan Nama Mahasiswa ke-"+j+": ");
                NamaMahasiswa = sc.next();
            }
            i++;
        }
    }
}
