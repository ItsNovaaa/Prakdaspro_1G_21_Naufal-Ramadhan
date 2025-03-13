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
        
        int[] nilaiUTS = new int[nilai.length];
        int[] nilaiUAS = new int[nilai.length];

        for (int i = 0; i < nilai.length; i++) {
            nilaiUTS[i] = nilai[i].nilaiUTS;
            nilaiUAS[i] = nilai[i].nilaiUAS;
        }

        nilai nilaiObj = new nilai("", "", 0, 0, 0);
        
        double tertinggiUTS = nilaiObj.nilaiUTSTertinggi(nilaiUTS, 0, nilaiUTS.length - 1);
        double terendahUTS = nilaiObj.nilaiUTSTerendah(nilaiUTS, 0, nilaiUTS.length - 1);
        double rataUAS = nilaiObj.rata(nilaiUAS, 0, nilaiUAS.length - 1);

        System.out.println("Nilai UTS Tertinggi: " + tertinggiUTS);
        System.out.println("Nilai UTS Terendah: " + terendahUTS);
        System.out.println("Rata-rata Nilai UAS: " + rataUAS);

    }
}
