/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class DaftarAnggotaPaskibraka {

    Paskibraka listPeserta[] = new Paskibraka[10];
    int id;

    void tambah(Paskibraka m) {
        if (id < listPeserta.length) {
            listPeserta[id] = m;
            id++;
        } else {
            System.out.println("Data sudah penuh!!");
        }

    }

    void tampil() {
        for (Paskibraka m : listPeserta) {
            m.tampilIdentitas();
        }
    }

    void sorting() {
        for (int i = 0; i < listPeserta.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listPeserta.length; j++) {
                if (listPeserta[j].tinggi > listPeserta[idxMin].tinggi) {
                    idxMin = j;
                }
            }
            Paskibraka temp = listPeserta[idxMin];
            listPeserta[idxMin] = listPeserta[i];
            listPeserta[i]= temp;
        }
    }
    
    void cekTinggi(){
        for (Paskibraka m : listPeserta) {
            if(m.tinggi>=170){
            m.tampilIdentitas();
            }
        }
    }
}
