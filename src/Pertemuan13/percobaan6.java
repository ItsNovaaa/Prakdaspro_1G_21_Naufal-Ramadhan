package Pertemuan13;

public class percobaan6 {
    public static void tampilkanHinggaKe(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }    
    }

    public static int jumlah(int bil1, int bil2) {
        return (bil1 + bil2);
    }

    public static void tampiljumlah(int bil1, int bil2) {
        tampilkanHinggaKe(jumlah(bil1,bil2));
    }

    public static void main(String[] args) {
        int temp = jumlah(2,3);
        tampiljumlah(temp, 5);
    }
}
