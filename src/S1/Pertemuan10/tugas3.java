package Pertemuan10;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        String [] menu = {"Nasi Goreng","Mie Goreng","Roti Bakar", " Kentang Goreng","Teh Tarik","Cappucino","COKLAT"};
        String Search;
        System.out.println("Masukkan Menu Yang Akan Dicari : ");
        Search = new Scanner(System.in).nextLine();

        for (int i = 0; i < menu.length; i++) {
            if(Search == menu[i]) {
                System.out.println("Menu Yang Dicari : " + Search);
                break;
            } else {
                System.out.println("Menu Yang Dicari : " + Search + " Tidak ditemukan");
                break;
            }
        }
    }
    
}
