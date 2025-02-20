package UTS;

import java.util.Scanner;

public class DuaPuluhSatuNaufalRamadhanUts {
    public static void main(String[] args) {
        Scanner naufal = new Scanner(System.in);

        String nama21 ="";
        String alamat21 ="";
        String noHP21 = "";
        int gol21 = 0;
        int masakaerja21 = 0;
        int kehadiran21 = 0;      
        int menu21 = 0;
        String pilihan21;
        double gajiPokok21;
        
        System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN TI - 1G ===");
        System.out.println("Dibuat Oleh : Naufal Ramdhan W");
        System.out.println("Nim : 244107020201");
        do { 
            System.out.println("==================");
            System.out.println("1. Data Karyawan");
            System.out.println("2. Gaji karyawan");
            System.out.println("==================");

            menu21 = naufal.nextInt();
            
            if (menu21 == 1) {
                System.out.println("Masukkan nama Karyawan : ");
                nama21 = naufal.next();
                System.out.println("Masukkan Alamat Karyawan : ");
                alamat21 = naufal.next();
                System.out.println("Masukkan Nomor HP Karyawan : ");
                noHP21 = naufal.next();
                System.out.println("Masukkan Golongan Karyawan : ");
                gol21 = naufal.nextInt();
                System.out.println("Masukkan Masa Kerja Karyawan : ");
                masakaerja21 = naufal.nextInt();
                System.out.println("Masukkan Kehadiran Karyawan : ");
                kehadiran21 = naufal.nextInt();
                
                System.out.println("cetak data karyawan");
                String confirm = naufal.next();
                if (confirm.equalsIgnoreCase("y")) {
                    System.out.println("Data Karyawan : ");
                    System.out.println("nama : "+nama21);
                    System.out.println("alamat :" +alamat21);
                    System.out.println("no hp :" +noHP21);
                    System.out.println("golongan :" +gol21);
                    System.out.println("masakerja :" +masakaerja21);
                    System.out.println("kehadiran :" +kehadiran21);
                }

                System.out.println("Kembali Kemenu (y/n)");
                pilihan21 = naufal.next();
                if (pilihan21.equalsIgnoreCase("n")) {
                    System.out.println("Transaksi Selesai");
                    break;
                }
            }
            else if (menu21 == 2 ) {
                if (nama21.isEmpty()) {
                    System.out.println("Tidak boleh kosong");
                    System.out.println("Kembali Kemenu (y/n)");
                    pilihan21 = naufal.next();
                    if (pilihan21.equalsIgnoreCase("n")) {
                        System.out.println("Transaksi Selesai");
                        break;
                    }
                    continue;
                }
                if (gol21 == 1) {
                    gajiPokok21 = 2000000;
                }else if (gol21 == 2) {
                    gajiPokok21 = 2500000; 
                } else {
                    gajiPokok21 = 3000000;
                }


                double Tunjangan = 0;
                if (masakaerja21 > 8) {
                    Tunjangan = gajiPokok21*0.25;
                } else if (masakaerja21 > 6) {
                    Tunjangan = gajiPokok21*0.2;
                } else if (masakaerja21 > 1) {
                    Tunjangan = gajiPokok21*0.1;
                } else {
                    Tunjangan = 0;
                }

                double Uangkehadiran21 = 0;
                Uangkehadiran21 = 35000*kehadiran21;

                double totalgaji21 = 0 ;
                totalgaji21 = gajiPokok21 + Tunjangan + 21;

                System.err.println("=======================");
                System.err.println("Data karyawan");
                System.err.println("=======================");
                System.err.println("nama" + nama21);
                System.out.println("Gaji : " + gajiPokok21);
                System.err.println("tunjangan : " + Tunjangan);
                System.out.println("Uang makan : " + Uangkehadiran21);
                System.out.println("Total Gaji : " + totalgaji21);
                System.out.println("Kembali Kemenu (y/n)");
                pilihan21 = naufal.next();
                if (pilihan21.equalsIgnoreCase("n")) {
                    System.out.println("Transaksi Selesai");
                    break;
                }
            }
            
            
        } while (true);
    }
}
