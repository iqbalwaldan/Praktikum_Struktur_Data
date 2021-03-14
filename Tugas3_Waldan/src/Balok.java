/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Balok {

    public float panjang;
    public float lebar;
    public float tinggi;

    public Balok() {
    }

    public Balok(float p, float l, float t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public float hitungLuasPermukaan(float p, float l, float t) {
        return 2*((p * l) + (p * t) + (l * t));
    }

    public float hitungVolume(float p, float l, float t) {
        return p * l * t;
    }

    public void tampil(float p, float l, float t) {
        System.out.println("Luas Permukaan Kubus = " + hitungLuasPermukaan(p, l, t));
        System.out.println("Volume Kubus = " + hitungVolume(p, l, t));
    }
}
