package S2.stack;

public class surat20 {

    String nim;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public surat20(String namaMahasiswa, String nim, String kelas, int durasi) {
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
        this.kelas = kelas;
        this.durasi = durasi;
        this.jenisIzin = jenisIzin;
    }

    public void MasukkanJenisIzin(char jenisIzin) {
        this.jenisIzin = jenisIzin;
    }
}
