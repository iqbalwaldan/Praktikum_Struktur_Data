// 15_MOH. IQBAL WALDAN
// MI1F

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iqbal
 */
public class Produk {

    String kode, jenis, provider;
    int nominal;
    Produk prev, next;

    public Produk() {
    }

    Produk(Produk prev, String k, String j, String p, int n, Produk next) {
        this.prev = prev;
        kode = k;
        jenis = j;
        provider = p;
        nominal = n;
        this.next = next;
    }
}
