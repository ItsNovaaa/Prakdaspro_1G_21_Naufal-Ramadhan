package S2.Kuis;

public class restoclass {
    String name;
    int price;
    int Kode;

    restoclass() {
    
    }
    
    restoclass(String name, int price, int Kode) {
        this.name = name;
        this.price = price;
        this.Kode = Kode;
    }

    void showData() {
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Kode : " + Kode);
    }

    void ubahHarga(int hargaBaru) {
        price = hargaBaru;
    }


    void UbahMenu(String menuBaru) {
        name = menuBaru;
    }
    
    
}
