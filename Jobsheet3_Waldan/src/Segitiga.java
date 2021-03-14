/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Segitiga {

    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }
    
    public Segitiga(){
        
    }

    public int hitungLuas(int a, int t) {
        return a * t / 2;
    }

    public int hitungKeliling(int a) {
        return a * 3;
    }
}
