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
public class Pembelian {

    int kode, metode;
    float harga;
    Pembelian prev, next;

    public Pembelian() {
    }

    Pembelian(Pembelian prev, int k, float h, int m, Pembelian next) {
        this.prev = prev;
        kode = k;
        metode = m;
        harga = h;
        this.next = next;
    }
}
