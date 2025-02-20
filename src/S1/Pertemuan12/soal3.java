package Pertemuan12;

import java.util.Random;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random Random = new Random();

        int nilaiTebakan;
        int randomNumb = Random.nextInt(99);

        while (true) {
            System.out.println("Masukkan Nilai Tebakan : ");
            nilaiTebakan = input.nextInt();

            if (nilaiTebakan == randomNumb) {
                System.out.println("Selamat Anda Menang");
                break;
            } else {
                System.out.println("Anda Coba lagi HEHEHHEHEHEHE");
                input.nextLine();
                
            }
        }
    }
}
