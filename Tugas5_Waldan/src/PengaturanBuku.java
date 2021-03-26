/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class PengaturanBuku {

    Buku bk[] = new Buku[4];
    int id;

    void tambah(Buku x) {
        if (id < bk.length) {
            bk[id] = x;
            id++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Buku b : bk) {
            b.tampilIdentitas();
        }
    }

    double konfersiUkuranBuku(String x) {
        double tinggi = 0;
        if (x.equalsIgnoreCase("A4")) {
            tinggi = 29.7;
        } else if (x.equalsIgnoreCase("B2")) {
            tinggi = 70.7;
        } else if (x.equalsIgnoreCase("B3")) {
            tinggi = 50;
        } else if (x.equalsIgnoreCase("B5")) {
            tinggi = 25;
        } else {
            tinggi = 0;
        }
        return tinggi;
    }

    void mengurutkanHalamanBuku() {
        for (int i = 0; i < bk.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < bk.length; j++) {
                if (bk[j].halaman < bk[min].halaman) {
                    min = j;
                }
            }
            Buku temp = bk[i];
            bk[i] = bk[min];
            bk[min] = temp;
        }
    }

    void mengurutkanUkuranBuku() {
        for (int i = 0; i < bk.length - 1; i++) {
            for (int j = 1; j < bk.length - i; j++) {
                if (konfersiUkuranBuku(bk[j].ukuran) < konfersiUkuranBuku(bk[j - 1].ukuran)) {
                    Buku tmp = bk[j];
                    bk[j] = bk[j - 1];
                    bk[j - 1] = tmp;
                }
            }
        }
    }
}
