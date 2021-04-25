/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author iqbal
 */
public class Queue {

    int max, size, front, rear;
    Mahasiswa[] antrian;

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        antrian = new Mahasiswa[max];
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

    public void Enqueue(Mahasiswa data) {
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
            antrian[rear] = data;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = antrian[front];
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

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nim + " " + antrian[i].nama + " "
                        + antrian[i].absen + " " + antrian[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nim + " " + antrian[i].nama + " "
                    + antrian[i].absen + " " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Element terdepan: " +antrian[front].nim + " " + antrian[front].nama + " "
                    + antrian[front].absen + " " + antrian[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Element terakhir: " + antrian[rear].nim + " " + antrian[rear].nama + " "
                    + antrian[rear].absen + " " + antrian[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekPosition(String nim) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int index = -1;
            int i = front;
            int urut = 1;
            while (i != rear) {
                if (nim.equalsIgnoreCase(antrian[i].nim)) {
                    index = i;
                    break;
                }
                urut++;
                i = (i + 1) % max;
            }
            if (nim.equalsIgnoreCase(antrian[rear].nim)) {
                index = rear;
            }
            if (index == -1) {
                System.out.println("Data yang anda cari tidak ditemukan");
            } else {
                System.out.println(antrian[index].nim + " " + antrian[index].nama + " "
                    + antrian[index].absen + " " + antrian[index].ipk + " berada pada antrian ke-" + urut);
            }
        }
    }
    
    public void peekAt(int position) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            if (position > size){
                System.out.println("No antrian tidak tersedia");
            } else {
                int urut = front + position - 1;
                if (urut > max - 1){
                    urut %= max;
                }
                System.out.println(antrian[urut].nim + " " + antrian[urut].nama + " "
                    + antrian[urut].absen + " " + antrian[urut].ipk);
            }
        }
    }
}
