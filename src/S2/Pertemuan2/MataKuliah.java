package S2.Pertemuan2;

public class MataKuliah {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah () {

    }

    public MataKuliah (String kodeMk, String namaMk, int sksMk, int jumlahJamMk) {
        this.kodeMk = kodeMk;
        this.nama = namaMk;
        this.sks = sksMk;
        this.jumlahJam = jumlahJamMk;
    }

    void tampilkanMataKuliah () {
        System.out.println("Kode Mata Kuliah : " + kodeMk);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Sks Mata Kuliah : " + sks);
        System.out.println("Jumlah Jam Mata Kuliah : " + jumlahJam);
    }

    void ubahSks (int sksBaru) {
        sks = sksBaru;
    }

    void TambahJam (int jumlahJamBaru) {
        jumlahJam = jumlahJam + jumlahJamBaru;
    }
    
    void KurangiJam (int jumlahJamBaru) {
        if (jumlahJamBaru <= jumlahJam) {
            jumlahJam = jumlahJam - jumlahJamBaru;
        } else {
            System.out.println("Tidak dapat kurangi jam");
        }
    }
}
