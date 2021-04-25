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
public class Stack {

    int size;
    int top;
    char data[];

    public Stack(int size) {
        this.size = size;
        data = new char[size];
        top = -1;
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(char dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }

    }

    public void membalikkan(String kal) {
        for (int i = 0; i < size; i++) {
            char dt = kal.charAt(i);
            push(dt);
        }
    }

    public void print() {
        System.out.println("Hasil: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i]);
        }
    }
}
