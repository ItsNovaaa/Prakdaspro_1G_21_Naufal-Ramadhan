package S2.CaseMethod;

import java.util.Scanner;

public class maincm {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    dataMahasiswa nw = new dataMahasiswa();

    Mahasiswacm mhs1 = new Mahasiswacm("Ali Rahman", "22001", "Informatika");
    Mahasiswacm mhs2 = new Mahasiswacm("Budi Santoso ", "22002", "Informatika");
    Mahasiswacm mhs3 = new Mahasiswacm("Citra Dewi ", "22003", "Sistem Informasi Bisnis");

    matakuliahcm mk1 = new matakuliahcm("MK001", "Struktur Data", 3);
    matakuliahcm mk2 = new matakuliahcm("MK002", "Basis Data ", 3);
    matakuliahcm mk3 = new matakuliahcm("MK003", "Desain Web", 3);

    penilaiancm pen = new penilaiancm(mhs1, mk1, 80, 85, 90);
    penilaiancm pen2 = new penilaiancm(mhs2, mk1, 75, 70, 80);
    penilaiancm pen3 = new penilaiancm(mhs3, mk3, 80, 90, 65);
    penilaiancm pen4 = new penilaiancm(mhs1, mk2, 60, 75, 70);
    penilaiancm pen5 = new penilaiancm(mhs3, mk2, 85, 90, 95);


    nw.tambahMatakuliah(mk1);
    nw.tambahMatakuliah(mk2);
    nw.tambahMatakuliah(mk3);

    nw.tambahPenilaian(pen);
    nw.tambahPenilaian(pen2);
    nw.tambahPenilaian(pen3);
    nw.tambahPenilaian(pen4);
    nw.tambahPenilaian(pen5);

    nw.tambah(mhs1);
    nw.tambah(mhs2);
    nw.tambah(mhs3);

    while (true) {
        System.out.println("=== MENU SISTEM AKADEMIK ===");
        System.out.println("1. Tampilakan Data Mahasiswa");
        System.out.println("2. Tampilkan Data Matakuliah");
        System.out.println("3. Tampilkan Data Penilaian");
        System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
        System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("0. Keluar");
        System.out.print("Pilih Menu: ");
        int menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                nw.tampilMahasiswa();
                break;
            case 2:
                nw.tampilMatakuliah();
                break;
            case 3:
                System.out.println("Data Penilaian:");
                System.out.println("========================================");
                nw.tampilPenilaian();
                break;
            case 4:
                nw.bubleSortNilaiAkhir();
                System.out.println("Data Mahasiswa setelah diurutkan berdasarkan nilai akhir:");
                nw.tampilPenilaian();
                break;
            case 5:
                System.out.print("Masukkan NIM yang dicari: ");
                int nim = sc.nextInt();
                System.out.println("Data Mahasiswa dengan NIM " + nim + ":" );
                nw.bubleSearchNim(nim);
                break;
            case 0:
                System.out.println("Keluar dari program.");
                sc.close();
                return;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

    }    
}

















































































// Mahasiswacm maha [] = {
//     new Mahasiswacm("Ali Rahman", "22001", "Informatika")
// };

