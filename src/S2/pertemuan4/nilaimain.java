package S2.pertemuan4;

public class nilaimain {
    public static void main(String[] args) {
        nilai[] nilai = new nilai[8];
        
        nilai[0] = new nilai("Ahmad", "220101001", 2022, 78, 82);
        nilai[1] = new nilai("Budi", "220101002", 2022, 85, 88);
        nilai[2] = new nilai("Cindy", "220101003", 2021, 90, 87);
        nilai[3] = new nilai("Dian", "220101004", 2021, 76, 79);
        nilai[4] = new nilai("Eko", "220101005", 2023, 92, 95);
        nilai[5] = new nilai("Fajar", "220101006", 2020, 88, 85);
        nilai[6] = new nilai("Gina", "220101007", 2023, 80, 83);
        nilai[7] = new nilai("Hadi", "220101008", 2020, 82, 84);

        //mengetahui index
        int nilaiLength = nilai.length;

        //mengetahui nilai UTS dan merubah nilai uts ke array
        int[] nilaiUTS = new int[nilai.length];
        for (int i = 0; i < nilai.length; i++) {
            nilaiUTS[i] = nilai[i].nilaiUTS;
        }

        int[] nilaiUAS = new int[nilai.length];
        for (int i = 0; i < nilai.length; i++) {
            nilaiUAS[i] = nilai[i].nilaiUAS;
        }

        for (nilai a : nilai) {
            System.out.println(a.nilaiUTSTertinggi(nilaiUTS, 0, nilaiLength - 1));
        }

        for (nilai a : nilai) {
            System.out.println(a.nilaiUTSTerendah(nilaiUTS, 0, nilaiLength - 1));
        }

        for (nilai a : nilai) {
            System.out.println(a.rata(nilaiUAS, 0, nilaiLength - 1));
        }
        
    }
}
