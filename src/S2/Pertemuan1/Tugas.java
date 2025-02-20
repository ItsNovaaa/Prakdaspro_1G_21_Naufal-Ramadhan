package S2.Pertemuan1;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] Kode = {'A','B','D','E','F','G','H','L','N','T'};
        char [][] Kota = {
            {'B','A','N','T','E','N' },
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        System.out.println("input kode kota");
        String search = sc.nextLine();
        System.out.println(search);

        for (int i = 0; i < Kota.length; i++) {
            if (search.equalsIgnoreCase(String.valueOf(Kode[i]))) {
                System.out.println(Kota[i]);
                // break;
            }
        }
    }
}
