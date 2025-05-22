package S2.pertemuan11;

import java.util.Scanner;

public class SLL20 {
    public static void main(String[] args) {

        SingleLinkedList20 sll = new SingleLinkedList20();
        Scanner sc = new Scanner(System.in);
        String input;

        // do { 
        //     System.out.println("Masukkan Data Mahasiswa");
        //     System.out.println("NIM");
        //     String nim = sc.nextLine();
        //     System.out.println("Nama");
        //     String nama = sc.nextLine();
        //     System.out.println("Kelas");
        //     String kelas = sc.nextLine();
        //     System.out.println("IPK");
        //     double ipk = sc.nextDouble();
        //     Mahasiswa20 mhs = new Mahasiswa20(nim, nama, kelas, ipk);
        //     sll.addLast(mhs);
        //     System.out.println("Apakah ingin menambahkan data lainnya?(Y/N)");
        //     input = sc.nextLine();
        //     if (input.equalsIgnoreCase("Y")) {
        //         continue;
        //     } else {
        //         break;
        //     }
        // } while (input == "Y");
        Mahasiswa20 mhs4 = new Mahasiswa20("21212203", "Dirga", "4D", 3.6);
        Mahasiswa20 mhs2 = new Mahasiswa20("22212202", "Cintia", "3C", 3.5);
        Mahasiswa20 mhs3 = new Mahasiswa20("23212201", "Bimon", "2B", 3.8);
        Mahasiswa20 mhs1 = new Mahasiswa20("24212200", "Alvaro", "1A", 4.0);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs2);
        sll.insertAt(2, mhs3);
        sll.print();

        System.out.println("Print Data indeks 1");
        sll.getData(1);

        System.out.println("Data Bimon di indeks" + sll.indexOf("Bimon"));

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    
    }
}
