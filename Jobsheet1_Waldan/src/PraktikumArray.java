/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class PraktikumArray {

    public static void main(String[] args) {
        int[][] stok = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int[] harga = {75_000, 50_000, 60_000, 10_000};
        String[] nama = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int total = 0;
        System.out.println("A. Total Stok Bunga Di Seluruh Cabang Berdasarkan Jenis Bunga");
        for (int i = 0; i < stok[0].length; i++) {
            for (int j = 0; j < stok.length; j++) {
                total += stok[j][i];
            }
            System.out.println(nama[i] + " = " + total);
            total = 0;
        }
        System.out.println("\nB. Total Pendapatan RoyalGarden 1 Jika Stok Bunga Aglonema -1, Keladi -2, Alocasia -0, dan Mawar -5");
        stok[0][0] -= 1;
        stok[0][1] -= 2;
        stok[0][2] -= 0;
        stok[0][3] -= 5;
        for (int i = 0; i < stok[0].length; i++) {
            total += stok[0][i]*harga[i];
        }
        System.out.println("Total pendapatan RoyalGerden 1 = Rp"+total);
    }
}
