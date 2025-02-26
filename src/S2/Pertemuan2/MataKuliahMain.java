package S2.Pertemuan2;

public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah ("MK1", "Mata Kuliah 1", 22, 10);
        mk1.tampilkanMataKuliah();
        mk1.ubahSks(22);
        mk1.TambahJam(2);
        mk1.KurangiJam(2);
        mk1.tampilkanMataKuliah();

        MataKuliah mk2 = new MataKuliah ("mk2", "Mata Kuliah 2", 45, 10);
        mk2.tampilkanMataKuliah();
        mk2.ubahSks(22);
        mk2.TambahJam(2);
        mk2.KurangiJam(2);
        mk2.tampilkanMataKuliah();
    }
}
