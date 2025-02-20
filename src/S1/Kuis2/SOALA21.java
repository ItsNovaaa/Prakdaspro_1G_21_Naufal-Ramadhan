package Kuis2;

import java.util.Scanner;

public class SOALA21 {
    public static void main(String[] args) {
        Scanner Naufal = new Scanner(System.in);
        int[][] TablePegawai21 = new int[5][4];
        String[] bulan21 = {"jan", "Feb", "Mar", "Mei"} ;
        String[] pegawai21 = {"Sito", "Semi", "Vero","Risma", "Barri"} ;
        String [] Bulan21 = new String[4];
        int cuti= 0;
        TablePegawai21[0][0] = 29;
        TablePegawai21[0][1] = 30;
        TablePegawai21[0][2] = 29;
        TablePegawai21[0][3] = 28;
        TablePegawai21[1][0] = 30;
        TablePegawai21[1][1] = 30;
        TablePegawai21[1][2] = 30;
        TablePegawai21[1][3] = 25;
        // TablePegawai21[1][4] = 29;
        TablePegawai21[2][0] = 30;
        TablePegawai21[2][1] = 0;
        TablePegawai21[2][2] = 28;
        TablePegawai21[2][3] = 27;
        // TablePegawai21[2][4] = 28;
        TablePegawai21[3][0] = 30;
        TablePegawai21[3][1] = 30;
        TablePegawai21[3][2] = 30;
        TablePegawai21[3][3] = 0;
        // TablePegawai21[3][4] = 27;
        TablePegawai21[4][0] = 0;
        TablePegawai21[4][1] = 29;
        TablePegawai21[4][2] = 28;
        TablePegawai21[4][3] = 27;
        // TablePegawai21[3][4] = 27;


        int Pilmen21;
        while (true) { 
            System.out.println("Menu :");
            System.out.println(" 1. Tampilkan Daftar Hadir:");
            System.out.println(" 2. Tampilkan Potongan Gaji dan total:");
            Pilmen21 = Naufal.nextInt();
            switch (Pilmen21) {
                case 1:
                for(int i = 0; i < TablePegawai21.length; i++){
                    for(int j = 0; j < TablePegawai21[i].length; j++){
                        if (TablePegawai21[i][j] == 0) {
                            System.out.print(bulan21[j]);
                            if (i == 4 && j == 0) {
                                System.out.print("Sito " + " ");
                            }
                            
                            System.out.print("Cuti" + " ");
                            cuti++;
                        } else {
                            if (i == 0 && j == 0) {
                                System.out.print("Semi" + " ");
                            }
                            if (i == 1 && j == 0) {
                                System.out.print("Risma" + " ");
                            }
                            if (i == 2 && j == 0) {
                                System.out.print("Vero" + " ");
                            }
                            if (i == 3 && j == 0) {
                                System.out.print("Barri" + " ");
                            }
                            System.out.print(TablePegawai21[i][j] + " ");
                        }
                    }   
                    System.out.println();
                }
                System.out.println("Cuti  : " + cuti);
                break;
                case 2:
                    System.out.println("Potongan Gaji");
                    for(int i = 0; i < TablePegawai21.length; i++){
                        for(int j = 0; j < TablePegawai21[i].length; j++){
                            double GajiPotong;
                            if (TablePegawai21[i][j] == 0) {
                                if (i == 4 && j == 0) {
                                    System.out.print("Sito " + " ");
                                }
                                System.out.print("Cuti" + " ");
                            } else if (TablePegawai21[i][j] < 30) {
                                if (i == 0 && j == 0) {
                                    System.out.print("Semi" + " ");
                                }
                                if (i == 1 && j == 0) {
                                    System.out.print("Risma" + " ");
                                }
                                if (i == 2 && j == 0) {
                                    System.out.print("Vero" + " ");
                                }
                                if (i == 3 && j == 0) {
                                    System.out.print("Barri" + " ");
                                }
                                GajiPotong = ((30 - TablePegawai21[i][j]) * 2500);
                                System.out.print(GajiPotong + " ");
                            } else if (TablePegawai21[i][j] == 30) {
                                if (i == 0 && j == 0) {
                                    System.out.print("Semi" + " ");
                                }
                                if (i == 1 && j == 0) {
                                    System.out.print("Risma" + " ");
                                }
                                if (i == 2 && j == 0) {
                                    System.out.print("Vero" + " ");
                                }
                                if (i == 3 && j == 0) {
                                    System.out.print("Barri" + " ");
                                }
                                System.out.print("0 ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
    }
}
