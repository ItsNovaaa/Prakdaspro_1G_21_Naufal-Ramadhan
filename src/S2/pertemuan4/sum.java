package S2.pertemuan4;

public class sum {

    double keuntungan [];
    
    sum (int el) {
        keuntungan = new double[el];
    }

    double totalBF () {
        double jumlah = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            jumlah = jumlah + keuntungan[i];
        }
        return jumlah;
    }

    double totalDC (double arr[],int l , int r) {
        if (l == r){
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);
        return lsum + rsum ;
    }
}
