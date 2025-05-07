package S2.CaseMethod;

public class matakuliahcm {
    String kodeMk,namaMk;
    int sks;

    matakuliahcm(){}

    matakuliahcm(String kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }
    void tampilMatakuliah() {
        System.out.println("Kode : " + kodeMk);
        System.out.println("Nama : " + namaMk);
        System.out.println("SKS : " + sks);
    }
}
