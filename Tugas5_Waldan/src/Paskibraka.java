/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Paskibraka {

    String nama, kelas;
    int tinggi;

    Paskibraka(String a, String b, int c) {
        nama = a;
        kelas = b;
        tinggi = c;
    }
    void tampilIdentitas(){
        System.out.println("Nama = "+nama);
        System.out.println("Kelas = "+kelas);
        System.out.println("Tinggi = "+tinggi);
    }
}
