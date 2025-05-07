package S2.CaseMethod;

public class penilaiancm {

    Mahasiswacm mahasiwa;
    matakuliahcm matakuliah;
    double tugas,uts,uas,nilaiakhir;

    penilaiancm(Mahasiswacm m, matakuliahcm mk, double t, double u, double a) {
        mahasiwa = m;
        matakuliah = mk;
        tugas = t;
        uts = u;
        uas = a;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir() {
        nilaiakhir = ((0.3 * tugas) + (0.3 * uts) + (0.4 * uas));
    }

    void tampilPenilaian() {
        System.out.println("Nama Mahasiswa : " + mahasiwa.nama);
        System.out.println("Mata Kuliah : " + matakuliah.namaMk);
        System.out.println("Nilai Akhir : " + nilaiakhir);
    }
    
}
