/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShellSortTest;

import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data: ");
        int jum = sc.nextInt();
        int a[] = new int[jum];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Masukkan Nilai Index Ke-" + i);
            a[i] = sc.nextInt();
        }
        ShellSort urut = new ShellSort(a, jum);
        System.out.println("Data sebelum urut");
        urut.tampilData();
        urut.shellSort();
        System.out.println("Data sesudag urut dengan Shell Sort (ASC)");
        urut.tampilData();
    }
}
