package S2.pertemuan4;

import java.util.Scanner;

public class pangkat20main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan jumlah elemen : ");
        int elemen = sc.nextInt();

        pangkat20[] p = new pangkat20[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("masukkan nilai : ");
            int angka = sc.nextInt();
            System.out.println("masukkan pangkat : ");
            int pangkat = sc.nextInt();
            p[i] = new pangkat20(angka, pangkat);
        }

        System.out.println("Hasil pangkat BF : ");
        for (pangkat20 a : p) {
            System.out.println(a.angka + " ^ " + a.pangkat + " = " + a.pangkatBF());
        }
        System.out.println("Hasil pangkat DC : ");
        for (pangkat20 a : p) {
            System.out.println(a.angka + " ^ " + a.pangkat + " = " + a.pangkatDC(a.angka, a.pangkat));
        }
    }
}
