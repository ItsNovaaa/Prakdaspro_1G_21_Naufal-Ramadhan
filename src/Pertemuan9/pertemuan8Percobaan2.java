package Pertemuan9;
import java.util.Scanner;
public class pertemuan8Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai N : ");
        int N = input.nextInt();
        for(int i=1; i<=N;){
            for(int j=1; j<=N;){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }    
}
