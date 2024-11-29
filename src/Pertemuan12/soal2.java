package Pertemuan12;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner Nova = new Scanner(System.in);

        double beratBadan;
        double tinggiBadan;
        double imt;
        double tinggiBadanMeter;

        System.out.println("Input Berat Badan");
        beratBadan = Nova.nextDouble();
        System.out.println("Input Berat Badan");
        tinggiBadan = Nova.nextDouble();

        tinggiBadanMeter = tinggiBadan/100;

        imt = beratBadan/(tinggiBadanMeter*tinggiBadanMeter);

        System.out.println("IMT  : " + imt);
        if (imt > 27 ) {
            System.out.println("Obesitas");
        } else if (imt > 25) {
            System.out.println("gemuk");
        } else if (imt > 18.5) {
            System.out.println("normal");
        } else if (imt > 17) {
            System.out.println("kurus");
        } else {
            System.out.println("sangat kurus");
        }
    }
}
