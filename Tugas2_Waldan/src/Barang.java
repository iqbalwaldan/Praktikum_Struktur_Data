/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Barang {

    String nama;
    int hargaSatuan, jumlah;

    Barang(String n, int hs, int j){
        nama = n;
        hargaSatuan = hs;
        jumlah = j;
    }
    
    int hitungHargaTotal(int hs, int j) {
        return hs * j;
    }

    int hitungDiskon() {
        int t = hitungHargaTotal(hargaSatuan, jumlah);
        if (t > 100_000) {
            t = (int) (t * 0.1);
        } else if (t > 50000) {
            t = (int) (t * 0.05);
        }
        return t;
    }
    
    int hitungHargaBayar(){
        int t = hitungHargaTotal(hargaSatuan, jumlah);
        return t - hitungDiskon();
    }
    
    void tampil(){
        System.out.println("Total barang = " + hitungHargaBayar());
    }
}
