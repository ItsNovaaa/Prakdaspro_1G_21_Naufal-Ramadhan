package Pertemuan13;

public class PengunjungCafe21 {
    public static void main(String[] args) {
        daftarPengunjung("ali","budi","cici");
    }
    
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Pengunjung Cafe:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("-" + namaPengunjung[i]);
        }
    }
}
