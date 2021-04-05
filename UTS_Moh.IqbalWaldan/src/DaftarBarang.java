/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class DaftarBarang {

    Barang listBrg[] = new Barang[3];
    int idx;
    static Barang m = new Barang();

    public DaftarBarang() {
    }

    void tambah(Barang m) {
        if (idx < listBrg.length) {
            listBrg[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    int cari(String kode) {
        int index = -1;
        for (int i = 0; i < listBrg.length; i++) {
            if (kode.equalsIgnoreCase(listBrg[i].kodeBrg)) {
                index = i;
            }
        }
        return index;
    }

    void kurangiStok(int index, int jumlah) {
        listBrg[index].stokBrg -= jumlah;
        listBrg[index].jualBrg += jumlah;
    }

    void sortPenjualan() {
        for (int i = 0; i < listBrg.length - 1; i++) {
            for (int j = 1; j < listBrg.length - i; j++) {
                if (listBrg[j].jualBrg > listBrg[j - 1].jualBrg) {
                    Barang tmp = listBrg[j];
                    listBrg[j] = listBrg[j - 1];
                    listBrg[j - 1] = tmp;
                }
            }
        }

    }
    
    void sortStok(){
        for (int i = 0; i < (listBrg.length - 1); i++) {
            int idxMin = i;
            for (int j = i + 1; j < listBrg.length; j++) {
                if (listBrg[j].stokBrg > listBrg[idxMin].stokBrg) {
                    idxMin = j;
                }
            }
            Barang temp= listBrg[i];
            listBrg[i]= listBrg[idxMin];
            listBrg[idxMin] = temp;

        }
    }

    void tampil() {
        for (Barang m : listBrg) {
            m.tampilBarang();
            System.out.println("----------------------");
        }
    }
}
