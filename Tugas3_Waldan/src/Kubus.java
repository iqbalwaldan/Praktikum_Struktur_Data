/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Kubus {

    public float sisi;

    public Kubus() {
    }

    public Kubus(float s) {
        sisi = s;
    }

    public float hitungLuasPermukaan(float s) {
        return 6 * s;
    }

    public float hitungVolume(float s) {
        return s * s * s;
    }

    public void tampil(float s) {
        System.out.println("Luas Permukaan Kubus = " + hitungLuasPermukaan(s));
        System.out.println("Volume Kubus = " + hitungVolume(s));
    }
}
