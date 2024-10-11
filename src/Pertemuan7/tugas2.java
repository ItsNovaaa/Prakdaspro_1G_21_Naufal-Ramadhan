package Pertemuan7;
import  java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis;
        int durasi;
        int total = 0;

        
        do { 
            System.out.println("Masukkan jenis : ");
            jenis = input.nextInt();
            if(jenis == 1 || jenis == 2) {
                System.err.println("Masukkan Durasi");
                durasi = input.nextInt();
                if (durasi > 5 ) {
                    total += 12500;
                    System.err.println("Print Total : " + total);
                } else if (jenis == 1 ) {
                    total += durasi * 3000;
                    System.err.println("Print Total : " + total);

                } else if (jenis == 2) {
                    total += durasi * 2000;
                    System.err.println("Print Total : " + total);
                }
            } else if (jenis == 0) {
                System.err.println("Transaksi Selesai");
                break;
            }
        } while (true);
    }
}
