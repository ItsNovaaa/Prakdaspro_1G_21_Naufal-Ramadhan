package Pertemuan5;

import java.util.Scanner;

public class pemilihanOperator21 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.println("Masukkan Angka 1:");
        angka1 = Sc.nextDouble();
        System.out.println("Masukkan Angka 2:");
        angka2 = Sc.nextDouble();
        System.out.println("Pilih operator : + - * /");
        operator = Sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;

        } else if (operator == '-') {
            hasil = angka1 - angka2;
            
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            
        } else if (operator == '/') {
            hasil = angka1 / angka2;    
            
        } else {
            System.out.println("Operator tidak ditemukan");
        } 
        System.out.print(angka1 + " " + operator + " " + angka2 + " = " + hasil);
            
    }
}