/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Queue {

    int max, size, front, rear;
    Customer[] antrian;

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        antrian = new Customer[max];
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

    public void Enqueue(Customer data) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
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

    public void Dequeue(int teller) {
        Customer data;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Customer dengan Nama");
            if (size <= teller) {
                teller = size;
            }
            for (int i = 1; i <= teller; i++) {
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
                if (!"".equals(data.noRekening) && !"".equals(data.nama)) {
                    System.out.println(i + " " + data.nama);
                }
            }
            System.out.println("Selesai Dilayani");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            System.out.println("Daftar Antrian Customer: ");
            while (i != rear) {
                System.out.println(i + " " + antrian[i].noRekening + " " + antrian[i].nama);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].noRekening + " " + antrian[i].nama);
            System.out.println("Jumlah Antrian Custemer = " + size);
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Customer Antrian terdepan: " + antrian[front].noRekening + " " + antrian[front].nama);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void jumalahAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                i = (i + 1) % max;
            }
            System.out.println("Jumlah Antrian Customer = " + size);
        }
    }
}
