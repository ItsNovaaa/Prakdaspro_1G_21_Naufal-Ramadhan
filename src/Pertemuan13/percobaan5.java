package Pertemuan13;

public class percobaan5 {
    public static void main(String[] args) {
        scanner sc = new scanner(System.in);
        int p,l,t;
        int luas;
        int volume;


        System.out.print("Masukkan Panjang : ");
        p = sc.nextInt();
        System.out.print("Masukkan Lebar : "); 
        l = sc.nextInt();
        System.out.print("Masukkan Tinggi : "); 
        t = sc.nextInt();

        luas = luasPersegi(p,l);
        volume = volume(p,l,t);
        System.out.println("Volume = "+volume);  
        System.out.println("Luas = " + luas);


    }

    public static int luasPersegi(int p,int l) {
        int luas = p*l;
        return luas;
    }

    public static int volume(int p,int l,int t) {
        int volume = p*l*t;

        
        return volume;
    }
}