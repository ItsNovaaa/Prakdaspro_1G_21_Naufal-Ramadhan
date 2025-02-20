package Pertemuan10;
import java.util.Scanner;
public class ArrayNilai21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[10];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan Nilai ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (nilai[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " :  Lulus" );
            } else
                System.out.println("Mahasiswa ke-" + (i + 1) + " : Tidak Lulus");
        }
        
    }
}
