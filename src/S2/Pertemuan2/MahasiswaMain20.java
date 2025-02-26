package S2.Pertemuan2;

// import S2.Pertemuan2.mahasiswa20.Mahasiswa;

public class MahasiswaMain20 {
 public static void main(String[] args) {
    Mahasiswa20 mhs1 = new Mahasiswa20 () ;
    mhs1.nama = "Naufal Ramadhan";
    mhs1.nim = "2241720171";
    mhs1.kelas = "S1 2J";
    mhs1.ipk = 3.5;

    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("S1 2K");
    mhs1.updateIpk(3.60);
    mhs1.tampilkanInformasi();

    Mahasiswa20 mhs2 = new Mahasiswa20 ("Anisa Nabila", "2141720160", "TI 2L", 3.5);
    mhs2.updateIpk(3.30);
    mhs2.tampilkanInformasi();

    Mahasiswa20 mhsNova = new Mahasiswa20 ("Noor", "2141720160", "TI 2L", 3.5);
    System.out.println(mhsNova.nilaiKinerja());
    }
}
