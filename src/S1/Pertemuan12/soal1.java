package Pertemuan12;

public class soal1 {
    public static void main(String[] args) {
        
        double gajiPokok ;
        double tunjangan ;
        double pajak;
        double gajiBersih;
        double gajiTotal;

        gajiPokok = 2000000;
        tunjangan = gajiPokok + 55000;
        pajak = 0.05;
        gajiBersih = gajiPokok - (gajiPokok * pajak);
        gajiTotal = gajiBersih + tunjangan;

        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Paj ak : " + pajak);
        System.out.println("Gaji Bersih : " + gajiBersih);
        System.out.println("Gaji Total : " + gajiTotal);
    }
}
