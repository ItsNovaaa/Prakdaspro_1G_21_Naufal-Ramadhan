package S2.pertemuan10;

public class krsMahasiswa20 {
        String nim;
        String nama;
        String prodi;
        String kelas;
    
        public krsMahasiswa20(String nim, String nama, String prodi, String kelas) {
            this.nim = nim;
            this.nama = nama;
            this.prodi = prodi;
            this.kelas = kelas;
        }
    
        public void tampilkanData() {
            System.out.println(nim + " " + nama + " " + prodi + " " + kelas);
        }
}
