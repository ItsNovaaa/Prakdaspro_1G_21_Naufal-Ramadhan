package S2.pertemuan4;

public class pangkat20 {
    public int angka,pangkat;

    public pangkat20(){  
    }

    public pangkat20(int n, int p){
        angka = n;
        pangkat = p;
    }

    int pangkatBF(){
        int hasil = 1;
        for (int i = 0; i < this.pangkat; i++) {
            hasil = hasil * this.angka;
        }
        return hasil;
    }

    int pangkatDC(int a,int n){ 
        if (n==1){
            return a;
        } else {
            if (n%2==1){
                return (pangkatDC(a,n/2 )*pangkatDC(a,n/2)*a);
            } else {
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
            }
        }
    }
}

