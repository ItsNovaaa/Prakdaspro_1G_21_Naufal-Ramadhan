package S2.pertemuan13;

public class mainDoubleLinklist {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList20 dll = new DoubleLinkedList20();

        // Percobaan 1 operations
        // dll.print();
        // System.out.println("Size: " + dll.size());
        // System.out.println("==============================");
        // dll.addFirst(3);
        // dll.addLast(4);
        // dll.addFirst(7);
        // dll.print();
        // System.out.println("Size: " + dll.size());
        // System.out.println("==============================");
        // dll.add(40, 1);
        // dll.print();
        // System.out.println("Size: " + dll.size());
        // System.out.println("==============================");
        // dll.clear();
        // dll.print();
        // System.out.println("Size: " + dll.size());
        // System.out.println("=============================="); // Added separator

    //     // Percobaan 2 operations
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("==============================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("==============================");
        dll.removeLast();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("==============================");
        dll.remove(1);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=============================="); // Added separator

    //     // Percobaan 3 operations
    //     dll.clear(); // Clearing list as per Praktikum 3 scenario
    //     dll.print();
    //     System.out.println("Size: " + dll.size());
    //     System.out.println("==============================");
    //     dll.addFirst(3);
    //     dll.addLast(4);
    //     dll.addFirst(7);
    //     dll.print();
    //     System.out.println("Size: " + dll.size());
    //     System.out.println("==============================");
    //     dll.add(40, 1);
    //     dll.print();
    //     System.out.println("Size: " + dll.size());
    //     System.out.println("==============================");
    //     System.out.println("Data awal pada Linked Lists adalah: " + dll.getFirst());
    //     System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
    //     System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
    }
}
