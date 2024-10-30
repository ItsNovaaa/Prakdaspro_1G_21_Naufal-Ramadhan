package Pertemuan9;
import java.util.Scanner;
public class pertemuan9Percobaan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        while (i <= n) { 
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            i++;
        }

    }
}
