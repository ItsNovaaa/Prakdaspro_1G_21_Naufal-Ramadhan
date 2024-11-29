package Pertemuan13;

public class tugas1 {
    public static void main(String[] args) {
        scanner sc = new scanner(System.in);
        int s;
        int luasPermukaan;
        int volume;


        System.out.print("Masukkan Panjang : ");
        s = sc.nextInt();

        luasPermukaan = luasPersegi(s);
        volume = volume(s);
        System.out.println("Volume = "+volume);  
        System.out.println("Luas = " + luasPermukaan);
    }

    public static int luasPersegi(int s) {
        int luas = s*s*6;
        return luas;
    }

    public static int volume(int s) {
        int volume = s*s*s;

        
        return volume;
    }
}
