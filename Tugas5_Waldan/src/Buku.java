/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Buku {

    String judul, ukuran;
    int halaman;

    Buku(String j, int h, String u) {
        judul = j;
        halaman = h;
        ukuran = u;
    }
    void tampilIdentitas(){
        System.out.println("Judul Buku = "+judul);
        System.out.println("Jumlah Halaman Buku = "+halaman);
        System.out.println("Ukuran Buku = "+ukuran);
    }
}
