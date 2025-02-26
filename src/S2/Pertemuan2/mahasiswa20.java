package S2.Pertemuan2;

public class Mahasiswa20 {
        String nama;
        String nim;
        String kelas;
        double ipk;

        public Mahasiswa20 () {

        }

        public Mahasiswa20 (String nm, String nim, String kls, double ipk) {
            nama = nm;
            this.nim = nim;
            this.ipk = ipk;
            kelas = kls;
        }
        
        void tampilkanInformasi () {
            System.out.println("Nama Mahasiswa : " + nama);
            System.out.println("NIM Mahasiswa : " + nim);
            System.out.println("Kelas Mahasiswa : " + kelas);
            System.out.println("IPK Mahasiswa : " + ipk);
        }
        void ubahKelas (String kelasBaru) {
            kelas = kelasBaru;
        }
        void updateIpk (double ipkBaru) {
            if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
                ipk = ipkBaru;
            }
        }
        String nilaiKinerja () {
            if (ipk >= 3.5) {
                return "kinerja sangat baik";
            }
            else if (ipk >= 3.0) {
                return "kinerja baik";
            }
            else if (ipk >= 2.0) {
                return "kinerja cukup";
            }
            else {
                return "kinerja kurang";
            }
            
        }
    }
    

