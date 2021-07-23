/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class DaftarPromo {

    Promo listPro[] = new Promo[3];
    int idx;
    static Promo m = new Promo();

    public DaftarPromo() {
    }

    void tambah(Promo m) {
        if (idx < listPro.length) {
            listPro[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    int cari(String kode) {
        int index = -1;
        for (int i = 0; i < listPro.length; i++) {
            if (kode.equalsIgnoreCase(listPro[i].nama)) {
                index = i;
            }
        }
        return index;
    }

    void tampilCari(int kode) {
        System.out.println("Detail Promo");
        System.out.println("Kategori\t|Diskon\t\t|Nama\t\t\t|Kuota");
        System.out.printf("%s \t %d Persen \t %s \t %d\n", listPro[kode].kategori, listPro[kode].diskon, listPro[kode].nama, listPro[kode].kuota);
    }

    void kurangiStok(int index, int jumlah) {
        if (listPro[index].kuota >= jumlah) {
            listPro[index].kuota -= jumlah;
            System.out.println("==>>> Semalamat!!! Promo "+ listPro[index].nama +" Diskon "+ listPro[index].diskon +"%" + " Berhasil Digunakan Sebanyak " + jumlah);
        } else {
            System.out.println("==!!! Maaf Kuota Promo Melebihi Batas");
        }
    }

    void urutkanNama() {
        for (int i = 0; i < (listPro.length - 1); i++) {
            int idxMin = i;
            for (int j = i + 1; j < listPro.length; j++) {
                if (listPro[j].nama.compareToIgnoreCase(listPro[idxMin].nama) < 0) {
                    idxMin = j;
                }
            }
            Promo temp = listPro[i];
            listPro[i] = listPro[idxMin];
            listPro[idxMin] = temp;
        }
    }

    void tampil() {
        System.out.println("Daftar Promo Yang Tersedia");
        for (Promo Pro : listPro) {
            if (Pro.kuota > 0) {
                System.out.println("--------------------------------------------");
                System.out.println("Kategori\t|Diskon\t\t|Nama\t\t\t|Kuota");
                System.out.printf("%s \t %d Persen \t %s \t %d\n", Pro.kategori, Pro.diskon, Pro.nama, Pro.kuota);
            }
        }
        System.out.println("--------------------------------------------");
    }
}
