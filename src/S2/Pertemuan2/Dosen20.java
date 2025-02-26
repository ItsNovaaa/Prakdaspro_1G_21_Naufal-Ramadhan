package S2.Pertemuan2;

public class Dosen20 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String BidangKeahlian;

    public Dosen20 () {
    }

    public Dosen20 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.BidangKeahlian = bidangKeahlian;
    }

    void tampilkanDosen () {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + BidangKeahlian);
    }

    void ubahStatusAktif (boolean statusAktifBaru) {
        statusAktif = statusAktifBaru;
    }

    void hitungMasaKerja (int tahunBergabungBaru) {
        tahunBergabung = tahunBergabungBaru - tahunBergabung;
    }

    void ubahBidangKeahlian (String bidangKeahlianBaru) {
        BidangKeahlian = bidangKeahlianBaru;
    }
}
