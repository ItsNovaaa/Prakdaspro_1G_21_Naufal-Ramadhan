package S2.pertemuan11;

public class Queue {
    public static void main(String[] args) {
     System.out.println("layanan Mahasiswa");
     int kapasitasAntrian = 5;
     QueueLinkedList antrianLayanan = new QueueLinkedList(kapasitasAntrian);

     Maha20 mhs1 = new Maha20("21212203", "Dirga", "Mengurus Surat");
     Maha20 mhs2 = new Maha20("22212202", "Cintia", "Mengurus Surat");
     Maha20 mhs3 = new Maha20("23212201", "Bimon", "Mengurus Surat");
     Maha20 mhs4 = new Maha20("24212200", "Alvaro", "Mengurus Surat");

     boolean full = antrianLayanan.isFull();
     if (full) {
         System.out.println("Antrian penuh");
     } else {
         System.out.println("Antrian tidak penuh");
     }
     boolean empty = antrianLayanan.isEmpty();
     if (empty) {
         System.out.println("Antrian kosong");
     } else {
         System.out.println("Antrian tidak kosong");
     }

     antrianLayanan.clear();

     antrianLayanan.enqueue(mhs1);
     antrianLayanan.enqueue(mhs2);
     antrianLayanan.enqueue(mhs3);
     antrianLayanan.enqueue(mhs4);

     antrianLayanan.displayQueue();

     antrianLayanan.peekFront();
     antrianLayanan.peekRear();

     int size = antrianLayanan.getSize();
    }
    
}
