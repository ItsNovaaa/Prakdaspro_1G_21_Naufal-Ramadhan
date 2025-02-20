package Pertemuan13;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] Menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        // System.out.println("Masukkan menu");
        // int totalMenu = sc.nextInt();
        // System.out.println("Masukkan jumlah hari");
        // int totalHari = sc.nextInt();


        // int [][] Penjualan = new int[totalMenu][totalHari];
        int[][] Penjualan =new int[][]{
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };

        int jumlahHari = 7;

        while (true) {
            System.out.println("===== MENU CAFE =====");
            System.out.println("masukkan Data");
            System.out.println("Tampikan Data");
            System.out.println("Tampilkan Data Menu Penjulan Tertinggi");
            System.out.println("Rata Perjualan Tiap Menu");

            System.out.println("Pilih Menu");
            int menu = new Scanner(System.in).nextInt();

            switch (menu) {
                case 1:
                    inputdataPenjualan(jumlahHari ,Penjualan);
                    break;
                case 2:
                    seluruhDataPenjualan(Menu,jumlahHari,Penjualan);
                    break;
                case 3:
                    PenjulanTertinggi(Menu, jumlahHari, Penjualan);
                    break;
                case 4:
                    RataRatapenjulan(Menu, jumlahHari, Penjualan);
                    break;
                case 5:
                    System.out.println("Menu : " + Menu[4]);
                    break;
                case 6:
                    System.out.println("Menu : " + Menu[0]);
                break;
            }
        }
    }


    public static void inputdataPenjualan(int jumlahHari, int[][] Penjualan) {
        while (true) { 
            
            System.out.println("Masukkan Data Penjualan");
            System.out.println("Menu (1)");
            System.out.println("Kopi (2)");
            System.out.println("es Degan (3)");
            System.out.println("rotibakar (4)");
            System.out.println("gorengan (5)");
    
            System.out.println("Masukkan Menu Makanan");
            int menuEdit = new Scanner(System.in).nextInt();
            System.out.println("Pilih Hari");
            int hariEdit = new Scanner(System.in).nextInt();
            System.out.println("Masukkan Jumlah Penjualan");
            Penjualan[hariEdit - 1][menuEdit - 1] = new Scanner(System.in).nextInt();
            System.out.println("lanjut Edit Penjualan y/n");
            String isLanjut = new Scanner(System.in).nextLine();
            if (isLanjut.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static void seluruhDataPenjualan(String[] Menu, int jumlahHari, int[][] Penjualan) {
        System.out.print("Menu\t\t");
        for (int i = 0; i < jumlahHari; i++) {
            System.out.print("Hari Ke-" + (i + 1) + "\t");
        }
        System.out.println("\n");

        // Menampilkan data penjualan per menu
        for (int i = 0; i < Menu.length; i++) {
            System.out.print(Menu[i] + "\t\t"); // Tampilkan nama menu
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(Penjualan[i][j] + "\t\t"); // Tampilkan penjualan per hari
            }
            System.out.println();
        }
    }

    public static void PenjulanTertinggi(String[] Menu, int jumlahHari, int[][] Penjualan) {
        int maxMenu = 0;
        int max = 0;
        for (int i = 0; i < Penjualan.length; i++) {
            int jmlMenu = 0;
            for (int j = 0; j < Penjualan[i].length; j++) {
                jmlMenu += Penjualan[i][j];
            }
            if (jmlMenu > maxMenu) {
                maxMenu = jmlMenu;
                max = i;
            }
        }
        System.out.println("Menu : " + Menu[max]);
        
    }

    public static void RataRatapenjulan(String[] Menu, int jumlahHari, int[][] Penjualan) {
        int rataPerMenu = 0;
        for (int j = 0; j < Penjualan.length; j++) {
            int jmlPerMenu = 0;
            for (int i = 0; i < Penjualan[j].length; i++) {
                jmlPerMenu += Penjualan[j][i];
            }
            rataPerMenu = jmlPerMenu / jumlahHari;
            System.out.println("Rata rata penjualan " + Menu[j] + " : " + rataPerMenu + "/hari");
        }
    }
}
