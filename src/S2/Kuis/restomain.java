package S2.Kuis;

import java.util.Scanner;

public class restomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        restoclass [] resto = new restoclass[3];
        resto[0] = new restoclass("Roti Bakar", 10000, 1);
        resto[1] = new restoclass("Kopi Susu", 5000, 2);
        resto[2] = new restoclass("Jagung Bakar", 2000, 3);
        for (int i = 0; i < resto.length; i++) {
            resto[i].showData();
            System.err.println("=================================");
            resto[i].ubahHarga(resto[i].price + 1000);
            System.out.println("");
            System.out.println("Masukkan Nama Menu baru : ");
            System.out.println("");
            String namaMenu = sc.nextLine();
            resto[i].UbahMenu(namaMenu);
            System.err.println("=================================");

        }
        System.out.println("");
        System.out.println("Data Setelah Perubahan : ");
        System.out.println("");
        for (int i = 0; i < resto.length; i++) {
            resto[i].showData();
            System.err.println("=================================");
        }
    }
}
