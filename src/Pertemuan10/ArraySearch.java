package Pertemuan10;

public class ArraySearch {
    public static void main(String[] args) {
        int [] Nilai = { 80,85,78,96,90,82,86};
         int keySearch = 90;
         int hasil = 0;
         
        for (int i = 0; i < Nilai.length; i++) {
            if ( keySearch == Nilai[i]) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        System.out.println("Nilai " + keySearch + " Di Indeks " + hasil);
        System.out.println(); 
    }
}
