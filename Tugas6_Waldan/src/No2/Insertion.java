/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author iqbal
 */
public class Insertion {

    Siswa[] data;
    int jumData;

    Insertion(int jmlData) {
        jumData = jmlData;
        data = new Siswa[jmlData];
    }

    void masukkanData(Siswa br, int index) {
        data[index] = br;
    }

    void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.println(data[i].nama + " " + data[i].nilaiA + " " + data[i].nilaiB + " " + data[i].nilaiC + " " + data[i].total);
        }
        System.out.println("");
    }

    void hitungTotal() {
        for (int i = 0; i < data.length; i++) {
            data[i].total += data[i].nilaiA + data[i].nilaiB + data[i].nilaiC;
        }
    }

    void insertion() {
        for (int i = 1; i <= data.length - 1; i++) {
            Siswa temp = data[i];
            int st = data[i].total;
            int j = i - 1;
            while (j >= 0 && data[j].total < st) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    void tampilSiswaTerbaik() {
        this.insertion();
        int count = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(count + ". " + data[i].nama + ", Total = " + data[i].total);
        }
    }
}
