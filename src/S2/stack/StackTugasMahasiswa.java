package S2.stack;

// File: StackTugasMahasiswa.java
public class StackTugasMahasiswa {
    Mahasiswa[] stack;
    int size;
    int top;

    public StackTugasMahasiswa(int size) {
        this.size = size;
        stack = new Mahasiswa[size];
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

    public void push(Mahasiswa mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa pop() {
        if (!isEmpty()) {
            Mahasiswa m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa seeFirst() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void count() {
        if (!isEmpty()) {
            System.out.println("Jumlah tugas yang dikumpulkan: " + (top + 1));
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
        }
    }


    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) { 
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
            System.out.println("");
        } 
    }

    public String konversiDesimalKeBiner(int nilai) {
        stackKonversi stackKonversi = new stackKonversi();

        while (nilai > 0) {
            int sisa = nilai % 2;
            stackKonversi.push(sisa);
            nilai = nilai / 2;
        }

        String biner = "";
        while (!stackKonversi.isEmpty()) { 
            biner += stackKonversi.pop();
        }
        return biner;
    }
}