package S2.Pertemuan1;

import java.util.Scanner;

public class percobaan3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String [] namaMatkul = new String[10];
        double [] nilaiMatkul = new double[10];
        String [] nilaiHuruf = new String[10];
        double [] bobotNilai = new double[10];
        int rekapNilai = 0;
        int AkhirIp = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan Nama Matkul : ");
            namaMatkul[i] = sc.nextLine();
            System.out.println("Masukkan Nilai Matkul : ");
            nilaiMatkul[i] = sc.nextDouble();
            sc.nextLine();
            if (nilaiMatkul[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiMatkul[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5 ;
            } else if (nilaiMatkul[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiMatkul[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiMatkul[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiMatkul[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }


        System.out.println("Hasil Konversi Nilai : ");
        System.out.println("Nama Matkul \t\t Nilai Matkul \t\t Nilai Huruf \t\t Bobot Nilai");
        for (int i = 0; i < 10; i++) {
            System.out.println(namaMatkul[i] + "\t\t\t\t" + nilaiMatkul[i] + "\t\t\t" + nilaiHuruf[i] + "\t\t" + bobotNilai[i]);
        }
        for (int i = 0; bobotNilai.length > i; i++) {
            rekapNilai += bobotNilai[i];
            AkhirIp = rekapNilai/ bobotNilai.length;
        }
        System.out.println("IP "  + rekapNilai);
        
    }
}
