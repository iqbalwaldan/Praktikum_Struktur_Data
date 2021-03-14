/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Tanah {

    public int panjang;
    public int lebar;

    public Tanah() {

    }

    public Tanah(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public int menghitungLuas(int p, int l) {
        return p * l;
    }
    // modifikasi soal no 2
    public void mengurutkanLuasTanah(Tanah tArray[]) {
        int x = 0, y = 0;
        for (int i = 0; i < tArray.length; i++) {
            int luas = menghitungLuas(tArray[i].panjang, tArray[i].lebar);
            if (luas > x) {
                x = luas;
                y = i;
            }
        }
        y += 1;
        System.out.println("Tanah Terluas: Tanah " + y + ", dengan luas: " + menghitungLuas(tArray[y - 1].panjang, tArray[y - 1].lebar));
    }
}
