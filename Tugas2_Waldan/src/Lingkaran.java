/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Lingkaran {

    double r;

    Lingkaran(double jar) {
        r = jar;
    }

    double hitungLuas() {
        double luas = 3.14 * r * r;
        return luas;
    }

    double hitungKeliling() {
        double keliling = 2 * 3.14 * r;
        return keliling;
    }

    void tampil() {
        System.out.println("Luas Lingkaran = " + hitungLuas());
        System.out.println("Keliling Lingkaran = " + hitungKeliling());
    }
}
