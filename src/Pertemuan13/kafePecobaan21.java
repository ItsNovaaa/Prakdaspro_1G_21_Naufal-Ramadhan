package Pertemuan13;

public class kafePecobaan21 {
    public static void main(String[] args) {
        menu("Andi", true);
    }   
    public static void menu(String namaPelanggan , boolean member) {

    if (member) {
        System.out.println("Selamat datang, " + namaPelanggan + " Anda adalah member.");
    } 
    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam – Rp 15,000");
    System.out.println("2. Cappuccino – Rp 20,000");
    System.out.println("3. Latte – Rp 22,000");
    System.out.println("4. Teh Tarik – Rp 12,000");
    System.out.println("5. Roti Bakar – Rp 10,000");
    System.out.println("6. Mie Goreng – Rp 18,000");
    System.out.println("===========================");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
}