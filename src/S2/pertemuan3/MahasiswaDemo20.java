package S2.pertemuan3;

import java.util.Scanner;

public class MahasiswaDemo20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dummy;

        Mahasiswa20 [] arrayOfMahasiswa = new Mahasiswa20[3];
        arrayOfMahasiswa[0] = new Mahasiswa20 ();
        arrayOfMahasiswa[0].nim = "2440123010201";
        arrayOfMahasiswa[0].nama = "Agnes Titania";
        arrayOfMahasiswa[0].kelas = "SIB";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa20 ();
        arrayOfMahasiswa[1].nim = "2441123111211";
        arrayOfMahasiswa[1].nama = "Agnes Titania";
        arrayOfMahasiswa[1].kelas = "SIB";
        arrayOfMahasiswa[1].ipk = (float) 3.75;

        arrayOfMahasiswa[2] = new Mahasiswa20 ();
        arrayOfMahasiswa[2].nim = "2442123212221";
        arrayOfMahasiswa[2].nama = "Agnes Titania";
        arrayOfMahasiswa[2].kelas = "SIB";
        arrayOfMahasiswa[2].ipk = (float) 3.75;

        System.out.println("nim  : " + arrayOfMahasiswa[0].nim);
        System.out.println("nama  : " + arrayOfMahasiswa[0].nama);
        System.out.println("kelas : " + arrayOfMahasiswa[0].kelas);
        System.out.println("ipk   : " + arrayOfMahasiswa[0].ipk);

        System.out.println("nim  : " + arrayOfMahasiswa[1].nim);
        System.out.println("nama  : " + arrayOfMahasiswa[1].nama);
        System.out.println("kelas : " + arrayOfMahasiswa[1].kelas);
        System.out.println("ipk   : " + arrayOfMahasiswa[1].ipk);

        System.out.println("nim  : " + arrayOfMahasiswa[2].nim);
        System.out.println("nama  : " + arrayOfMahasiswa[2].nama);
        System.out.println("kelas : " + arrayOfMahasiswa[2].kelas);
        System.out.println("ipk   : " + arrayOfMahasiswa[2].ipk);
    }
}
