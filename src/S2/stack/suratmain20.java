package S2.stack;

import java.util.Scanner;

public class suratmain20 {

    public static void main(String[] args) {
        stackSurat20 stack = new stackSurat20(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Surat");
            System.out.println("2. Jenis Surat");
            System.out.println("3. Surat Terakir");
            System.out.println("4. Cari Surat");
            System.out.println("0. keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();

                    surat20 surat = new surat20(nama, nim, kelas, durasi);
                    stack.push(surat);
                    System.out.printf("Surat %s berhasil dikumpulkan\n", surat.namaMahasiswa);
                    break;

                case 2:
                    surat20 jenis = stack.pop();
                    if (jenis != null) {
                        System.out.println("Pemilik Surat " + jenis.namaMahasiswa);
                        System.out.print("Jenis Surat: ");
                        char Surat = scan.next().charAt(0);
                        scan.nextLine();
                        jenis.MasukkanJenisIzin(Surat);
                        System.out.printf("Surat Dengan Alasan %s berhasil diubah\n", jenis.jenisIzin);
                    }
                    break;
                
                    case 3:
                        surat20 lihat = stack.peek();
                        if (lihat != null) {
                            System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                        }
                        break;

                    case 4:
                        System.out.println("Cari Surat");
                        System.out.print("Nama Surat: ");
                        String namaSurat = scan.nextLine();
                        surat20 cari = stack.Search(namaSurat);
                        if (cari != null) {
                            System.out.println("Surat " + cari.namaMahasiswa + " berhasil dicari");
                        }
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilih >= 1 && pilih <= 4);

            scan.close();
        
    }
    
}
