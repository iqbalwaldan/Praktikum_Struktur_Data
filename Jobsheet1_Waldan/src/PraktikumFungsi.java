/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class PraktikumFungsi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 0, c = 1, i = 0, n;
        System.out.print("Masukkan Panjang Deret Fibonacci: ");
        n = sc.nextInt();
        System.out.println("Konsep Perulangan");
        while (i < n) {
            if (i == 0) {
                System.out.print(0 + ", ");
            } else {
                System.out.print(c + ", ");
                c = a + b;
                b = a;
                a = c;
            }
            i++;
        }
        System.out.println("\nFungsi Rekursif");
        tampilDeret(1, n);
    }

    static int deretFibonacci(int x) {
        if (x == 1) {
            return 0;
        } else if (x == 2) {
            return 1;
        } else {
            return (deretFibonacci(x - 1) + deretFibonacci(x - 2));
        }
    }

    static void tampilDeret(int y, int batas) {
        if (y > batas) {
            System.out.println();
        } else {
            System.out.print(deretFibonacci(y) + ", ");
            tampilDeret(y + 1, batas);
        }
    }
}
