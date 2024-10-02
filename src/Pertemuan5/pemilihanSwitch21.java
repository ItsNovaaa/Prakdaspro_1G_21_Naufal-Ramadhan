package Pertemuan5;

import java.util.Scanner;

public class pemilihanSwitch21 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan Angka 1:");
        angka1 = Sc.nextDouble();
        System.out.println("Masukkan Angka 2:");
        angka2 = Sc.nextDouble();
        System.out.println("Pilih operator : + - * /");
        operator = Sc.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak ditemukan");
                return;
            }
        System.out.print(angka1 + " " + operator + " " + angka2 + " = " + hasil);
            
    }
}
