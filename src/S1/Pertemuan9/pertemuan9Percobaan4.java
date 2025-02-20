package Pertemuan9;
import java.util.Scanner;
public class pertemuan9Percobaan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        float nilai;
        float totalNilai;
        float rataNilai;

        i =1;
        while(i<=5){
            System.out.println("Input Nilai Mahasiswa " + i  + " :");
            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("Masukkan nilai ke-"+j+": ");
                nilai = sc.nextFloat();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-nilai ke-"+i+": "+rataNilai);
            i++;
        }
    }
}
