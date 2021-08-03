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
public class PenjumlahanRekursif {

    static int jumlah(int a) {
        int total;
        if (a == 1) {
            total = 1;
        } else {
            total = a + jumlah(a - 1);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int f = sc.nextInt();
        System.out.printf("Hasil Penjumlahan: %d\n", jumlah(f));
    }
}
