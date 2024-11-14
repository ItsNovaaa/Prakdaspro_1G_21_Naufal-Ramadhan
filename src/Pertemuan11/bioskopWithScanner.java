package Pertemuan11;

import java.util.Scanner;

public class bioskopWithScanner {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2]; 
        String nama;
        String next;
        int baris;
        int kolom;
        int menu;
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.println("Masukkan Pilihan Menu");
            System.out.println("Menu 1 : Masukkan Nama Penonton");
            System.out.println("Menu 2 : Tampilkan Penonton");
            System.out.println("Menu 3 : Exit");
            menu = input.nextInt();
            switch (menu) {
                case 1:

                    System.out.println("Masukkan Nama Penonton : ");
                    nama = input.next();
                    System.out.println("Masukkan Baris");
                    baris = input.nextInt();
                    System.out.println("masukkan Kolom");
                    kolom = input.nextInt();
                    input.nextLine();

                    if (baris > penonton.length || kolom > penonton[0].length) {
                        System.out.println("Baris atau Kolom yang anda masukkan salah");
                        continue;
                    }

                    if (penonton[baris-1][kolom-1] != null) {
                        penonton[baris-1][kolom-1] = nama;
                    } else {
                        System.out.println("Sudah Terpakai");
                        continue;
                    }
                    
                    
                break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.println("***");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }

                break;
                case 3:
                    System.exit(0);
                break;
            }



            System.out.println("Input Penonton lainnya (y/n)");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
