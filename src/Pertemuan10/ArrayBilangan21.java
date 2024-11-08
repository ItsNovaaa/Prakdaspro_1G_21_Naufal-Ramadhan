package Pertemuan10;

import java.util.Scanner;

public class ArrayBilangan21 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String[] angka = {"jan", "Feb", "Mar", "Mei"} ;
        String[] Hasil = new String[4] ;     // new int[4];
           // new int[4];
           for (int i = 0; i < 4; i++) {
            int key;
            System.out.println("Masukkan Bulan yg akan dicari");
            // System.out.println(angka[i]);
            key = Scanner.nextInt();
                Hasil[i] = angka[key];
            
                
            }
            for(String value : Hasil){

                System.out.println(value);       
            }
        
    }
}
