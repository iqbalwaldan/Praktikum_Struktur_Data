/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Peminjaman {

    int id, lamaPinjam, hargaSewa;
    String namaMember, namaGame;

    Peminjaman(int i, int lp, int hs, String nm, String ng) {
        id = i;
        lamaPinjam = lp;
        hargaSewa = hs;
        namaMember = nm;
        namaGame = ng;
    }

    int totalHarga(int lp, int h) {
        return lp * h;
    }

    void tampil() {
        System.out.println("Id Member = " + id);
        System.out.println("Nama Member = " + namaMember);
        System.out.println("Nama Game = " + namaGame);
        System.out.println("Harga Sewa Perhari = " + hargaSewa + "/hari");
        System.out.println("Lama Pinjam = " + lamaPinjam + " Hari");
        System.out.println("Total Pembayaran = Rp" + totalHarga(lamaPinjam, hargaSewa));
    }
}
