/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Tabung {

    public float jari;
    public float tinggi;

    public Tabung() {
    }

    public Tabung(float r, float t) {
        jari = r;
        tinggi = t;
    }

    public float hitungLuasPermukaan(float r, float t) {
        return 2 * 3.14F * r * (r + t);
    }

    public float hitungVolume(float r, float t) {
        return 3.14F * r * r * t;
    }

    public void tampil(float r, float t) {
        System.out.println("Luas Permukaan Kubus = " + hitungLuasPermukaan(r, t));
        System.out.println("Volume Kubus = " + hitungVolume(r, t));
    }
}
