/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Promo {

    String kategori, nama;
    int diskon, kuota;

    public Promo() {
    }

    Promo(String kt, int d, String n, int k) {
        kategori = kt;
        diskon = d;
        nama = n;
        kuota = k;
    }
}
