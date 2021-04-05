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

    String kodeBrg, namaBrg;
    int hargaBrg, stokBrg, jualBrg;

    public Barang() {
    }

    Barang(String k, String n, int s, int h, int j) {
        kodeBrg = k;
        namaBrg = n;
        hargaBrg = h;
        stokBrg = s;
        jualBrg = j;
    }

    void tampilBarang() {
        System.out.println("--------------------------------------------");
        System.out.println("Kode\t|Nama\t|Stok\t|Harga\t|Jual");
        System.out.printf("%s \t| %s \t| %d \t| %d \t| %d\n", kodeBrg, namaBrg, stokBrg, hargaBrg,jualBrg);
        System.out.println("--------------------------------------------");
    }
}
