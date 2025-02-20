package S2.Pertemuan2;

public class mahasiswa20 {
    class Mahasiswa {
        String nama;
        String nim;
        String kelas;
        double ipk;
        
        void tampilkanInformasi () {
            System.out.println("Nama Mahasiswa : " + nama);
            System.out.println("NIM Mahasiswa : " + nim);
            System.out.println("Kelas Mahasiswa : " + kelas);
            System.out.println("IPK Mahasiswa : " + ipk);
        }
        void ubahKelas (String kelasBaru) {
            kelas = kelasBaru;
        }
        void ubahIpk (double ipkBaru) {
            if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
                ipk = ipkBaru;
            }
            // ipk = ipkBaru;
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
    
}
