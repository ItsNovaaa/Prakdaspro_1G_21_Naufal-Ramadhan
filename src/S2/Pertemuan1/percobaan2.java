package S2.Pertemuan1;

import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Masukkan Nim : ");
        String nim = Scanner.nextLine();

        String lastDigit = nim.substring(nim.length()-2);
        int lastDigitInt = Integer.parseInt(lastDigit);

        if (lastDigitInt < 10) {
            lastDigitInt += 5;
        }
        
        for (int i = 1; i < lastDigitInt; i++) {
            if ( i % 2 != 0 || i == 6 || i == 10) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
