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
public class PraktikumPerulangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nim, n, ulang, sisa;
        String[] hari = {"Senin ", "Selasa ", "Rabu ", "Kamis ", "Jumat ", "Sabtu ", "Minggu "};
        System.out.print("Masukkan Nim: ");
        nim = sc.nextInt();
        n = nim % 100;
        System.out.println("==============================");
        if (n < 10) {
            n += 10;
        }
        System.out.println("n = " + n);
        ulang = n / 7;
        sisa = n % 7;
        if (ulang > 0) {
            for (int i = 0; i < ulang; i++) {
                for (int j = 0; j < hari.length; j++) {
                    System.out.print(hari[j]);
                }
            }
            for (int i = 0; i < sisa; i++) {
                System.out.print(hari[i]);
            }
        } else if (ulang == 0) {
            for (int i = 0; i < sisa; i++) {
                System.out.print(hari[i]);
            }
        }
    }
}
