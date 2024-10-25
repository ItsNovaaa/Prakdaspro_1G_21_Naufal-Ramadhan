package UTS;

import java.util.Scanner;

public class soalBonus {
    public static void main(String[] args) {
        String nim;
        
        Scanner naufal = new Scanner(System.in);
        
        System.out.println("Masukkan NIM:");
        nim = naufal.nextLine();
        char lastChar = nim.charAt(nim.length() - 1);
        int lastDigit = Character.getNumericValue(lastChar);
        if (lastDigit < 5) {
            lastDigit += 5;
        }
        System.out.println("Last digit setelah modifikasi: " + lastDigit);
        String pattern = "";
        for (int i = 0; i < lastDigit; i++) {
            pattern += (char) ('a' + (i % 5));
        }
        
        // Menampilkan pola yang dihasilkan
        System.out.println("Pola yang dihasilkan: " + pattern);
    }
}
