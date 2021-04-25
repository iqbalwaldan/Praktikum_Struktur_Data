/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author iqbal
 */
public class Queue {

    int max, size, front, rear;
    int[] Q;

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Element terdepan: " + Q[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil doosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void peekPosition(int data) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int index = -1;
            int i = front;
            int urut = 1;
            while (i != rear) {
                if (data == Q[i]) {
                    index = i;
                    break;
                }
                urut++;
                i = (i + 1) % max;
            }
            if (data == Q[rear]) {
                index = rear;
            }
            if (index == -1) {
                System.out.println("Data yang anda cari tidak ditemukan");
            } else {
                System.out.println("Data berada pada index ke-" + index + " dan urutan ke-" + urut);
            }
        }
    }

    public void peekAt(int position) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int data = Q[position];
            int index = -1;
            int i = front;
            int urut = 1;
            while (i != rear) {
                if (data == Q[i]) {
                    index = i;
                    break;
                }
                urut++;
                i = (i + 1) % max;
            }
            if (data == Q[rear]) {
                index = rear;
            }
            if (index == -1) {
                System.out.println("null");
            } else {
                if (index == front && index == rear) {
                    System.out.println("Data pada index ke-" + position + " adalah " + data + " Sebagai FRONT dan REAR dari Queue");
                } else if (index == front) {
                    System.out.println("Data pada index ke-" + position + " adalah " + data + " Sebagai FRONT dari Queue");
                } else if (index == rear) {
                    System.out.println("Data pada index ke-" + position + " adalah " + data + " Sebagai REAR dari Queue");
                } else {
                    System.out.println("Data pada index ke-" + position + " adalah " + data);
                }
            }
        }
    }
}
