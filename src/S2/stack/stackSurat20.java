package S2.stack;

public class stackSurat20 {
    surat20 [] surat;
    int size,top;

    public stackSurat20(int size) {
        this.size = size;
        surat = new surat20[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(surat20 surat) {
        if (!isFull()) {
            top++;
            this.surat[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public surat20 pop() {
        if (!isEmpty()) {
            surat20 s = this.surat[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dinilai.");
            return null;
        }
    }

    public surat20 peek() {
        if (!isEmpty()) {
            return this.surat[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public surat20 Search(String nama) {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (this.surat[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    return this.surat[i];
                }
            }
            System.out.println("Surat tidak ditemukan");
            return null;
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

}
