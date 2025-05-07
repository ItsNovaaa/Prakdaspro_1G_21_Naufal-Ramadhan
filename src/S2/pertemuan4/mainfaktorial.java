package S2.pertemuan4;

import java.util.Scanner;

public class mainfaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        faktorial fk = new faktorial();
        System.out.println("masukkan data");
        int n = input.nextInt();
        System.out.println("Nilai faktorial " + n +" menggunakan Faktorial BF : " + fk.faktorialBF(n));
        System.out.println("Nilai faktorial " + n +" menggunakan Faktorial DC : " + fk.faktorialDC(n));
    }
}
