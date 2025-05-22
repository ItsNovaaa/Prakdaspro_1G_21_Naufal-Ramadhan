package S2.pertemuan11;

// File: QueueLinkedList.java
public class QueueLinkedList {
    Node20 front; 
    Node20 rear;  
    int size;
    int capacity; 

    public QueueLinkedList(int capacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.capacity = capacity; 
    }

    // d. Cek antrian penuh
    public boolean isFull() {
        if (size == capacity) { 
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return front == null || size == 0;
    }

    public void enqueue(Maha20 dataMahasiswa) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh, tidak bisa menambahkan mahasiswa baru.");
            return;
        }
        Node20 newNode = new Node20(dataMahasiswa,null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(dataMahasiswa.nama + " telah ditambahkan ke dalam antrian.");
    }

    public Maha20 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa untuk dipanggil.");
            return null;
        }
        Maha20 dequeuedMahasiswa = front.data;
        front = front.next;
        if (front == null) { 
            rear = null;
        }
        size--;
        System.out.println(dequeuedMahasiswa.nama + " telah dipanggil dari antrian.");
        return dequeuedMahasiswa;
    }

    public Maha20 peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        return front.data;
    }

    public Maha20 peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        return rear.data;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }
        System.out.println("Isi Antrian Saat Ini (dari depan ke belakang):");
        Node20 current = front;
        int i = 1;
        while (current != null) {
            current.data.tampil();
            current = current.next;
            i++;
        }
        System.out.println("Total mahasiswa dalam antrian: " + size);
    }
}