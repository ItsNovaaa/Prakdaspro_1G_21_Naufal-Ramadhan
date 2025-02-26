package S2.Pertemuan2;

public class Dosen21Main {
    public static void main(String[] args) {
        Dosen20 ds1 = new Dosen20 ("D1", "Dosen 1", true, 2021, "BI");
        ds1.tampilkanDosen();
        ds1.ubahStatusAktif(false);
        ds1.hitungMasaKerja(2020);
        ds1.ubahBidangKeahlian("BING");
        ds1.tampilkanDosen();

        Dosen20 ds2 = new Dosen20 ("D1", "Dosen 2", true, 2021, "C++");
        ds2.tampilkanDosen();
        ds2.ubahStatusAktif(false);
        ds2.hitungMasaKerja(2020);
        ds2.ubahBidangKeahlian("PHP");
        ds2.tampilkanDosen();
    }
}
