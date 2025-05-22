package S2.pertemuan10;

public class QueueMahasiswa20 {
    krsMahasiswa20[] data;
    int front; 
    int rear;
    int size;
    int max;
    int acc;

    public QueueMahasiswa20(int max) {
        this.max = max;
        this.data = new krsMahasiswa20[max];
        this.size = 0;
        this.front = 0; 
        this.rear = -1; 
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.printf("%-5s %-10s %-20s %-10s %-10s\n", "No.", "NIM", "NAMA", "PRODI", "KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.printf("%-5d ", (i + 1));
            data[index].tampilkanData();
        }
    }


    public void tambahAntrian(krsMahasiswa20 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public krsMahasiswa20 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        
        krsMahasiswa20 mhs = data[front];
        front = (front + 1) % max;
        size--;
        acc++;
        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.printf("%-10s %-20s %-10s %-10s\n", "NIM", "NAMA", "PRODI", "KELAS");
            data[front].tampilkanData();
            data[front+1].tampilkanData();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        data[rear-1].tampilkanData();
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int GetAcc() {
        return acc;
    }

    public int getNotAcc() {
        return 30 - acc;
    }
}
