/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author iqbal
 */
public class Insertion {

    public Barang[] data;
    public int jumData;

    public Insertion(int jmlData) {
        jumData = jmlData;
        data = new Barang[jmlData];
    }

    public void masukkanData(Barang br, int index) {
        data[index] = br;
    }

    void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.println(data[i].nama + " " + data[i].stok + " " + data[i].harga);
        }
        System.out.println("");
    }

    void insertion() {
        for (int i = 1; i <= data.length - 1; i++) {
            Barang temp = data[i];
            int st = data[i].stok;
            int j = i - 1;
            while (j >= 0 && data[j].stok < st) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }
}
