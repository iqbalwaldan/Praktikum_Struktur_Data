/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Obat {

    public String nama;
    public String kategori;
    public int stok;
    public int jumlah;

    public Obat(String n, String k, int s, int j) {
        nama = n;
        kategori = k;
        stok = s;
        jumlah = j;
    }

    public void tampil() {
        System.out.println("Nama Obat: " + nama);
        System.out.println("Kategori Obat: " + kategori);
        System.out.println("Stok Obat: " + stok);
        System.out.println("Jumlah Obat Terjual: " + jumlah);
        System.out.println("Sisa Stok Obat: " + menghitungSisa(stok, jumlah));
    }

    public int menghitungSisa(int s, int j) {
        return s - j;
    }

    public int cariObatTidakTerjual(Obat obArray[]) {
        int x = 0, y = 0;
        for (int i = 0; i < obArray.length; i++) {
            int sisa = menghitungSisa(obArray[i].stok, obArray[i].jumlah);
            if (sisa > x) {
                x = sisa;
                y = i;
            }
        }
        return y;
    }
}
