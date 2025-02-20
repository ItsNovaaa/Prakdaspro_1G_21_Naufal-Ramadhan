package S2.Pertemuan1;

import java.util.Scanner;

public class percobaan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] bungaTerjual = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        String [] namaBunga = {
            "aglonea", "keladi", "alocasia", "mawar"
        };
        double [] harga = {75_000, 50_000, 60_000, 10_000};
        double [][] pendapatan = new double[4][4];
        double [] total = new double[4];
        int [] informasiTambahan = {1,2,0,5};
        //


        while (true) {
            System.out.println("===== PERCAKAIAN =====");
            System.out.println("1. Tampilkan Data Pendapatan");
            System.out.println("2. Informasi Tambahan Stock Bunga");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 :
                    BungaHabisTerjual(bungaTerjual, harga, pendapatan, total);
                break;
                case 2: 
                    informasiTambahanBunga(bungaTerjual, informasiTambahan, namaBunga);
                break;
                default:
                    throw new AssertionError();
            }

            System.out.println("Kembali ke menu (y/n)");
            String pilihan = sc.nextLine();
            if (pilihan.equalsIgnoreCase("n")) {
                System.out.println("Transaksi Selesai");
                break;
            } 
        }
    }

    public static void informasiTambahanBunga(int [][] bungaTerjual, int [] informasiTambahan, String [] namaBunga) {
        for (int i = 0; i < 4; i++) {
            bungaTerjual[3][i] = bungaTerjual[3][i] - informasiTambahan[i];
            System.out.print("\t\t" + namaBunga[i]+ "  ");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print("Royal Gerden " + (i+1) + " : ");
            for (int j = 0; j < 4; j++) {
                System.out.print(bungaTerjual[i][j] + "\t \t\t ");
            }
            System.out.println();
        }
    }
    
    public static void BungaHabisTerjual(int [][] bungaTerjual, double [] harga, double [][] pendapatan, double [] total) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                pendapatan[i][j] = bungaTerjual[i][j] * harga[j];
                total[i] += pendapatan[i][j];
            }
            System.out.println("Pendapatan Royal Gerden " + (i+1) + " : " + total[i]);
        }
    }
}
