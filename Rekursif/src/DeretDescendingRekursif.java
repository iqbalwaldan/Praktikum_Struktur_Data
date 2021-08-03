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
public class DeretDescendingRekursif {

    static void tampil(int a) {
        if (a >= 0) {
            System.out.print(a + " ");
            tampil(a - 1);
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan n: ");
        int bil = sc.nextInt();
        tampil(bil);
    }
}
