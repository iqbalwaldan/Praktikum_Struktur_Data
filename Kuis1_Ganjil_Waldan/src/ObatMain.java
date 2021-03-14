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
public class ObatMain {

    public static void main(String[] args) {
        Scanner tulisan = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Obat yang Dijual: ");
        Obat[] obArray = new Obat[angka.nextInt()];
        System.out.println("\n>>> MENGIMPUTKAN DATA OBAT <<<");
        int x = 1;
        for (int i = 0; i < obArray.length; i++) {
            String n, k;
            int s, j;
            System.out.println("-->Masukkan Data Obat Ke " + x++);
            System.out.print("Nama Obat: ");
            n = tulisan.nextLine();
            System.out.print("Kategori Obat: ");
            k = tulisan.nextLine();
            System.out.print("Stok Obat: ");
            s = angka.nextInt();
            System.out.print("Jumlah Obat Terjual: ");
            j = angka.nextInt();
            obArray[i] = new Obat(n, k, s, j);
        }
        System.out.println("\n>>> MANAMPILKAN DATA OBAT <<<");
        x = 1;
        for (int i = 0; i < obArray.length; i++) {
            System.out.println("-->Data Obat Ke " + x++);
            obArray[i].tampil();
        }
        System.out.println();
        int kode = obArray[0].cariObatTidakTerjual(obArray);
        System.out.println("Obat yang Paling Banyak Tidak Terjual adalah obat " + obArray[kode].nama);
        System.out.println("Data Lebih Detailnya: ");
        obArray[kode].tampil();
    }
}
