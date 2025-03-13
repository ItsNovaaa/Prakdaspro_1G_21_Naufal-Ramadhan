package S2.pertemuan4;

import java.util.Scanner;

public class mainsum {
    public static void main(String[] args) {
        // sum s = new sum(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan jumlah elemen : ");
        int elemen = sc.nextInt();
        sum s = new sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.println("masukkan angka : ");
            double angka = sc.nextDouble();
            s.keuntungan[i] = angka;
        }
        System.out.println("hasil total BF : " + s.totalBF());
        System.out.println("hasil total DC : " + s.totalDC(s.keuntungan, 0, s.keuntungan.length - 1));
    }
    
}
