package S2.pertemuan10;

import java.util.Scanner;

public class Siakad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueMahasiswa20 Q = new QueueMahasiswa20(30);
        int pilih;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Data Terakhir dalam Antrian");
            System.out.println("7. Jumlah Antrian yang telah Dilayani");
            System.out.println("8. Jumlah mahasiswa yang belum Dilayani");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi     : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas     : ");
                    String kelas = sc.nextLine();
                    krsMahasiswa20 mhs = new krsMahasiswa20(nim, nama, prodi, kelas);
                    Q.tambahAntrian(mhs);
                    break;
                case 2:
                for (int i = 0; i < 2; i++) {
                    krsMahasiswa20 dilayani = Q.layaniMahasiswa();
                
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                }
                    break;
                case 3:
                    Q.lihatTerdepan();
                    break;
                case 4:
                    Q.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + Q.getJumlahAntrian());
                    break;
                case 6:
                    System.out.println("Data terakhir dalam antrian: ");
                    Q.getLast();
                    break;
                case 7:
                    System.out.println("Jumlah Antrian yang telah Dilayani : " + Q.GetAcc());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang belum Dilayani: " + Q.getNotAcc());
                    break;
                case 9:
                    Q.clear();
                    System.out.println("Antrian berhasil dikosongkan.");
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);    
        sc.close();
    }
}
