package S2.pertemuan4;

public class nilai {
    public String nama,nim;
    public int nilaiUTS,nilaiUAS,tahunMasuk;

    public nilai(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public static double nilaiUTSTertinggi(int nilaiUTS[],int l,int r){
        if (l==r){
            return nilaiUTS[l];
        }
        int mid = (l+r)/2;
        double lmax = nilaiUTSTertinggi(nilaiUTS,l,mid);
        double rmax = nilaiUTSTertinggi(nilaiUTS,mid+1,r);
        return (lmax > rmax) ? lmax : rmax;
    }

    public static double nilaiUTSTerendah(int nilaiUTS[],int l,int r){
        if (l==r){
            return nilaiUTS[l];
        }
        int mid = (l+r)/2;
        double lmax = nilaiUTSTerendah(nilaiUTS,l,mid);
        double rmax = nilaiUTSTerendah(nilaiUTS,mid+1,r);
        return (lmax < rmax) ? lmax : rmax;
    }

    public static double rata(int nilaiUAS[],int l,int r){
        double hasilAkhir =0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            hasilAkhir = hasilAkhir + nilaiUAS[i];
        }
        return hasilAkhir / (nilaiUAS.length);
    }
}
