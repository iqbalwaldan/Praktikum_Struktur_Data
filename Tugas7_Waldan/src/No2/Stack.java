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
public class Stack {
    int size;
    int top;
    Struk data[];

    public Stack(int size) {
        this.size = size;
        data = new Struk[size];
        top = -1;
    }
    
    public boolean IsEmpety() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Struk dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpety()) {
            Struk x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.noTansaksi + " "
                    + x.tanggal + " " + x.jmlBarang + " " + x.totalHarga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Element teratas: " + data[top].noTansaksi + " "
                + data[top].tanggal + " " + data[top].jmlBarang + " "
                + data[top].totalHarga);
    }

    public void print() {
        System.out.println("Isi Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].noTansaksi + " " + data[i].tanggal
                    + " " + data[i].jmlBarang + " " + data[i].totalHarga);
        }
    }

    public void clear() {
        if (!IsEmpety()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
