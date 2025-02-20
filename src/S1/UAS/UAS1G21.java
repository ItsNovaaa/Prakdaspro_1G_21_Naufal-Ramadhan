//Naufal Ramadhan W - 244107020201 - 1G

package UAS;
import java.util.Scanner;

public class UAS1G21 {
    public static void main(String[] args) {
        
        Scanner input21 = new Scanner(System.in);
        int Menu21;
        int jumlahTim21 = ( 01 % 3) + 4;
        String[] NamaTim21 = new String[jumlahTim21];
        int [][] JumlahSkorTim21 = new int[jumlahTim21][2];
        int [] TotalSkorTim21 = new int[jumlahTim21];
        while (true) {
            NamaMenu();
            System.out.println("Masukkan Pilihan : (1-4)");
            Menu21 = input21.nextInt();
            switch (Menu21) {
                case 1:
                    InputDataSkorTim(jumlahTim21,NamaTim21,JumlahSkorTim21);
                    break;
                case 2:
                    TampilkanTabelSkorTim(NamaTim21,JumlahSkorTim21,jumlahTim21,TotalSkorTim21);
                    break;
                case 3:
                    TentukanJuara(NamaTim21,TotalSkorTim21);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Pilihan yang dimasukkan tidak valid");
            }
        }
    }

    public static void NamaMenu() {
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("1. Input Data Skor Tim");
        System.out.println("2. Tampilkan Tabel Skor Tim");
        System.out.println("3. Tentukan Juara");
        System.out.println("4. Keluar");
    }

    public static void InputDataSkorTim(int jumlahTim,String[] NamaTim21,int[][] JumlahSkorTim21) {
        System.out.println("Input Data Skor Tim");
        System.out.println("=====================");
        for (int i = 0; i < jumlahTim; i++) {
            System.out.print("Nama Tim " + ( i + 1) + " : ");
            NamaTim21[i] = new Scanner(System.in).nextLine();
            if (i > 0 ) {
                if (NamaTim21[i].equals(NamaTim21[i - 1])) {
                    System.out.println("Nama Tim tidak boleh sama");
                    continue;
                }
            }
            for (int j = 0; j < 2; j++) {
                System.out.print("Jumlah Skor Tim " + NamaTim21[i] + " : ");
                JumlahSkorTim21[i][j] = new Scanner(System.in).nextInt();
                if (JumlahSkorTim21[i][j] < 35) {
                    JumlahSkorTim21[i][j] = 0;
                }
            }
        }
        
    }

    public static void TampilkanTabelSkorTim(String[] NamaTim21,int[][] JumlahSkorTim21,int jumlahTim,int[] TotalSkorTim21) {
        System.out.println("Table Skor Turnamen : ");
        System.out.print("Nama Tim \t");
        for (int i = 0; i < 2; i++) {
            System.out.print("Level" + ( i + 1) + "   ");
        }
        System.out.println("Total Skor");
        for (int i = 0; i < jumlahTim; i++) {
            System.out.print("Tim" + NamaTim21[i] + " :  \t");
            for (int j = 0; j < 2; j++) {
                System.out.print( + JumlahSkorTim21[i][j] + "\t ");
                TotalSkorTim21[i] += JumlahSkorTim21[i][j];
                if (JumlahSkorTim21[0][0] > 50) {
                    if (JumlahSkorTim21[i][j] > 50) {
                    TotalSkorTim21[i] = TotalSkorTim21[i] + 21;
                    }
                }
                if (TotalSkorTim21[i] %2 == 0) {
                    TotalSkorTim21[i] = TotalSkorTim21[i] - 15;
                }
            }
            System.out.println(TotalSkorTim21[i]);
            System.out.println();
        }
    }
    public static void TentukanJuara(String [] NamaTim21,int [] totalSkorTim21) {
        // System.out.println("Tentukan Juara : ");
        // System.out.println("================");
        String Ucapan21 = "";
        int terbesar = 0;
        for (int i = 0; i < NamaTim21.length; i++) {
            if (terbesar > totalSkorTim21[i]) {
                terbesar = i;
            } 
            if (totalSkorTim21[terbesar] == totalSkorTim21[i]) {
            Ucapan21 = "Tim Terbaik Adalah Nova";
                System.out.println(Ucapan21);
                break;
            }
        }
        // search value yg sama dengan terbesar
        // ngelooping 
        // namabah value satu variab;e
        // kondisi jika vaariable > 1 
        // dee ngepring ucapan 21
        System.out.println("Juara terbesar : " + NamaTim21[terbesar]);
        
    }
}
