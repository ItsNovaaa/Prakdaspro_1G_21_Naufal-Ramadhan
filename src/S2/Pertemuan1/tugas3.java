package S2.Pertemuan1;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan jumlah Mata Kuliah : ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();

        String[] namaKuliah = new String[jumlahMataKuliah];
        double[] sks = new double[jumlahMataKuliah];
        double[] semester = new double[jumlahMataKuliah];
        String[] hariKuliah = new String[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("masukkan nama kuliah : ");
            namaKuliah[i] = sc.nextLine();
            System.out.println("masukkan sks kuliah : ");
            sks[i] = sc.nextDouble();
            System.out.println("masukkan semester kuliah : ");
            semester[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println("masukkan hari kuliah : ");
            hariKuliah[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("1. Tampilkan Data Kuliah");
            System.out.println("2. Cari Hari Kuliah");
            System.out.println("3. Cari Berdasar Semester");
            System.out.println("4. Cari Berdasar Matkul");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    tampilkanKuliah(namaKuliah, sks, semester, hariKuliah, jumlahMataKuliah);
                    break;
                case 2:
                    cariHariKuliah(sc, namaKuliah, sks, semester, hariKuliah, jumlahMataKuliah);
                    break;
                case 3:
                    cariBerdasarSemester(sc, namaKuliah, sks, semester, hariKuliah, jumlahMataKuliah);
                    break;
                case 4:
                    cariBerdasarMatkul(sc, namaKuliah, sks, semester, hariKuliah, jumlahMataKuliah);
                    break;
                case 5:
                    System.out.println("Transaksi Selesai");
                    break;
            }
        }

    }

    public static void tampilkanKuliah(String[] namaKuliah, double[] sks, double[] semester, String[] hariKuliah,
            int jumlahMataKuliah) {
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Nama Kuliah : " + namaKuliah[i]);
            System.out.println("SKS : " + sks[i]);
            System.out.println("Semester : " + semester[i]);
            System.out.println("Hari : " + hariKuliah[i]);
        }
    }

    public static void cariHariKuliah(Scanner sc, String[] namaKuliah, double[] sks, double[] semester,
            String[] hariKuliah, int jumlahMataKuliah) {
                sc.nextLine();
        System.out.println("cari hari kuliah : ");
        String hari = sc.nextLine();
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (hari.equalsIgnoreCase(hariKuliah[i])) {
                System.out.println("Nama Kuliah : " + namaKuliah[i]);
                System.out.println("SKS : " + sks[i]);
                System.out.println("Semester : " + semester[i]);
                System.out.println("Hari : " + hariKuliah[i]);
            }
        }
    }

    public static void cariBerdasarSemester(Scanner sc, String[] namaKuliah, double[] sks, double[] semester,
            String[] hariKuliah, int jumlahMataKuliah) {
        System.out.println("Cari berdasar Semester : ");
        double semesterBerdasar = sc.nextDouble();
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (semesterBerdasar == semester[i]) {
                System.out.println("Nama Kuliah : " + namaKuliah[i]);
                System.out.println("SKS : " + sks[i]);
                System.out.println("Semester : " + semester[i]);
                System.out.println("Hari : " + hariKuliah[i]);
            }
        }
    }

    public static void cariBerdasarMatkul(Scanner sc, String[] namaKuliah, double[] sks, double[] semester,
            String[] hariKuliah, int jumlahMataKuliah) {
                sc.nextLine();
        System.out.println("cari berdasar Matkul : ");
        String matkul = sc.nextLine();
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (matkul.equalsIgnoreCase(namaKuliah[i])) {
                System.out.println("Nama Kuliah : " + namaKuliah[i]);
                System.out.println("SKS : " + sks[i]);
                System.out.println("Semester : " + semester[i]);
                System.out.println("Hari : " + hariKuliah[i]);
            }
        }
    }
}
