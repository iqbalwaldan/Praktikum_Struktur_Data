/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author ACER
 */
public class DoubleLinkedList {

    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim, String nma, Double nil) {
        if (isEmpty()) {
            head = new Node(null, nim, nma, nil, null);
        } else {
            Node newNode = new Node(null, nim, nma, nil, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String nim, String nma, Double nil) {
        if (isEmpty()) {
            addFirst(nim, nma, nil);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nim, nma, nil, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String nim, String nma, Double nil, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nim, nma, nil);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, nim, nma, nil, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, nim, nma, nil, current);
                newNode.prev = newNode;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("NIM\t\t Nama \t\t IPK");
            while (tmp != null) {
                System.out.print(tmp.nim + "\t\t ");
                System.out.print(tmp.nama + "\t\t ");
                System.out.print(tmp.nil + "\t");
                System.out.println("");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indexs diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        return (head.nim + head.nama + head.nil);
    }

    public String getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return (tmp.nim + tmp.nama + tmp.nil);
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return (tmp.nim + tmp.nama + tmp.nil);
    }

    public void cari(String cari) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        Node tmp = head;
        while (!tmp.nim.equalsIgnoreCase(cari)) {
            tmp = tmp.next;
        }
        System.out.println(tmp.nim + " " + tmp.nama + " " + tmp.nil);
    }

    public void sort() throws Exception {
        Node current = null, index = null;
        String tmpnim, tmpnama; 
        Double tmpnil;
        if (head == null) {
            throw new Exception("LinkedList Kosong");
        } else {
            for(current = head; current.next != null; current = current.next) {
                for(index = current.next; index != null; index = index.next) {
                    if(current.nil < index.nil) {
                        tmpnim = current.nim;
                        tmpnama = current.nama;
                        tmpnil = current.nil;
                        current.nim = index.nim;
                        current.nama = index.nama;
                        current.nil = index.nil;
                        index.nim = tmpnim;
                        index.nama = tmpnama;
                        index.nil = tmpnil;
                    }  
                }  
            }  
        }  
    
    }

    public void sSort() throws Exception {
        Node current = head, index = current.next, tmpc = null, tmpi = null;
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        } else {
            //untuk head
            while (index != null) {
                if (current.nil < index.nil) {
                    tmpc = current;
                    tmpi = index;
                    current = tmpi;
                    index = tmpc;
                    current.prev = null;
                    current.next = tmpc.next;
                    current.next.prev = current;
                    index.prev = tmpi.prev;
                    index.prev.next = index;
                    index.next = tmpi.next;
                    if (index.next != null) {
                        index.next.prev = index;
                    }
                    head = current;
                    index = index.next;
                } else {
                    index = index.next;
                }
            }
            //utuk setelah head
            current = head.next;
            index = current.next;
            while (true) {
                while (index != null) {
                    if (current.nil < index.nil) {
                        tmpc = current;
                        tmpi = index;
                        current = tmpi;
                        index = tmpc;
                        current.prev = tmpc.prev;
                        current.prev.next = current;
                        current.next = tmpc.next;
                        current.next.prev = current;
                        index.prev = tmpi.prev;
                        index.prev.next = index;
                        index.next = tmpi.next;
                        if (index.next != null) {
                            index.next.prev = index;
                        }
                        index = index.next;
                    } else {
                        index = index.next;
                    }
                }
                if (current.next.next != null) {
                    current = current.next;
                    index = current.next;
                } else {
                    break;
                }
            }
        }
    }
}