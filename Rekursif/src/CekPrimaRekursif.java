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
public class CekPrimaRekursif {
    static int cekBil2(int bil1, int bil2) {
        if (bil2 == 1) {
            return 1;
        } else if (bil1 % bil2 == 0) {
            return 1 + cekBil2(bil1, bil2 - 1);
        }
        return cekBil2(bil1, bil2 - 1);
    }
    static void cekBil1(int bil1) {
        boolean x;
        if (bil1 > 1) {
            x = cekBil2(bil1, bil1) == 2;
        } else {
            x = false;
        }
        if (x) {
            System.out.printf("%d adalah Bilangan Prima\n", bil1);
        } else {
            System.out.printf("%d Bukan Bilangan Prima\n", bil1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan yang akan di cek: ");
        int bil = sc.nextInt();
        cekBil1(bil);
    }
}
