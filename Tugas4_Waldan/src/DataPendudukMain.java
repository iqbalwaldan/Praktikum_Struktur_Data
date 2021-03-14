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
public class DataPendudukMain {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner huruf = new Scanner(System.in);
        System.out.print("Masukkan jumlah penduduk: ");
        int jmlh = angka.nextInt();
        String[][] data = new String[jmlh][4];
        int[] urut = new int[jmlh];
        int x = 1;
        for (int i = 0; i < data.length; i++) {
            urut[i] = x++;
            System.out.println("Penduduk Ke-" + urut[i]);
            System.out.print("NIK\t\t: ");
            data[i][0] = huruf.nextLine();
            System.out.print("Nama\t\t: ");
            data[i][1] = huruf.nextLine();
            System.out.print("Alamat\t\t: ");
            data[i][2] = huruf.nextLine();
            System.out.print("Jenis Kelamin\t: ");
            data[i][3] = huruf.nextLine();
            System.out.println("");
        }
        System.out.println("");
        DataPenduduk dp = new DataPenduduk(data, urut);
        dp.menampilkanArray();
        System.out.println("\n--- CARI DATA PENDUDUK ---");
        System.out.print("Masukkan data yang dicari: ");
        String key = huruf.nextLine();
        dp.mencariData(key);
    }
}
