package S2.Pertemuan1;

import java.util.Scanner;

public class percobaan1 {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        String nilaiHuruf;
        String kelulusan;
        System.out.println("Masukkan Nilai Tugas : ");
        int nilaiTugas = sc.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("input data error");
            System.exit(0);
        }
        System.out.println("Masukkan Nilai Kuis : ");
        int nilaiPenilaian = sc.nextInt();
        if (nilaiPenilaian < 0 || nilaiPenilaian > 100) {
            System.out.println("input data error");
        }
        System.out.println("Masukkan Nilai Uts : ");
        int nilaiUts = sc.nextInt();
        if (nilaiUts < 0 || nilaiUts > 100) {
            System.out.println("input data error");
        }
        System.out.println("Masukkan Nilai Uas : ");        
        int nilaiUas = sc.nextInt();
        if (nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("input data error");
        }
        double nilaiTotal = (
            nilaiTugas * 2/10 + nilaiPenilaian * 2/10 + nilaiUts * 3/10 + nilaiUas * 3/10)  ;
        System.out.println(nilaiTotal);

        if (nilaiTotal > 80 ) {
            nilaiHuruf = ("A");
        } else if (nilaiTotal > 73) {
            nilaiHuruf = ("B+");
        } else if (nilaiTotal > 65) {
            nilaiHuruf = ("B");
        } else if (nilaiTotal > 60) {
            nilaiHuruf = ("C+");
        } else if (nilaiTotal > 50) {
            nilaiHuruf = ("C");
        } else if (nilaiTotal > 39) {
            nilaiHuruf = ("D");
        } else {
            nilaiHuruf = ("E");
        }

        switch (nilaiHuruf) {
            case "D" :
                kelulusan = "Tidak LULUS";
                break;
            case "E" : 
                kelulusan = "Tidak LULUS";
            default:
                kelulusan = "LULUS";
        }
        System.out.println("Total nilai : " + nilaiTotal);
        System.out.println("Nilai Huruf : " + nilaiHuruf );
        System.out.println("Kelulusan : " + kelulusan);
    }
}
