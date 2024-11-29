package Pertemuan11;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double rata;
        int menu;
        int [][] dataResponse = new int [10][6];

        for (int i = 0; i < dataResponse.length; i++) {
            for (int j = 0; j < dataResponse[i].length; j++) {
                dataResponse[i][j] = sc.nextInt();
            }
        }

        System.out.println("Menu : ");
        System.out.println("Menu 1 : Rerata Responden ");
        System.out.println("Menu 2 : Rerata Pertanyaan ");
        System.out.println("Menu 3 : Total Keseluruhan ");
        menu = sc.nextInt();

        switch (menu) {
            case 1 :

                for (int i = 0; i < 10; i++) {
                    double totalPilihan = 0;
                    for (int j = 0; j < 6; j++) {
                        totalPilihan += dataResponse[i][j];
                    }
                    rata = totalPilihan/dataResponse.length;
                    System.out.println("rata rata" + rata);
                }
                break;

            case 2 :
                for (int i = 0; i < 6; i++) {
                    double totalPilihan = 0;
                    for (int j = 0; j < 10; j++) {
                        totalPilihan += dataResponse[j][i];
                    }
                    rata = totalPilihan/dataResponse[i].length;
                    System.out.println("rata rata" + rata);
                }
            break ;
            case 3:
                double totalPilihan = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 10; j++) {
                        totalPilihan += dataResponse[j][i];
                    }
                }
                rata = totalPilihan/60;
                System.out.println("rata rata" + rata);
            break;
        }

    }
}
