package S2.pertemuan4;

public class nilaimain {
    public static void main(String[] args) {
        nilai[] Data = new nilai[8];
        
        Data[0] = new nilai("Ahmad", "220101001", 2022, 78, 82);
        Data[1] = new nilai("Budi", "220101002", 2022, 85, 88);
        Data[2] = new nilai("Cindy", "220101003", 2021, 90, 87);
        Data[3] = new nilai("Dian", "220101004", 2021, 76, 79);
        Data[4] = new nilai("Eko", "220101005", 2023, 92, 95);
        Data[5] = new nilai("Fajar", "220101006", 2020, 88, 85);
        Data[6] = new nilai("Gina", "220101007", 2023, 80, 83);
        Data[7] = new nilai("Hadi", "220101008", 2020, 82, 84);
        
        int[] nilaiUTS = new int[Data.length];
        int[] nilaiUAS = new int[Data.length];

        for (int i = 0; i < Data.length; i++) {
            nilaiUTS[i] = Data[i].nilaiUTS;
            nilaiUAS[i] = Data[i].nilaiUAS;
        }

        double tertinggiUTS = nilai.nilaiUTSTertinggi(nilaiUTS, 0, nilaiUTS.length - 1);
        double terendahUTS = nilai.nilaiUTSTerendah(nilaiUTS, 0, nilaiUTS.length - 1);
        double rataUAS = nilai.rata(nilaiUAS, 0, nilaiUAS.length - 1);

        System.out.println("Nilai UTS Tertinggi: " + tertinggiUTS);
        System.out.println("Nilai UTS Terendah: " + terendahUTS);
        System.out.println("Rata-rata Nilai UAS: " + rataUAS);

    }
}
