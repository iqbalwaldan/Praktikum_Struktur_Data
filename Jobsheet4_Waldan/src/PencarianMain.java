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
public class PencarianMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // mengimputkan data
        System.out.print("Masukkan banyak data yang di input: ");
        double[] data = new double[sc.nextInt()];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan data index ke-" + i + ": ");
            data[i] = sc.nextDouble();
        }
        // megurutkan data
        double b = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < (data.length-i); j++) {
                if (data[j-1] > data[j]){
                    b = data[j-1];
                    data[j-1] = data[j];
                    data[j] = b;
                }
            }
        }
        OrderedSearch os = new OrderedSearch(data);
        System.out.println("Isi elemen array: ");
        os.tampilkan();
        double key = 3.12;
        int index = os.cari(key);
        if (index != 1) {
            System.out.println("Data " + key + " pada index " + index);
        } else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
}
