package S2.CaseMethod;

public class Mahasiswacm {
    String nama,nim,prodi;

    Mahasiswacm(){
        
    }

    Mahasiswacm(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void tampilMahasiswacm() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
    }
}
