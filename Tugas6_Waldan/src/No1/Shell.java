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
public class Shell {

    public Barang[] data;
    public int jumData;

    public Shell(int jmlData) {
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

    void shellSort() {
        int interval;
        for (interval = jumData / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < jumData; i += 1) {
                Barang temp = data[i];
                int st = data[i].stok;
                int j;
                for (j = i; j >= interval && data[j - interval].stok < st; j -= interval) {
                    data[j] = data[j - interval];
                }
                data[j] = temp;
            }
        }
    }
}
