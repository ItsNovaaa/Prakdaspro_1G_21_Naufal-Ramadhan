package S2.CaseMethod;

public class dataMahasiswa {
    Mahasiswacm [] dataMahasiswa = new Mahasiswacm[3];
    penilaiancm [] datapenilaian = new penilaiancm[5];
    matakuliahcm [] datamatakuliah = new matakuliahcm[3];
    int idx;
    int idxMahasiswa = 0;
    int idxMatakuliah = 0;
    int idxPenilaian = 0;

    // For student data
    void tambah(Mahasiswacm p) {
        if (idxMahasiswa < dataMahasiswa.length) {
            dataMahasiswa[idxMahasiswa] = p;
            idxMahasiswa++;
        } else {
            System.out.println("data mahasiswa penuh");       
        }
    }

    // For course data
    void tambahMatakuliah(matakuliahcm p) {
        if (idxMatakuliah < datamatakuliah.length) {
            datamatakuliah[idxMatakuliah] = p;
            idxMatakuliah++;
        } else {
            System.out.println("data matakuliah penuh");       
        }
    }

    // For assessment data
    void tambahPenilaian(penilaiancm p) {
        if (idxPenilaian < datapenilaian.length) {
            datapenilaian[idxPenilaian] = p;
            idxPenilaian++;
        } else {
            System.out.println("data penilaian penuh");       
        }
    }
    void tampilMahasiswa() {
        for ( Mahasiswacm mhs :dataMahasiswa){
            mhs.tampilMahasiswacm();
            System.out.println("----------------------------------------");
        }
    }
    void tampilPenilaian() {
        for ( penilaiancm nilai :datapenilaian){
            nilai.tampilPenilaian();
            System.out.println("----------------------------------------");
        }
    }

    void tampilMatakuliah() {
        for ( matakuliahcm mat :datamatakuliah){
            mat.tampilMatakuliah();
            System.out.println("----------------------------------------");
        }
    }

    void bubleSortNilaiAkhir() {
        for (int i = 0; i < datapenilaian.length; i++) {
            for (int j = 1; j < datapenilaian.length - i; j++) {
                if (datapenilaian[j].nilaiakhir > datapenilaian[j - 1].nilaiakhir) {
                    penilaiancm temp = datapenilaian[j];
                    datapenilaian[j] = datapenilaian[j - 1];
                    datapenilaian[j - 1] = temp;
                }
            }
        }
    }

    void bubleSearchNim(int nim) {
        idx = 0;
        while (idx < dataMahasiswa.length) {
            if (dataMahasiswa[idx] != null && dataMahasiswa[idx].nim.equals(String.valueOf(nim))) {
                dataMahasiswa[idx].tampilMahasiswacm();
                return;
            }
            idx++;
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }
}
