package S2.stack;

public class stackKonversi {
    int [] tumpukanBiner;
    int size,top;

   public stackKonversi() {
        size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int nilai) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambahkan nilai lagi.");
        } else {
            top++;
            tumpukanBiner[top] = nilai;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada nilai untuk dinilai.");
            return -1;
        } else {
            int nilai = tumpukanBiner[top];
            top--;
            return nilai;
        }
    }
}
